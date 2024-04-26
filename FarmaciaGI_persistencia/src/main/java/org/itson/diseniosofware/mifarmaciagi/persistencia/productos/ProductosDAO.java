package org.itson.diseniosofware.mifarmaciagi.persistencia.productos;

import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import static com.mongodb.client.model.Filters.eq;
import com.mongodb.client.result.UpdateResult;
import org.bson.Document;
import org.itson.diseniosofware.mifarmaciagi.persistencia.Conexion.IConexion;
import org.itson.diseniosofware.mifarmaciagi.persistencia.Exception.PersistenciaException;
import org.itson.diseniosofware.mifarmaciagi.persistencia.entidades.Producto;

/**
 *
 * @author Hector Espinoza
 */
public class ProductosDAO implements IProductosDAO {

    MongoCollection<Producto> collection;

    public ProductosDAO(IConexion conexion) {
        MongoDatabase baseDatos = conexion.crearConexion();
        collection = baseDatos.getCollection("productos", Producto.class);
    }

    /**
     * Método el cual registra un proucto al inventario
     *
     * @param nuevoProducto producto a registrar
     * @return producto registrado
     * @throws en caso de no lograr registrar el producto
     */
    @Override
    public Producto registrarProducto(Producto nuevoProducto) throws PersistenciaException {

        collection.insertOne(nuevoProducto);
        return nuevoProducto;

    }

    /**
     * Método el cual actualiza un producto del inventario
     *
     * @param productoActualizar producto a actualizar
     * @return producto actualizado
     * @throws PersistenciaException en caso de no lograr actualizar el producto
     */
    @Override
    public Producto actualizarProducto(Producto productoActualizar) throws PersistenciaException {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    /**
     * Método el cual elimina un producto del inventario
     *
     * @param producto producto que se desea eliminar
     * @return producto eliminado
     * @throws PersistenciaException en caso de no eliminar el producto
     */
    @Override
    public Producto eliminarProducto(Producto producto) throws PersistenciaException {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    /**
     * Método el cual obtiene un producto del inventario
     *
     * @param producto producto que se desea obtener
     * @return producto que se obtiene
     */
    @Override
    public Producto obtenerProducto(Producto producto) {

        Producto productoEncontrado;

        productoEncontrado = collection.find(eq("codigo", producto.getCodigo())).first();

        if (productoEncontrado == null) {
            return null;
        }
        return productoEncontrado;
    }

    /**
     * Método el cual modifica con una suma la cantidad del producto del
     * inventario
     *
     * @param producto producto al que se le desea cambiar su cantidad en stock
     * @return producto con su cantidad actualizada
     * @throws PersistenciaException en caso de no lograr modificar la cantidad
     */
    @Override
    public void modificarCantidadProducto(Producto producto) throws PersistenciaException {
        Producto productoI = obtenerProducto(producto);

        if (productoI != null) {
            
            // Este if verifica que la suma o resta que se vaya a ejecutar no deje en cantidades negativas al producto
            if ((producto.getCantidad()>0) || (productoI.getCantidad()>=(producto.getCantidad()*-1))){
            
            
            UpdateResult updateResult = collection.updateOne(
                    eq("codigo", productoI.getCodigo()), new Document("$set", new Document()
             
                            .append("cantidad", productoI.getCantidad() + producto.getCantidad())));
            }else{
                throw new PersistenciaException ("Error: Cantidad insuficiente de stock");
            }
            

        } else {
            throw new PersistenciaException("Error: Este producto no se encuentra en el inventario");
        }

    }

}

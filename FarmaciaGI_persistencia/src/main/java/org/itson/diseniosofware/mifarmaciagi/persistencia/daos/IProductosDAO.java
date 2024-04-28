package org.itson.diseniosofware.mifarmaciagi.persistencia.daos;

import com.mongodb.client.result.UpdateResult;
import java.util.List;
import org.itson.diseniosofware.mifarmaciagi.persistencia.Exception.PersistenciaException;
import org.itson.diseniosofware.mifarmaciagi.persistencia.entidades.Producto;


/**
 *
 * @author Hector Espinoza
 */
public interface IProductosDAO {
    
    /**
     * Método el cual registra un proucto al inventario
     * @param nuevoProducto producto a registrar
     * @return producto registrado
     * @throws en caso de no lograr registrar el producto
     */
    public Producto registrarProducto (Producto nuevoProducto) throws PersistenciaException;
    
    /**
     * Método el cual actualiza un producto del inventario
     * @param productoActualizar producto a actualizar
     * @return producto actualizado 
     * @throws PersistenciaException en caso de no lograr actualizar el producto 
     */
    public Producto actualizarProducto (Producto productoActualizar) throws PersistenciaException;
    
    /**
     * Método el cual modifica con una suma la cantidad del producto del inventario
     * @param producto producto al que se le desea cambiar su cantidad en stock
     * @throws PersistenciaException en caso de no lograr encontrar el producto
     */
    public void modCantidadProducto (Producto producto) throws PersistenciaException;
    
    /**
     * Método el cual elimina un producto del inventario
     * @param producto producto que se desea eliminar
     * @return producto eliminado
     * @throws PersistenciaException en caso de no eliminar el producto 
     */
    public Producto eliminarProducto (Producto producto) throws PersistenciaException;
    
    /**
     * Método el cual obtiene un producto del inventario
     * @param producto producto que se desea obtener
     * @return producto que se obtiene
     */
    public Producto obtenerProducto (Producto producto);
    
    /**
     * Método el cual obtiene los productos semejantes a un nombre en la base de datos
     * @param producto producto que se desea encontrar
     * @return Lista de productos encontrados
     */
    public List <Producto> buscarProductosPorNombre (Producto producto);
    
    
}

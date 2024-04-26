package org.itson.diseniosofware.mifarmaciagi.persistencia.productos;

import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
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
    
    

    @Override
    public Producto registrarProducto(Producto nuevoProducto) throws PersistenciaException{
        
        
        collection.insertOne(nuevoProducto);
        return nuevoProducto;
        
                
        
        
    }

    @Override
    public Producto actualizarProducto(Producto productoActualizar) throws PersistenciaException{
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public Producto eliminarProducto(Producto producto) throws PersistenciaException{
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}

package org.itson.diseniosofware.mifarmaciagi.persistencia.productos;

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
     */
    public Producto registrarProducto (Producto nuevoProducto) throws PersistenciaException;
    
    public Producto actualizarProducto (Producto productoActualizar) throws PersistenciaException;
    
    public Producto eliminarProducto (Producto producto) throws PersistenciaException;
    
    
}

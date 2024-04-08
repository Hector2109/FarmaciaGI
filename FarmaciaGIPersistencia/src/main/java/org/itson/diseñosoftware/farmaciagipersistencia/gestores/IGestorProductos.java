package org.itson.diseñosoftware.farmaciagipersistencia.gestores;

import java.util.List;
import org.itson.diseñosoftware.farmaciagipersistencia.dtos.ProductoDTO;
import org.itson.diseñosoftware.farmaciagipersistencia.excepciones.PersistenciaException;

public interface IGestorProductos {

    public ProductoDTO obtenerProducto(ProductoDTO producto) throws PersistenciaException;

    public void agregarProducto(ProductoDTO producto) throws PersistenciaException;

    public void eliminarProducto(ProductoDTO producto) throws PersistenciaException;

    public void actualizarProducto(ProductoDTO producto) throws PersistenciaException;
    
    public void sumarCantidadProducto(ProductoDTO producto) throws PersistenciaException;

    public void restarCantidadProducto(ProductoDTO producto) throws PersistenciaException;

    public List<ProductoDTO> buscarProductosPorNombre(String nombre);

    public List<ProductoDTO> buscarProductosPorCodigo(String codigo);

    public List<ProductoDTO> obtenerProductos();
    
    public List<ProductoDTO> agregarProductosAVista(List<ProductoDTO> inventario, String filtro);

}

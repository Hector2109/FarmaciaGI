package org.itson.disenosoftware.farmaciagi_subsistema_productos;

import java.util.List;
import org.itson.disenosoftware.farmaciagi_dtos.ProductoDTO;
import org.itson.disenosoftware.farmaciagi_subsistema_productos.excepciones.GestorProductosException;

/**
 *
 * @author Mi FrmaciaGI
 */
public interface IGestorProductos {
    
    public ProductoDTO obtenerProducto(ProductoDTO producto);
    
    public void actualizarProducto(ProductoDTO productoActualizado)throws GestorProductosException;

    public List<ProductoDTO> buscarProductosPorNombre(String nombre);

    public List<ProductoDTO> buscarProductosPorCodigo(String codigo);

    public List<ProductoDTO> obtenerProductos();
    
}
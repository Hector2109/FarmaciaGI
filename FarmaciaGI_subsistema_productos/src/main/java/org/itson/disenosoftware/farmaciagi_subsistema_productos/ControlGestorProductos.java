package org.itson.disenosoftware.farmaciagi_subsistema_productos;

import java.util.List;
import org.itson.disenosoftware.farmaciagi_dtos.ProductoDTO;
import org.itson.disenosoftware.farmaciagi_subsistema_productos.excepciones.ControlProductosException;
import org.itson.diseñosoftware.farmaciagi_objetosNegocio.ProductoBO;
import org.itson.diseñosoftware.farmaciagi_objetosNegocio.excepciones.ObjetosNegocioException;

class ControlGestorProductos {

    private ProductoBO producto;
    
    public ControlGestorProductos() {
        producto = new ProductoBO();
    }

    public ProductoDTO obtenerProducto(ProductoDTO productoBuscado) {
        return producto.obtenerProducto(productoBuscado);
    }
    
    public void actualizarProducto(ProductoDTO productoActualizado) throws ControlProductosException {
        try {
            producto.actualizarProducto(productoActualizado);
        } catch (ObjetosNegocioException ex) {
            throw new ControlProductosException(ex.getMessage());
        }
    }

    public List<ProductoDTO> buscarProductosPorNombre(String nombre) {
        return producto.buscarProductosPorNombre(nombre);
    }

    public List<ProductoDTO> buscarProductosPorCodigo(String codigo) {
        return producto.buscarProductosPorCodigo(codigo);
    }

    public List<ProductoDTO> obtenerProductos() {
        return producto.obtenerProductos();
    }

}

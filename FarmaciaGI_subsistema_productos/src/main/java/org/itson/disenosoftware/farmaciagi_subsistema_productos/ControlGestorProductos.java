package org.itson.disenosoftware.farmaciagi_subsistema_productos;

import java.util.LinkedList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.itson.disenosoftware.farmaciagi_dtos.ProductoDTO;
import org.itson.disenosoftware.farmaciagi_subsistema_productos.excepciones.ControlProductosException;
import org.itson.diseñosoftware.farmaciagi_objetosNegocio.Producto;
import org.itson.diseñosoftware.farmaciagi_objetosNegocio.excepciones.ObjetosNegocioException;


class ControlGestorProductos {

    private Producto producto;
    
    public ControlGestorProductos() {
        producto = new Producto();
    }

    public ProductoDTO obtenerProducto(ProductoDTO productoBuscado) {
        return producto.getProducto(productoBuscado);
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

package org.itson.disenosoftware.farmaciagi_subsistema_productos;

import org.itson.disenosoftware.farmaciagi_dtos.ProductoDTO;
import java.util.List;
import org.itson.disenosoftware.farmaciagi_subsistema_productos.excepciones.ControlProductosException;
import org.itson.disenosoftware.farmaciagi_subsistema_productos.excepciones.GestorProductosException;

public class GestorProductos implements IGestorProductos{
    
    private ControlGestorProductos control;

    public GestorProductos() {
        control = new ControlGestorProductos();
    }

    @Override
    public ProductoDTO obtenerProducto(ProductoDTO productoBuscado) {
        return control.obtenerProducto(productoBuscado);
    }
    
    @Override
    public void actualizarProducto(ProductoDTO productoActualizado) throws GestorProductosException {
        try {
            control.actualizarProducto(productoActualizado);
        } catch (ControlProductosException ex) {
            throw new GestorProductosException("No se pudo actualizar el producto.");
        }
    }

    @Override
    public List<ProductoDTO> buscarProductosPorNombre(String nombre) {
        return control.buscarProductosPorNombre(nombre);
    }

    @Override
    public List<ProductoDTO> buscarProductosPorCodigo(String codigo) {
        return control.buscarProductosPorCodigo(codigo);
    }

    @Override
    public List<ProductoDTO> obtenerProductos() {
        return control.obtenerProductos();
    }
    
}

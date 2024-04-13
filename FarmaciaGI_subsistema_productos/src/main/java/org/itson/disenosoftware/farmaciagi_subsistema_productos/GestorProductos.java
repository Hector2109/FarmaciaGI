package org.itson.disenosoftware.farmaciagi_subsistema_productos;

import org.itson.disenosoftware.farmaciagi_dtos.ProductoDTO;
import java.util.List;

public class GestorProductos implements IGestorProductos{
    
    private ControlGestorProductos control;

    public GestorProductos() {
        control = new ControlGestorProductos();
    }

    @Override
    public ProductoDTO obtenerProducto(ProductoDTO productoBuscado) {
        ProductoDTO producto = control.obtenerProducto(productoBuscado);
        
        return producto;
    }

    @Override
    public List<ProductoDTO> buscarProductosPorNombre(String nombre) {
        List<ProductoDTO> productosSemejantes = control.buscarProductosPorNombre(nombre);
        
        return productosSemejantes;
    }

    @Override
    public List<ProductoDTO> buscarProductosPorCodigo(String codigo) {
        List<ProductoDTO> productosSemejantes = control.buscarProductosPorCodigo(codigo);
        
        return productosSemejantes;
    }

    @Override
    public List<ProductoDTO> obtenerProductos() {
        List<ProductoDTO> productosInventario = control.obtenerProductos();
        
        return productosInventario;
    }
    
}

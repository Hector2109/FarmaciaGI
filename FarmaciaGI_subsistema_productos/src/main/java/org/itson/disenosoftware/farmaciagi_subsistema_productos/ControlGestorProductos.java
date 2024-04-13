package org.itson.disenosoftware.farmaciagi_subsistema_productos;

import java.util.LinkedList;
import java.util.List;
import org.itson.disenosoftware.farmaciagi_dtos.ProductoDTO;
import org.itson.diseñosoftware.farmaciagidominio.Producto;

class ControlGestorProductos {
    
    public ProductoDTO obtenerProducto(ProductoDTO productoBuscado){
        Producto productoInventario = inventario.obtenerProducto(new Producto(productoBuscado.getCodigo()));

        if (productoInventario != null) {
            ProductoDTO producto = new ProductoDTO(productoInventario.getCodigo(), productoInventario.getNombre(),
                    productoInventario.getCosto(), productoInventario.getMarca(), productoInventario.getCantidad());

            return producto;
        } else {
            return null;
        }
    }
    
    public List<ProductoDTO> buscarProductosPorNombre(String nombre) {
        List<ProductoDTO> productosSemejantes = new LinkedList<>();
        for (Producto producto : inventario.getProductos()) {
            if (producto.getNombre().toLowerCase().contains(nombre.toLowerCase())) {
                ProductoDTO productoSemejante = new ProductoDTO(producto.getCodigo(), producto.getNombre(),
                        producto.getCosto(), producto.getMarca(), producto.getCantidad());

                productosSemejantes.add(productoSemejante);
            }
        }
        return productosSemejantes;
    }
    
    public List<ProductoDTO> buscarProductosPorCodigo(String codigo) {
        List<ProductoDTO> productosSemejantes = new LinkedList<>();
        for (Producto producto : inventario.getProductos()) {
            if (producto.getCodigo().toLowerCase().contains(codigo.toLowerCase())) {
                ProductoDTO productoSemejante = new ProductoDTO(producto.getCodigo(), producto.getNombre(),
                        producto.getCosto(), producto.getMarca(), producto.getCantidad());

                productosSemejantes.add(productoSemejante);
            }
        }
        return productosSemejantes;
    }
    
    public List<ProductoDTO> obtenerProductos() {
        List<ProductoDTO> productosInventario = new LinkedList<>();
        for (Producto producto : inventario.getProductos()) {
            ProductoDTO productoInventario = new ProductoDTO(producto.getCodigo(), producto.getNombre(),
                    producto.getCosto(), producto.getMarca(), producto.getCantidad());
            productosInventario.add(productoInventario);
        }
        return productosInventario;
    }
    
}

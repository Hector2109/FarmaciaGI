package org.itson.diseñosoftware.farmaciagi_objetosNegocio;

import java.util.LinkedList;
import java.util.List;
import org.itson.disenosoftware.farmaciagi_dtos.ProductoDTO;
import org.itson.disenosoftware.farmaciagi_simulacionbd.SimuladorInventarioProductos;
import org.itson.disenosoftware.farmaciagi_simulacionbd.objetos.ProductoAux;
import org.itson.diseñosoftware.farmaciagi_objetosNegocio.excepciones.ObjetosNegocioException;

public class Producto {
    
    private SimuladorInventarioProductos inventario;
    
    public Producto(){
        this.inventario = SimuladorInventarioProductos.getInstance();
    }

    public ProductoDTO getProducto(ProductoDTO productoBuscado){
        ProductoAux productoInventario = null;
        for (ProductoAux producto : inventario.getInventario()) {
            if (producto.getCodigo().equals(productoBuscado.getCodigo())) {
                productoInventario = producto;
            }
        }

        if (productoInventario != null) {
            ProductoDTO producto = new ProductoDTO(productoInventario.getCodigo(), productoInventario.getNombre(), 
                    productoInventario.getCosto(), productoInventario.getMarca(), productoInventario.getCantidad());

            return producto;
        } else {
            return null;
        }
    }
    
    public void actualizarProducto(ProductoDTO productoActualizado) throws ObjetosNegocioException {
        ProductoAux productoInventario = null;
        for (ProductoAux producto : inventario.getInventario()) {
            if (producto.getCodigo().equals(productoActualizado.getCodigo())) {
                productoInventario = producto;
            }
        }
        
        if (productoInventario != null) {
            productoInventario.setCodigo(productoActualizado.getCodigo());
            productoInventario.setNombre(productoActualizado.getNombre());
            productoInventario.setCosto(productoActualizado.getCosto());
            productoInventario.setMarca(productoActualizado.getMarca());
            productoInventario.setCantidad(productoActualizado.getCantidad());
            
            inventario.getInventario().set(inventario.getInventario().indexOf(productoInventario), productoInventario);
        } else {
            throw new ObjetosNegocioException("El producto no se encuentra en el inventario.");
        }
    }
    
    public List<ProductoDTO> buscarProductosPorNombre(String nombre) {
        List<ProductoDTO> productosSemejantes = new LinkedList<>();
        for (ProductoAux producto : inventario.getInventario()) {
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
        for (ProductoAux producto : inventario.getInventario()) {
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
        for (ProductoAux producto : inventario.getInventario()) {
            ProductoDTO productoInventario = new ProductoDTO(producto.getCodigo(), producto.getNombre(),
                    producto.getCosto(), producto.getMarca(), producto.getCantidad());
            productosInventario.add(productoInventario);
        }
        return productosInventario;
    }
    
}

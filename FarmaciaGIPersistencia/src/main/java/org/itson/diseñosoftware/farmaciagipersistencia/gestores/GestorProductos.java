package org.itson.diseñosoftware.farmaciagipersistencia.gestores;

import java.util.LinkedList;
import java.util.List;
import org.itson.diseñosoftware.farmaciagidominio.Producto;
import org.itson.diseñosoftware.farmaciagipersistencia.Productos;
import org.itson.diseñosoftware.farmaciagipersistencia.dtos.ProductoDTO;
import org.itson.diseñosoftware.farmaciagipersistencia.excepciones.PersistenciaException;

public class GestorProductos implements IGestorProductos {

    private Productos inventario;

    public GestorProductos(Productos inventario) {
        this.inventario = inventario;
    }

    @Override
    public ProductoDTO obtenerProducto(ProductoDTO productoBuscado) throws PersistenciaException {
        Producto productoInventario = inventario.obtenerProducto(new Producto(productoBuscado.getCodigo()));
        
        if (productoInventario != null) {
            ProductoDTO producto = new ProductoDTO(productoInventario.getCodigo(), productoInventario.getNombre(), 
                    productoInventario.getCosto(), productoInventario.getMarca(), productoInventario.getCantidad());
            
            return producto;
        } else {
            throw new PersistenciaException("El producto no se encuentra en el inventario.");
        }
    }

    @Override
    public void agregarProducto(ProductoDTO productoNuevo) throws PersistenciaException {
        Producto producto = new Producto(productoNuevo.getNombre(), productoNuevo.getCosto(),
                productoNuevo.getMarca(), productoNuevo.getCodigo(), productoNuevo.getCantidad());

        if (inventario.obtenerProducto(producto) != null) {
            inventario.agregarProducto(producto);
        } else {
            throw new PersistenciaException("El producto ya se encuentra en el inventario.");
        }
    }

    @Override
    public void eliminarProducto(ProductoDTO productoEliminar) throws PersistenciaException {
        Producto producto = inventario.obtenerProducto(new Producto(productoEliminar.getCodigo()));

        if (producto != null) {
            inventario.elminarProducto(producto);
        } else {
            throw new PersistenciaException("El producto no se encuentra en el inventario.");
        }
    }

    @Override
    public void sumarCantidadProducto(ProductoDTO producto) throws PersistenciaException {
        try {
            Producto productoInventario = inventario.obtenerProducto(new Producto(producto.getCodigo()));
            
            if (productoInventario != null) {
                productoInventario.setCantidad(productoInventario.getCantidad() + producto.getCantidad());

                inventario.actualizarProducto(productoInventario);
            } else {
                throw new PersistenciaException("El producto no se encuentra en el inventario.");
            }
        } catch (PersistenciaException e) {
            throw new PersistenciaException(e.getMessage());
        }
    }

    @Override
    public void restarCantidadProducto(ProductoDTO producto) throws PersistenciaException {
        try {
            Producto productoInventario = inventario.obtenerProducto(new Producto(producto.getCodigo()));

            if (productoInventario != null) { 
                if (productoInventario.getCantidad() - producto.getCantidad() < 0) {
                    throw new PersistenciaException("La cantidad del producto en el inventario no es suficiente.");
                }
                productoInventario.setCantidad(productoInventario.getCantidad() - producto.getCantidad());

                inventario.actualizarProducto(productoInventario);
            } else {
                throw new PersistenciaException("El producto no se encuentra en el inventario.");
            }
        } catch (PersistenciaException e) {
            throw new PersistenciaException(e.getMessage());
        }
    }

    @Override
    public List<ProductoDTO> buscarProductosPorNombre(String nombre) throws PersistenciaException {
        if (!inventario.getProductos().isEmpty()) {
            List<ProductoDTO> productosSemejantes = new LinkedList<>();
            for (Producto producto : inventario.getProductos()) {
                if (producto.getNombre().contains(nombre)) {
                    ProductoDTO productoSemejante = new ProductoDTO(producto.getCodigo(), producto.getNombre(), 
                            producto.getCosto(), producto.getMarca(), producto.getCantidad());

                    productosSemejantes.add(productoSemejante);
                }
            }
            return productosSemejantes;
        }
        throw new PersistenciaException("El inventario está vacío.");
    }

    @Override
    public List<ProductoDTO> buscarProductoPorCodigo(String codigo) throws PersistenciaException {
        if (!inventario.getProductos().isEmpty()) {
            List<ProductoDTO> productosSemejantes = new LinkedList<>();
            for (Producto producto : inventario.getProductos()) {
                if (producto.getCodigo().contains(codigo)) {
                    ProductoDTO productoSemejante = new ProductoDTO(producto.getCodigo(), producto.getNombre(), 
                            producto.getCosto(), producto.getMarca(), producto.getCantidad());

                    productosSemejantes.add(productoSemejante);
                }
            }
            return productosSemejantes;
        }
        throw new PersistenciaException("El inventario está vacío.");
    }

    @Override
    public List<ProductoDTO> obtenerProductos() throws PersistenciaException {
        if (!inventario.getProductos().isEmpty()) {
            List<ProductoDTO> productosInventario = new LinkedList<>();
            for (Producto producto : inventario.getProductos()) {
                ProductoDTO productoInventario = new ProductoDTO(producto.getCodigo(), producto.getNombre(), 
                        producto.getCosto(), producto.getMarca(), producto.getCantidad());
                productosInventario.add(productoInventario);
            }
            return productosInventario;
        }
        throw new PersistenciaException("El inventario está vacío.");
    }

}

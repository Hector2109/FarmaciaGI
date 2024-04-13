package org.itson.basesdedatosavanzadas_tramitesvehiculares_negocio.farmaciagi_subsistema_productos;

import java.util.LinkedList;
import java.util.List;
import org.itson.diseñosoftware.farmaciagidominio.Producto;
import org.itson.diseñosoftware.farmaciagipersistencia.Productos;
import org.itson.diseñosoftware.farmaciagipersistencia.dtos.ProductoDTO;
import org.itson.diseñosoftware.farmaciagipersistencia.excepciones.PersistenciaException;

/**
 *
 * @author Hector Espinoza
 */
public class GestorProductos implements IGestorProductos{
    
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
            return null;
        }
    }

    @Override
    public void agregarProducto(ProductoDTO productoNuevo) throws PersistenciaException {
        Producto producto = new Producto(productoNuevo.getNombre(), productoNuevo.getCosto(),
                productoNuevo.getMarca(), productoNuevo.getCodigo(), productoNuevo.getCantidad());

        if (inventario.obtenerProducto(producto) == null) {
            inventario.agregarProducto(producto);
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
    public void actualizarProducto(ProductoDTO productoActualizado) throws PersistenciaException {
        Producto producto = inventario.obtenerProducto(new Producto(productoActualizado.getCodigo()));

        if (producto != null) {
            producto.setCodigo(productoActualizado.getCodigo());
            producto.setNombre(productoActualizado.getNombre());
            producto.setCosto(productoActualizado.getCosto());
            producto.setMarca(productoActualizado.getMarca());
            producto.setCantidad(productoActualizado.getCantidad());

            inventario.actualizarProducto(producto);
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

    @Override
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

    @Override
    public List<ProductoDTO> obtenerProductos() {
        List<ProductoDTO> productosInventario = new LinkedList<>();
        for (Producto producto : inventario.getProductos()) {
            ProductoDTO productoInventario = new ProductoDTO(producto.getCodigo(), producto.getNombre(),
                    producto.getCosto(), producto.getMarca(), producto.getCantidad());
            productosInventario.add(productoInventario);
        }
        return productosInventario;
    }

    @Override
    public List<ProductoDTO> agregarProductosAVista(List<ProductoDTO> inventario, String filtro) {
        List<ProductoDTO> productosBuscados = new LinkedList<>();
        productosBuscados.addAll(buscarProductosPorNombre(filtro));
        if (productosBuscados.isEmpty()) {
            productosBuscados.addAll(buscarProductosPorCodigo(filtro));
        }
        return productosBuscados;
    }
    
}

package org.itson.diseñosoftware.farmaciagipersistencia.daos;

import java.util.ArrayList;
import java.util.List;
import org.itson.diseñosoftware.farmaciagidominio.Producto;
import org.itson.diseñosoftware.farmaciagipersistencia.dtos.ProductoDTO;
import org.itson.diseñosoftware.farmaciagipersistencia.excepciones.PersistenciaException;

public class ProductosDAO implements IProductosDAO {

    private List<Producto> productos;

    public ProductosDAO(List<Producto> productos) {
        this.productos = productos;
    }

    @Override
    public Producto obtenerProducto(ProductoDTO producto) throws PersistenciaException {
        Producto productoBuscado = new Producto(producto.getCodigo(), producto.getNombre());

        if (productos.contains(productoBuscado)) {
            return productos.get(productos.indexOf(productoBuscado));
        } else {
            throw new PersistenciaException("El producto no se encuentra en el inventario.");
        }
    }

    @Override
    public void agregarProducto(ProductoDTO producto) throws PersistenciaException {
        Producto productoNuevo = new Producto(producto.getNombre(), producto.getCosto(),
                producto.getMarca(), producto.getCodigo(), producto.getCantidad());

        if (!productos.contains(productoNuevo)) {
            productos.add(productoNuevo);
        } else {
            throw new PersistenciaException("El producto ya se encuentra en el inventario.");
        }
    }

    @Override
    public void eliminarProducto(ProductoDTO producto) throws PersistenciaException {
        Producto productoEliminar = new Producto(producto.getCodigo(), producto.getNombre());

        if (!productos.remove(productoEliminar)) {
            throw new PersistenciaException("El producto no se encuentra en el inventario.");
        }
    }

    @Override
    public void sumarCantidadProducto(ProductoDTO producto) throws PersistenciaException {
        try {
            Producto productoInventario = obtenerProducto(producto);

            productoInventario.setCantidad(productoInventario.getCantidad() + producto.getCantidad());

            productos.set(productos.indexOf(productoInventario), productoInventario);
        } catch (PersistenciaException e) {
            throw new PersistenciaException(e.getMessage());
        }
    }

    @Override
    public void restarCantidadProducto(ProductoDTO producto) throws PersistenciaException {
        try {
            Producto productoInventario = obtenerProducto(producto);

            if (productoInventario.getCantidad() - producto.getCantidad() < 0) {
                throw new PersistenciaException("La cantidad del producto en el inventario no es suficiente.");
            }
            productoInventario.setCantidad(productoInventario.getCantidad() - producto.getCantidad());

            productos.set(productos.indexOf(productoInventario), productoInventario);
        } catch (PersistenciaException e) {
            throw new PersistenciaException(e.getMessage());
        }
    }

    @Override
    public List<Producto> buscarProductosPorNombre(String nombre) throws PersistenciaException {
        List<Producto> productosSemejantes = new ArrayList<>();
        for (Producto producto : productos) {
            if (producto.getNombre().contains(nombre)) {
                productosSemejantes.add(producto);
            }
        }
        return productosSemejantes;
    }

    @Override
    public List<Producto> buscarProductoPorCodigo(String codigo) throws PersistenciaException {
        List<Producto> productosSemejantes = new ArrayList<>();
        for (Producto producto : productos) {
            if (producto.getCodigo().contains(codigo)) {
                productosSemejantes.add(producto);
            }
        }
        return productosSemejantes;
    }

    @Override
    public List<Producto> obtenerProductos() throws PersistenciaException {
        if (!productos.isEmpty()) {
            return productos;
        }
        throw new PersistenciaException("El inventario está vacío.");
    }

}

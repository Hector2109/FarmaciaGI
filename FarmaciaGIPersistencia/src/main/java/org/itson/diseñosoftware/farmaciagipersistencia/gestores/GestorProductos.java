package org.itson.diseñosoftware.farmaciagipersistencia.gestores;

import java.util.ArrayList;
import java.util.List;
import org.itson.diseñosoftware.farmaciagidominio.Producto;
import org.itson.diseñosoftware.farmaciagipersistencia.dtos.ProductoDTO;
import org.itson.diseñosoftware.farmaciagipersistencia.excepciones.PersistenciaException;

public class GestorProductos implements IGestorProductos {

    private List<Producto> productos;

    public GestorProductos(List<Producto> productos) {
        this.productos = productos;
    }

    @Override
    public Producto obtenerProducto(ProductoDTO productoBuscado) throws PersistenciaException {
        Producto producto = new Producto(productoBuscado.getCodigo(), productoBuscado.getNombre());

        if (productos.contains(producto)) {
            return productos.get(productos.indexOf(producto));
        } else {
            throw new PersistenciaException("El producto no se encuentra en el inventario.");
        }
    }

    @Override
    public void agregarProducto(ProductoDTO productoNuevo) throws PersistenciaException {
        Producto producto = new Producto(productoNuevo.getNombre(), productoNuevo.getCosto(),
                productoNuevo.getMarca(), productoNuevo.getCodigo(), productoNuevo.getCantidad());

        if (!productos.contains(producto)) {
            productos.add(producto);
        } else {
            throw new PersistenciaException("El producto ya se encuentra en el inventario.");
        }
    }

    @Override
    public void eliminarProducto(ProductoDTO productoEliminar) throws PersistenciaException {
        Producto producto = new Producto(productoEliminar.getCodigo(), productoEliminar.getNombre());

        if (!productos.remove(producto)) {
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

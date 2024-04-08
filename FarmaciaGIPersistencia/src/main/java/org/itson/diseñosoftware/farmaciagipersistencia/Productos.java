package org.itson.diseñosoftware.farmaciagipersistencia;

import org.itson.diseñosoftware.farmaciagipersistencia.excepciones.PersistenciaException;
import java.util.ArrayList;
import java.util.List;
import org.itson.diseñosoftware.farmaciagidominio.Producto;

/**
 *
 * @author MiFarmaciaGI
 */
public class Productos {

    List<Producto> productos = new ArrayList<>();
    
    public Productos() {
    }
    
    public Producto obtenerProducto(Producto producto) {
        if (productos.contains(producto)) {
            return productos.get(productos.indexOf(producto));
        }
        return null;
    }

    public void agregarProducto(Producto producto) {
        productos.add(producto);
    }

    public void elminarProducto(Producto producto) throws PersistenciaException {
        if (!productos.remove(producto)) {
            throw new PersistenciaException("No se pudo eliminar el producto");
        }
    }

    public void actualizarProducto(Producto producto) throws PersistenciaException {
        if (productos.contains(producto)) {
            productos.set(productos.indexOf(producto), producto);
        } else {
            throw new PersistenciaException("El producto no se encuentra en el inventario.");
        }
    }

    public List<Producto> buscarProductosPorNombre(String nombre) {
        List<Producto> productosSemenjantes = new ArrayList<>();
        for (Producto producto : productos) {
            if (producto.getNombre().contains(nombre)) {
                productosSemenjantes.add(producto);
            }
        }
        return productosSemenjantes;
    }

    public List<Producto> buscarProductosPorId(String codigo) {
        List<Producto> productosSemejantes = new ArrayList<>();
        for (Producto producto : productos) {
            if (producto.getCodigo().contains(codigo)) {
                productosSemejantes.add(producto);
            }
        }
        return productosSemejantes;
    }

    public List<Producto> getProductos() {
        return productos;
    }

    public void setProductos(List<Producto> productos) {
        this.productos = productos;
    }

}

package org.itson.diseñosoftware.farmaciagipersistencia.gestores;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.itson.diseñosoftware.farmaciagidominio.Producto;
import org.itson.diseñosoftware.farmaciagipersistencia.Productos;
import org.itson.diseñosoftware.farmaciagipersistencia.dtos.ProductoDTO;
import org.itson.diseñosoftware.farmaciagipersistencia.excepciones.PersistenciaException;

public class GestorProductos implements IGestorProductos {

    private List<Producto> productos;
    Productos inventario = new Productos();
    Productos venta = new Productos();

    public GestorProductos() throws PersistenciaException {
        inventario = agregarInventario();
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

    @Override
    public Productos agregarInventario() throws PersistenciaException {
        try {
            inventario.agregarProducto(new Producto("Paracetamol", 8.21F, "Ultra", "PCO-001", 10));
        } catch (PersistenciaException ex) {
            Logger.getLogger(Productos.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            inventario.agregarProducto(new Producto("Sildenafil", 25.04F, "Ultra", "SLD-541", 10));
        } catch (PersistenciaException ex) {
            Logger.getLogger(Productos.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            inventario.agregarProducto(new Producto("Naproxeno", 30.19F, "Amsa", "NPX-649", 10));
        } catch (PersistenciaException ex) {
            Logger.getLogger(Productos.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            inventario.agregarProducto(new Producto("Treda", 35.21F, "Amsa", "TDA-874", 10));
        } catch (PersistenciaException ex) {
            Logger.getLogger(Productos.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            inventario.agregarProducto(new Producto("Rebotril", 500F, "Psychopath", "RPL-871", 10));
        } catch (PersistenciaException ex) {
            Logger.getLogger(Productos.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            inventario.agregarProducto(new Producto("Ventanilo", 54.98F, "Psychopath", "VLP-405", 10));
        } catch (PersistenciaException ex) {
            Logger.getLogger(Productos.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            inventario.agregarProducto(new Producto("Simi Paletas", 40.87F, "Simi", "SMP-408", 10));
        } catch (PersistenciaException ex) {
            Logger.getLogger(Productos.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            inventario.agregarProducto(new Producto("Simi Fibra", 299.5F, "Simi", "SMF-740", 10));
        } catch (PersistenciaException ex) {
            Logger.getLogger(Productos.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            inventario.agregarProducto(new Producto("Diclofenaco", 84F, "Amsa", "DCA-471", 10));
        } catch (PersistenciaException ex) {
            Logger.getLogger(Productos.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            inventario.agregarProducto(new Producto("Proctoacid", 121.04F, "Ultra", "PRD-450", 10));
        } catch (PersistenciaException ex) {
            Logger.getLogger(Productos.class.getName()).log(Level.SEVERE, null, ex);
        }
        return inventario;
    }
    
    public Productos getInventario() {
        return inventario;
    }

    public void setInventario(Productos inventario) {
        this.inventario = inventario;
    }

    public Productos getVenta() {
        return venta;
    }

    public void setVenta(Productos venta) {
        this.venta = venta;
    }
    
    public void limpiarVenta(){
        setVenta(new Productos());
    }

}

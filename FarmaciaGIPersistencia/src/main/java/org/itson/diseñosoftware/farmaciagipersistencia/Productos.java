package org.itson.diseñosoftware.farmaciagipersistencia;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.itson.diseñosoftware.farmaciagidominio.Producto;

/**
 *
 * @author MiFarmaciaGI
 */
public class Productos {

    List<Producto> productos = new ArrayList<>();

    /**
     * Constructor que nos ayudará a hardcodear el inventario
     */
    public Productos() {
    }

    public void agregarInventario() {
        agregarListaProductos();
    }

    private void agregarListaProductos() {
        try {
            agregarProducto(new Producto("Paracetamol", 8.21F, "Ultra", "PCO-001", 10));
        } catch (PersistenciaException ex) {
            Logger.getLogger(Productos.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            agregarProducto(new Producto("Sildenafil", 25.04F, "Ultra", "SLD-541", 10));
        } catch (PersistenciaException ex) {
            Logger.getLogger(Productos.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            agregarProducto(new Producto("Naproxeno", 30.19F, "Amsa", "NPX-649", 10));
        } catch (PersistenciaException ex) {
            Logger.getLogger(Productos.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            agregarProducto(new Producto("Treda", 35.21F, "Amsa", "TDA-874", 10));
        } catch (PersistenciaException ex) {
            Logger.getLogger(Productos.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            agregarProducto(new Producto("Rebotril", 500F, "Psychopath", "RPL-871", 10));
        } catch (PersistenciaException ex) {
            Logger.getLogger(Productos.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            agregarProducto(new Producto("Ventanilo", 54.98F, "Psychopath", "VLP-405", 10));
        } catch (PersistenciaException ex) {
            Logger.getLogger(Productos.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            agregarProducto(new Producto("Simi Paletas", 40.87F, "Simi", "SMP-408", 10));
        } catch (PersistenciaException ex) {
            Logger.getLogger(Productos.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            agregarProducto(new Producto("Simi Fibra", 299.5F, "Simi", "SMF-740", 10));
        } catch (PersistenciaException ex) {
            Logger.getLogger(Productos.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            agregarProducto(new Producto("Diclofenaco", 84F, "Amsa", "DCA-471", 10));
        } catch (PersistenciaException ex) {
            Logger.getLogger(Productos.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            agregarProducto(new Producto("Proctoacid", 121.04F, "Ultra", "PRD-450", 10));
        } catch (PersistenciaException ex) {
            Logger.getLogger(Productos.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public Producto obtenerProducto(Producto producto){
        if (productos.contains(producto)){
            return productos.get(productos.indexOf(producto));
        }
        return null;
    }

    public void agregarProducto(Producto producto) throws PersistenciaException {
        if (productos.contains(producto)) {
            throw new PersistenciaException("El producto ya se encuentra en el inventario");
        } else {
            productos.add(producto);
        }
    }

    public void elminarProducto(Producto producto) throws PersistenciaException {
        if (productos.contains(producto)) {
            if (!productos.remove(producto)) {
                throw new PersistenciaException("No se pudo eliminar el producto");
            }
        } else {
            throw new PersistenciaException("El producto no se encuentra en la lista");
        }
    }
 
    public List<Producto> buscarProductoNombre(String nombre) {
        List<Producto> productosSemejantes = new ArrayList<>();
        for (Producto p : productos) {
            if (p.getNombre().contains(nombre)) {
                productosSemejantes.add(p);
            }
        }
        return productosSemejantes;
    }

    public List<Producto> buscarProductoId(String id) {
        List<Producto> productosSemejantes = new ArrayList<>();
        for (Producto p : productos) {
            if (p.getId().contains(id)) {
                productosSemejantes.add(p);
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
    
    
    public Integer obtenerIndiceProducto (Producto producto){
        for (int i = 0; i < getProductos().size(); i++) {        
            if (productos.contains(producto)){
                return i;
            }
            
        }
        return null;
    }

}

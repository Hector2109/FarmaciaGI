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
public class Productos{
    
    List <Producto> productos = new ArrayList<>();

    /**
     * Constructor que nos ayudará a harcodear el inventario
     */
    public Productos() {
        
    }
    
    public void agregarInventario(){
        agregarListaProductos();
    }
    
    private void agregarListaProductos(){
        
        try {
            agregarProducto(new Producto ("Paracetamol", 8.21F, "Ultra", "PCO-001"));
        } catch (PersistenciaException ex) {
            Logger.getLogger(Productos.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            agregarProducto(new Producto ("Sildenafil", 25.04F, "Ultra", "SLD-541"));
        } catch (PersistenciaException ex) {
            Logger.getLogger(Productos.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            agregarProducto(new Producto ("Naproxeno", 30.19F, "Amsa", "NPX-649"));
        } catch (PersistenciaException ex) {
            Logger.getLogger(Productos.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            agregarProducto(new Producto ("Treda", 35.21F, "Amsa", "TDA-874"));
        } catch (PersistenciaException ex) {
            Logger.getLogger(Productos.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            agregarProducto(new Producto ("Rebotril", 500F, "Psychopath", "RPL-871"));
        } catch (PersistenciaException ex) {
            Logger.getLogger(Productos.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            agregarProducto(new Producto ("Ventanilo", 54.98F, "Psychopath", "VLP-405"));
        } catch (PersistenciaException ex) {
            Logger.getLogger(Productos.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            agregarProducto(new Producto ("Simi Paletas", 40.87F, "Simi", "SMP-408"));
        } catch (PersistenciaException ex) {
            Logger.getLogger(Productos.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            agregarProducto(new Producto ("Simi Fibra", 299.5F, "Simi", "SMF-740"));
        } catch (PersistenciaException ex) {
            Logger.getLogger(Productos.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            agregarProducto(new Producto ("Diclofenaco", 84F, "Amsa", "DCA-471"));
        } catch (PersistenciaException ex) {
            Logger.getLogger(Productos.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            agregarProducto(new Producto ("Proctoacid", 121.04F, "Ultra", "PRD-450"));
        } catch (PersistenciaException ex) {
            Logger.getLogger(Productos.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
    
    public void agregarProducto(Producto producto) throws PersistenciaException{
        if (productos.contains(producto)){
            throw new PersistenciaException ("El prdocuto ya se encuentra en el inventario");
        }else{
            productos.add(producto);
        }
    }
    
    public void elminarProducto (Producto producto) throws PersistenciaException{
        if (productos.contains(producto)){
            if (!productos.remove(producto)){
                throw new PersistenciaException ("No se pudo eliminar el producto");
            }
        }else{
            throw new PersistenciaException ("El producto no se encuentra en la lista");
        }
    }
    
    public List<Producto> buscarProductoNombre(String nombre){
        List <Producto> productosSemejantes = new ArrayList<>();
        
        
        for (Producto p: productos) {
            if (p.getNombre().contains(nombre)){
                productosSemejantes.add(p);
            }
        }
        
        return productosSemejantes;
        
    }
    
    public List<Producto> buscarProductoId(String id){
        List <Producto> productosSemejantes = new ArrayList<>();
        
        
        for (Producto p: productos) {
            if (p.getId().contains(id)){
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
    
}

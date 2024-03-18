package org.itson.diseñosoftware.farmaciagipersistencia;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.itson.diseñosoftware.farmaciagidominio.Producto;

/**
 *
 * @author MiFarmaciaGI
 */
public class Productos{
    
    List <Producto> productos = new ArrayList<>();

    public Productos() {
        agregarListaProductos();
    }
    
    
    private void agregarListaProductos(){
        
        productos.add(new Producto ("Paracetamol", 8.21F, "Ultra", "PCO-001"));
        productos.add(new Producto ("Sildenafil", 25.04F, "Ultra", "SLD-541"));
        productos.add(new Producto ("Naproxeno", 30.19F, "Amsa", "NPX-649"));
        productos.add(new Producto ("Treda", 35.21F, "Amsa", "TDA-874"));
        productos.add(new Producto ("Rebotril", 500F, "Psychopath", "RPL-871"));
        productos.add(new Producto ("Ventanilo", 54.98F, "Psychopath", "VLP-405"));
        productos.add(new Producto ("Simi Paletas", 40.87F, "Simi", "SMP-408"));
        productos.add(new Producto ("Simi Fibra", 299.5F, "Simi", "SMF-740"));
        productos.add(new Producto ("Diclofenaco", 84F, "Amsa", "DCA-471"));
        productos.add(new Producto ("Proctoacid", 121.04F, "Ultra", "PRD-450"));

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
    
    
    
    
    
    
}

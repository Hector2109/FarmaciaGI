package org.itson.diseñosoftware.farmaciagi;

import java.util.logging.Level;
import java.util.logging.Logger;
import org.itson.diseñosoftware.farmaciagi.control.Control;
import org.itson.diseñosoftware.farmaciagi.interfaces.PantallaVenta;
import org.itson.diseñosoftware.farmaciagidominio.Producto;
import org.itson.diseñosoftware.farmaciagipersistencia.Productos;
import org.itson.diseñosoftware.farmaciagipersistencia.excepciones.PersistenciaException;

/**
 *
 * @author Enrique Rodriguez
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Control control;
        Productos inventario = new Productos();

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
        
        control = new Control (inventario);
        control.venta();

//        PantallaVenta pantalla = new PantallaVenta(inventario);
//        pantalla.setVisible(true);
    }

}

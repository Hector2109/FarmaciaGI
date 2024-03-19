package org.itson.diseñosoftware.farmaciagi;

import org.itson.diseñosoftware.farmaciagi.interfaces.PantallaVenta;
import org.itson.diseñosoftware.farmaciagipersistencia.Productos;

/**
 *
 * @author Enrique Rodriguez
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Productos productos = new Productos();
        productos.agregarInventario();
        
        PantallaVenta p = new PantallaVenta(productos);
        p.setVisible(true);
    }
    
}

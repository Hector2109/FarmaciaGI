package org.itson.diseñosoftware.farmaciagi.control;

import javax.swing.JOptionPane;
import org.itson.diseñosoftware.farmaciagi.interfaces.PantallaVenta;
import org.itson.diseñosoftware.farmaciagipersistencia.Productos;

/**
 *
 * @author MiFarmacia GI
 */
public class Control {

    Productos inventario;
    Productos venta = new Productos();
    PantallaVenta pantallaVenta;
    
    public Control(Productos inventario) {
        this.inventario = inventario;
    }
    
    public void venta(){
        if (!inventario.getProductos().isEmpty()){
        this.pantallaVenta = new PantallaVenta (inventario);
        this.pantallaVenta.setVisible(true);}
        else{
            JOptionPane.showMessageDialog(pantallaVenta, "No hay productos en el inventario", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    
    
    
    
    
    
    
    
    
    
}

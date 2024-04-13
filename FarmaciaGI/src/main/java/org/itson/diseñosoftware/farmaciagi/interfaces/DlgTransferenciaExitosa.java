/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JDialog.java to edit this template
 */
package org.itson.diseñosoftware.farmaciagi.interfaces;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.Timer;
import org.itson.basesdedatosavanzadas_tramitesvehiculares_negocio.farmaciagi_subsistema_productos.IGestorProductos;
import org.itson.basesdedatosavanzadas_tramitesvehiculares_negocio.farmaciagi_subsistema_ventas.IGestorVentas;

/**
 *
 * @author Hector Espinoza
 */
public class DlgTransferenciaExitosa extends javax.swing.JDialog {

    Float total;
    private IGestorProductos gestorProductosVenta;
    private IGestorVentas gestorVenta;
    private Timer timer;
    
    /**
     * Creates new form DlgTransferenciaExitosa
     */
    public DlgTransferenciaExitosa(java.awt.Frame parent, boolean modal, float total, IGestorProductos gestorProductosVenta, IGestorVentas gestorVenta) {
        super(parent, modal);
        initComponents();
        

        this.total = total;
        this.gestorProductosVenta = gestorProductosVenta;
        this.gestorVenta = gestorVenta;
        timer = new Timer(3000, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dispose();
                DlgResumenVenta venta = new DlgResumenVenta(parent, true, gestorProductosVenta, gestorVenta, total, total, 0.0F);
                venta.setVisible(true);

            }
        });
        timer.setRepeats(false); 
        timer.start(); 

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Transferencia completada.png"))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}

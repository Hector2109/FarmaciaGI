package org.itson.diseñosoftware.farmaciagi.interfaces;

import java.awt.Color;
import java.awt.Frame;
import org.itson.diseñosoftware.farmaciagipersistencia.Productos;
import org.itson.diseñosoftware.farmaciagipersistencia.gestores.IGestorProductos;
import org.itson.diseñosoftware.farmaciagipersistencia.gestores.IGestorVentas;

public class DlgTipoPago extends javax.swing.JDialog {

    private Float total;
    private IGestorProductos gestorProductosVenta;
    private IGestorVentas gestorVenta;
    
    /**
     * Creates new form DlgTipoPago
     * @param parent
     * @param modal
     */
    public DlgTipoPago(java.awt.Frame parent, boolean modal, Float total, IGestorProductos gestorProductosVenta, IGestorVentas gestorVenta) {
        super(parent, modal);
        this.parent = parent;
        initComponents();
        btnTarjeta.setBackground(Color.WHITE);
        btnEfectivo.setBackground(Color.WHITE);
        jLabel1.setForeground(Color.WHITE);
        this.total = total;
        this.gestorProductosVenta = gestorProductosVenta;
        this.gestorVenta = gestorVenta;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        fondo = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        btnTarjeta = new javax.swing.JButton();
        btnEfectivo = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        fondo.setBackground(new java.awt.Color(216, 215, 255));
        fondo.setPreferredSize(new java.awt.Dimension(300, 250));

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("TIPO DE PAGO");

        btnTarjeta.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        btnTarjeta.setText("TARJETA");
        btnTarjeta.setMaximumSize(new java.awt.Dimension(100, 30));
        btnTarjeta.setPreferredSize(new java.awt.Dimension(173, 48));
        btnTarjeta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTarjetaActionPerformed(evt);
            }
        });

        btnEfectivo.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        btnEfectivo.setText("EFECTIVO");
        btnEfectivo.setMaximumSize(new java.awt.Dimension(100, 30));
        btnEfectivo.setPreferredSize(new java.awt.Dimension(173, 48));
        btnEfectivo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEfectivoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout fondoLayout = new javax.swing.GroupLayout(fondo);
        fondo.setLayout(fondoLayout);
        fondoLayout.setHorizontalGroup(
            fondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(fondoLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabel1)
                .addContainerGap(21, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, fondoLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(fondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnEfectivo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnTarjeta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(64, 64, 64))
        );
        fondoLayout.setVerticalGroup(
            fondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(fondoLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel1)
                .addGap(29, 29, 29)
                .addComponent(btnEfectivo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(btnTarjeta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(35, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(fondo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(fondo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnTarjetaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTarjetaActionPerformed
        dispose();
        DlgInsertaTarjeta pagoTarjeta = new DlgInsertaTarjeta(parent, true,total, gestorProductosVenta, gestorVenta);
        pagoTarjeta.setVisible(true);
    }//GEN-LAST:event_btnTarjetaActionPerformed

    private void btnEfectivoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEfectivoActionPerformed
        dispose();
        DlgPagoEfectivo pagoEfectivo = new DlgPagoEfectivo(parent, true, total, gestorProductosVenta, gestorVenta);
        pagoEfectivo.setVisible(true);
    }//GEN-LAST:event_btnEfectivoActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEfectivo;
    private javax.swing.JButton btnTarjeta;
    private javax.swing.JPanel fondo;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
    private Frame parent;
}

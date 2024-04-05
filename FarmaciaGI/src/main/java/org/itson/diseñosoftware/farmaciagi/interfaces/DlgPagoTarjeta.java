
package org.itson.diseñosoftware.farmaciagi.interfaces;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Frame;
import java.awt.Point;
import javax.swing.JOptionPane;
import org.itson.diseñosoftware.farmaciagipersistencia.Productos;

public class DlgPagoTarjeta extends javax.swing.JDialog {

    private Float total;
    private Float cambio = 0.0F;
    private Float pago = 0.0F;
    private Productos productosVenta;
    private Frame parent;
    
    /**
     * Creates new form DlgPagoTarjeta
     */
    public DlgPagoTarjeta(java.awt.Frame parent, boolean modal, float total, Productos productosVenta) {
        super(parent, modal);
        initComponents();
        centraCuadroDialogo(parent);
        btnAceptar.setBackground(Color.WHITE);
        btnCancelar.setBackground(Color.WHITE);
        this.total = total;
        txtMontoTotal.setText(Float.toString(total));
        this.productosVenta = productosVenta;
    }
    
    /**
     * Este método centra el cuadro de dialogo sobre la ventana de la
     * aplicación.
     *
     * @param parent Ventana sobre la que aparecerá el cuadro de diálogo
     */
    private void centraCuadroDialogo(java.awt.Frame parent) {
        // Obtiene el tamaño y posición de la ventana de la aplicación
        Dimension frameSize = parent.getSize();
        Point loc = parent.getLocation();
        // Obtiene el tamaño del cuadro de diálogo
        Dimension dlgSize = getPreferredSize();
        // Centra el cuadro de diálogo sobre la ventana padre
        setLocation((frameSize.width - dlgSize.width) / 2 + loc.x, (frameSize.height - dlgSize.height) / 2 + loc.y);
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
        txtMontoTotal = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        btnCancelar = new javax.swing.JButton();
        btnAceptar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        fondo.setBackground(new java.awt.Color(216, 215, 255));

        txtMontoTotal.setEditable(false);
        txtMontoTotal.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        txtMontoTotal.setPreferredSize(new java.awt.Dimension(36, 37));

        jLabel3.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(77, 77, 77));
        jLabel3.setText("MONTO ");

        jLabel1.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("PAGO CON TARJETA");

        btnCancelar.setFont(new java.awt.Font("Arial", 1, 22)); // NOI18N
        btnCancelar.setText("CANCELAR");
        btnCancelar.setPreferredSize(new java.awt.Dimension(173, 48));
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        btnAceptar.setFont(new java.awt.Font("Arial", 1, 22)); // NOI18N
        btnAceptar.setText("ACEPTAR");
        btnAceptar.setMaximumSize(new java.awt.Dimension(100, 30));
        btnAceptar.setPreferredSize(new java.awt.Dimension(173, 48));
        btnAceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAceptarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout fondoLayout = new javax.swing.GroupLayout(fondo);
        fondo.setLayout(fondoLayout);
        fondoLayout.setHorizontalGroup(
            fondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(fondoLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(fondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, fondoLayout.createSequentialGroup()
                        .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnAceptar, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(fondoLayout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtMontoTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 638, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(30, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, fondoLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(217, 217, 217))
        );
        fondoLayout.setVerticalGroup(
            fondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(fondoLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jLabel1)
                .addGap(36, 36, 36)
                .addGroup(fondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtMontoTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 49, Short.MAX_VALUE)
                .addGroup(fondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAceptar, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(16, 16, 16))
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
    }// </editor-fold>//GEN-END:initComponents

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        dispose();
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void btnAceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAceptarActionPerformed
        pago = total;

        cambio = 0F;
        DlgResumenVenta venta = new DlgResumenVenta(parent, true, productosVenta, total, pago, cambio);
        venta.setVisible(true);
        dispose();

    }//GEN-LAST:event_btnAceptarActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAceptar;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JPanel fondo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JTextField txtMontoTotal;
    // End of variables declaration//GEN-END:variables
}

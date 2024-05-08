package org.itson.diseñosoftware.farmaciagi.interfaces;

import java.awt.Color;
import java.util.InputMismatchException;
import javax.swing.JOptionPane;
import org.itson.disenosoftware.farmaciagi_dtos.PromocionDTO;
import org.itson.disenosoftware.farmaciagi_subsistema_promociones.GestorPromociones;
import org.itson.disenosoftware.farmaciagi_subsistema_promociones.IGestorPromociones;
import org.itson.disenosoftware.farmaciagi_subsistema_promociones.excepciones.SubsistemaPromocionesException;

public class DlgActualizarPromocion extends javax.swing.JDialog {

    private IGestorPromociones gestorPromociones;
    private PromocionDTO promocionActualizar;
    
    /**
     * Creates new form DlgActualizarPromocion
     * @param parent
     * @param modal
     */
    public DlgActualizarPromocion(java.awt.Frame parent, boolean modal, PromocionDTO promocionActualizar) {
        super(parent, modal);
        initComponents();
        
        btnAceptar.setBackground(Color.WHITE);
        btnCancelar.setBackground(Color.WHITE);
        txtProducto.setBackground(Color.WHITE);
        txtDescripcion.setText(promocionActualizar.getDescripcion());
        txtProducto.setText(promocionActualizar.getProducto().toString());
        txtCantidad.setText(promocionActualizar.getCantidad().toString());
        txtPrecioUnitario.setText(promocionActualizar.getPrecioUnitario().toString());
        
        gestorPromociones = new GestorPromociones();
        this.promocionActualizar = promocionActualizar;
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
        lblTitulo = new javax.swing.JLabel();
        btnAceptar = new javax.swing.JButton();
        txtDescripcion = new javax.swing.JTextField();
        lblDescripcion = new javax.swing.JLabel();
        lblProductos = new javax.swing.JLabel();
        txtCantidad = new javax.swing.JTextField();
        lblCantidad = new javax.swing.JLabel();
        txtPrecioUnitario = new javax.swing.JTextField();
        lblPrecioUnitario = new javax.swing.JLabel();
        btnCancelar = new javax.swing.JButton();
        txtProducto = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        fondo.setBackground(new java.awt.Color(216, 215, 255));
        fondo.setMaximumSize(new java.awt.Dimension(812, 600));
        fondo.setMinimumSize(new java.awt.Dimension(800, 600));

        lblTitulo.setFont(new java.awt.Font("Arial", 1, 38)); // NOI18N
        lblTitulo.setForeground(new java.awt.Color(255, 255, 255));
        lblTitulo.setText("ACTUALIZAR PROMOCIÓN");

        btnAceptar.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        btnAceptar.setText("ACEPTAR");
        btnAceptar.setFocusPainted(false);
        btnAceptar.setMaximumSize(new java.awt.Dimension(100, 30));
        btnAceptar.setPreferredSize(new java.awt.Dimension(173, 48));
        btnAceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAceptarActionPerformed(evt);
            }
        });

        txtDescripcion.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        txtDescripcion.setPreferredSize(new java.awt.Dimension(36, 37));

        lblDescripcion.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        lblDescripcion.setText("DESCRIPCIÓN");

        lblProductos.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        lblProductos.setText("PRODUCTO");

        txtCantidad.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        txtCantidad.setPreferredSize(new java.awt.Dimension(36, 37));

        lblCantidad.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        lblCantidad.setText("CANTIDAD");

        txtPrecioUnitario.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        txtPrecioUnitario.setPreferredSize(new java.awt.Dimension(36, 37));

        lblPrecioUnitario.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        lblPrecioUnitario.setText("PRECIO UNITARIO");

        btnCancelar.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        btnCancelar.setText("CANCELAR");
        btnCancelar.setFocusPainted(false);
        btnCancelar.setMaximumSize(new java.awt.Dimension(100, 30));
        btnCancelar.setPreferredSize(new java.awt.Dimension(173, 48));
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        txtProducto.setEditable(false);
        txtProducto.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        txtProducto.setDisabledTextColor(new java.awt.Color(255, 255, 255));
        txtProducto.setPreferredSize(new java.awt.Dimension(36, 37));

        javax.swing.GroupLayout fondoLayout = new javax.swing.GroupLayout(fondo);
        fondo.setLayout(fondoLayout);
        fondoLayout.setHorizontalGroup(
            fondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, fondoLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(lblTitulo)
                .addGap(180, 180, 180))
            .addGroup(fondoLayout.createSequentialGroup()
                .addGap(84, 84, 84)
                .addGroup(fondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(fondoLayout.createSequentialGroup()
                        .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(45, 45, 45)
                        .addComponent(btnAceptar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(fondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(fondoLayout.createSequentialGroup()
                            .addComponent(lblPrecioUnitario)
                            .addGap(18, 18, 18)
                            .addComponent(txtPrecioUnitario, javax.swing.GroupLayout.PREFERRED_SIZE, 452, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(fondoLayout.createSequentialGroup()
                            .addComponent(lblDescripcion)
                            .addGap(18, 18, 18)
                            .addComponent(txtDescripcion, javax.swing.GroupLayout.PREFERRED_SIZE, 500, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, fondoLayout.createSequentialGroup()
                            .addGroup(fondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(lblCantidad)
                                .addComponent(lblProductos))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(fondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(txtCantidad, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 500, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtProducto, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 500, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(83, Short.MAX_VALUE))
        );
        fondoLayout.setVerticalGroup(
            fondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(fondoLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(lblTitulo)
                .addGap(31, 31, 31)
                .addGroup(fondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblDescripcion)
                    .addComponent(txtDescripcion, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(44, 44, 44)
                .addGroup(fondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblProductos)
                    .addComponent(txtProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(43, 43, 43)
                .addGroup(fondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCantidad)
                    .addComponent(txtCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(42, 42, 42)
                .addGroup(fondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblPrecioUnitario)
                    .addComponent(txtPrecioUnitario, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(42, 42, 42)
                .addGroup(fondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAceptar, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(fondo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(fondo, javax.swing.GroupLayout.PREFERRED_SIZE, 470, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnAceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAceptarActionPerformed
        int respuesta = JOptionPane.showConfirmDialog(this, "¿Deseas confirmar la actualización de la promoción?",
            "Confirmar", JOptionPane.YES_NO_OPTION);
        if (respuesta == JOptionPane.YES_OPTION) {
            try {
                PromocionDTO promocionActualizada = new PromocionDTO(promocionActualizar.getCodigo(), txtDescripcion.getText(), promocionActualizar.getProducto(),
                        Integer.valueOf(txtCantidad.getText()), Float.valueOf(txtPrecioUnitario.getText()));

                if (promocionActualizada.isValid()) {
                    try {
                        gestorPromociones.actualizarPromocion(promocionActualizada);
                        JOptionPane.showMessageDialog(this, "Se actualizó correctamente la promoción.",
                            "Información", JOptionPane.INFORMATION_MESSAGE);
                    } catch (SubsistemaPromocionesException ex) {
                        JOptionPane.showMessageDialog(this, "No se pudo actualizar la promoción.",
                            "Error", JOptionPane.ERROR_MESSAGE);
                    }
                    dispose();
                } else {
                    JOptionPane.showMessageDialog(this, "Asegúrese de ingresar la información de la promoción correctamente.");
                }
            } catch (InputMismatchException | NumberFormatException e) {
                JOptionPane.showMessageDialog(this, "Asegúrese de ingresar la información de la promoción correctamente.");
            }
        }
    }//GEN-LAST:event_btnAceptarActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        dispose();
    }//GEN-LAST:event_btnCancelarActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAceptar;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JPanel fondo;
    private javax.swing.JLabel lblCantidad;
    private javax.swing.JLabel lblDescripcion;
    private javax.swing.JLabel lblPrecioUnitario;
    private javax.swing.JLabel lblProductos;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JTextField txtCantidad;
    private javax.swing.JTextField txtDescripcion;
    private javax.swing.JTextField txtPrecioUnitario;
    private javax.swing.JTextField txtProducto;
    // End of variables declaration//GEN-END:variables
}

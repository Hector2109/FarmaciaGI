/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JDialog.java to edit this template
 */
package org.itson.diseñosoftware.farmaciagi.interfaces;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;
import org.itson.disenosoftware.farmaciagi_dtos.DireccionDTO;
import org.itson.disenosoftware.farmaciagi_dtos.ProveedorDTO;
import org.itson.disenosoftware.farmaciagi_subsistema_proveedores.GestorProveedores;
import org.itson.disenosoftware.farmaciagi_subsistema_proveedores.IGestorProveedores;
import org.itson.disenosoftware.farmaciagi_subsistema_proveedores.excepciones.GestorProveedoresException;

/**
 *
 * @author renec
 */
public class DlgConfigProveedor extends javax.swing.JDialog {
    
    private int operacion;
    private ProveedorDTO proveedorSeleccionado;
    private IGestorProveedores gestorProveedores;
    
    /**
     * Creates new form DlgConfigProveedor
     */
    public DlgConfigProveedor(java.awt.Frame parent, boolean modal, int operacion, ProveedorDTO provedorSeleccionado) {
        super(parent, modal);
        initComponents();
        this.operacion = operacion;
        this.proveedorSeleccionado = provedorSeleccionado;
        this.gestorProveedores = new GestorProveedores();
        
        if (operacion == ConstantesGUI.REGISTRAR) {
            btnAccion.setText("Registrar");
            this.setTitle("Registro de Proveedores");
        } else {
            btnAccion.setText("Actualizar");
            this.setTitle("Actualizacion de Proveedores");
            txtNombre.setText(provedorSeleccionado.getNombre());
            txtRFC.setText(provedorSeleccionado.getRfc());
            txtCalle.setText(provedorSeleccionado.getDireccion().getCalle());
            txtCiudad.setText(provedorSeleccionado.getDireccion().getCiudad());
            txtColonia.setText(provedorSeleccionado.getDireccion().getColonia());
            txtNumero.setText(provedorSeleccionado.getDireccion().getNumero());
            txtCP.setText(provedorSeleccionado.getDireccion().getCodigo_postal());

            List<String> telefonosExistentes = provedorSeleccionado.getTelefonos();
            StringBuilder telefonos = new StringBuilder();
            for (String telefonosExistente : telefonosExistentes) {
                telefonos.append(telefonosExistente).append(",");
            }
            if (telefonos.length() > 0) {
                telefonos.delete(telefonos.length() - 2, telefonos.length());
            }
            txtATelefonos.setText(telefonos.toString());
        }
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
        btnCancelar = new javax.swing.JButton();
        btnAccion = new javax.swing.JButton();
        txtNombre = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtRFC = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtATelefonos = new javax.swing.JTextArea();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtCalle = new javax.swing.JTextField();
        txtNumero = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txtColonia = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        txtCP = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        txtCiudad = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        fondo.setBackground(new java.awt.Color(216, 215, 255));
        fondo.setPreferredSize(new java.awt.Dimension(300, 250));

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("INFORMACIÓN DEL PROVEEDOR:");

        btnCancelar.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        btnCancelar.setText("CANCELAR");
        btnCancelar.setFocusPainted(false);
        btnCancelar.setMaximumSize(new java.awt.Dimension(100, 30));
        btnCancelar.setPreferredSize(new java.awt.Dimension(173, 48));
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        btnAccion.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        btnAccion.setText("x");
        btnAccion.setFocusPainted(false);
        btnAccion.setMaximumSize(new java.awt.Dimension(100, 30));
        btnAccion.setPreferredSize(new java.awt.Dimension(173, 48));
        btnAccion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAccionActionPerformed(evt);
            }
        });

        txtNombre.setBackground(new java.awt.Color(255, 255, 255));
        txtNombre.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        txtNombre.setDisabledTextColor(new java.awt.Color(255, 255, 255));
        txtNombre.setPreferredSize(new java.awt.Dimension(36, 37));

        jLabel2.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel2.setText("NOMBRE:");

        jLabel3.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel3.setText("RFC:");

        txtRFC.setBackground(new java.awt.Color(255, 255, 255));
        txtRFC.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        txtRFC.setDisabledTextColor(new java.awt.Color(255, 255, 255));
        txtRFC.setPreferredSize(new java.awt.Dimension(36, 37));

        jLabel4.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel4.setText("*Separar numeros telefonicos con comas (,)");

        txtATelefonos.setColumns(20);
        txtATelefonos.setRows(5);
        jScrollPane1.setViewportView(txtATelefonos);

        jLabel5.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel5.setText("DIRECCION");

        jLabel6.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel6.setText("CALLE:");

        txtCalle.setBackground(new java.awt.Color(255, 255, 255));
        txtCalle.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        txtCalle.setDisabledTextColor(new java.awt.Color(255, 255, 255));
        txtCalle.setPreferredSize(new java.awt.Dimension(36, 37));

        txtNumero.setBackground(new java.awt.Color(255, 255, 255));
        txtNumero.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        txtNumero.setDisabledTextColor(new java.awt.Color(255, 255, 255));
        txtNumero.setPreferredSize(new java.awt.Dimension(36, 37));

        jLabel7.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel7.setText("NUMERO:");

        jLabel8.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel8.setText("COLONIA");

        txtColonia.setBackground(new java.awt.Color(255, 255, 255));
        txtColonia.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        txtColonia.setDisabledTextColor(new java.awt.Color(255, 255, 255));
        txtColonia.setPreferredSize(new java.awt.Dimension(36, 37));

        jLabel9.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel9.setText("CP:");

        txtCP.setBackground(new java.awt.Color(255, 255, 255));
        txtCP.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        txtCP.setDisabledTextColor(new java.awt.Color(255, 255, 255));
        txtCP.setPreferredSize(new java.awt.Dimension(36, 37));

        jLabel10.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel10.setText("CIUDAD:");

        txtCiudad.setBackground(new java.awt.Color(255, 255, 255));
        txtCiudad.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        txtCiudad.setDisabledTextColor(new java.awt.Color(255, 255, 255));
        txtCiudad.setPreferredSize(new java.awt.Dimension(36, 37));

        jLabel11.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel11.setText("TELEFONOS:");

        javax.swing.GroupLayout fondoLayout = new javax.swing.GroupLayout(fondo);
        fondo.setLayout(fondoLayout);
        fondoLayout.setHorizontalGroup(
            fondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(fondoLayout.createSequentialGroup()
                .addGroup(fondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(fondoLayout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addComponent(jLabel1))
                    .addGroup(fondoLayout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addGroup(fondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(fondoLayout.createSequentialGroup()
                                .addGap(24, 24, 24)
                                .addGroup(fondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(fondoLayout.createSequentialGroup()
                                        .addComponent(jLabel9)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(txtCP, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(fondoLayout.createSequentialGroup()
                                        .addComponent(jLabel6)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(txtCalle, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(18, 18, 18)
                                .addGroup(fondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(fondoLayout.createSequentialGroup()
                                        .addComponent(jLabel10)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtCiudad, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 0, Short.MAX_VALUE))
                                    .addGroup(fondoLayout.createSequentialGroup()
                                        .addComponent(jLabel7)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtNumero, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jLabel8)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtColonia, javax.swing.GroupLayout.DEFAULT_SIZE, 151, Short.MAX_VALUE))))
                            .addGroup(fondoLayout.createSequentialGroup()
                                .addComponent(jLabel11)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(fondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(fondoLayout.createSequentialGroup()
                                        .addComponent(jLabel4)
                                        .addGap(0, 0, Short.MAX_VALUE))
                                    .addComponent(jScrollPane1))))))
                .addGap(50, 50, 50))
            .addGroup(fondoLayout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnAccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40))
            .addGroup(fondoLayout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(fondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel5)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(62, 62, 62)
                .addComponent(jLabel3)
                .addGap(18, 18, 18)
                .addComponent(txtRFC, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(50, 50, 50))
        );
        fondoLayout.setVerticalGroup(
            fondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(fondoLayout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(fondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtRFC, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(18, 18, 18)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(fondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(fondoLayout.createSequentialGroup()
                        .addGroup(fondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addComponent(txtCalle, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7)
                            .addComponent(txtNumero, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                        .addGroup(fondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel9)
                            .addComponent(txtCP, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel10)
                            .addComponent(txtCiudad, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(fondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(fondoLayout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(fondoLayout.createSequentialGroup()
                                .addGap(26, 26, 26)
                                .addComponent(jLabel11)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(fondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnAccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(15, 15, 15))
                    .addGroup(fondoLayout.createSequentialGroup()
                        .addGroup(fondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel8)
                            .addComponent(txtColonia, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(fondo, javax.swing.GroupLayout.DEFAULT_SIZE, 706, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(fondo, javax.swing.GroupLayout.DEFAULT_SIZE, 396, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        dispose();
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void btnAccionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAccionActionPerformed
        if (operacion == ConstantesGUI.REGISTRAR) {     
            if (validarCampos()) {
                String telefonos = txtATelefonos.getText();
                String[] telefonosArray = telefonos.split(",");
                
                List<String> listaTelefonos = new ArrayList<>();
                for (String telefonosA : telefonosArray) {
                    listaTelefonos.add(telefonosA);
                }
                
                proveedorSeleccionado = new ProveedorDTO(
                        txtNombre.getText(),
                        new DireccionDTO(
                                txtCalle.getText(),
                                txtColonia.getText(),
                                txtNumero.getText(),
                                txtCP.getText(),
                                txtCiudad.getText()
                        ),
                        listaTelefonos,
                        txtRFC.getText()
                );
                
                gestorProveedores.registrarProveedor(proveedorSeleccionado);
                dispose();
            }
        } else {
            if (validarCampos()) {
                String telefonos = txtATelefonos.getText();
                String[] telefonosArray = telefonos.split(",");
                
                List<String> listaTelefonos = new ArrayList<>();
                for (String telefonosA : telefonosArray) {
                    listaTelefonos.add(telefonosA);
                }
                
                proveedorSeleccionado = new ProveedorDTO(
                        txtNombre.getText(),
                        new DireccionDTO(
                                txtCalle.getText(),
                                txtColonia.getText(),
                                txtNumero.getText(),
                                txtCP.getText(),
                                txtCiudad.getText()
                        ),
                        listaTelefonos,
                        txtRFC.getText()
                );
                
                try {
                    gestorProveedores.actualizarProveedor(proveedorSeleccionado);
                } catch (GestorProveedoresException ex) {
                    Logger.getLogger(DlgConfigProveedor.class.getName()).log(Level.SEVERE, null, ex);
                }
                dispose();
            }
        }
    }//GEN-LAST:event_btnAccionActionPerformed

    public boolean validarCampos() {
        if (txtNombre.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "El campo Nombre no puede estar vacío", "Error", JOptionPane.ERROR_MESSAGE);
            return false;
        }

        if (txtRFC.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "El campo RFC no puede estar vacío", "Error", JOptionPane.ERROR_MESSAGE);
            return false;
        }

        if (txtCalle.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "El campo Calle no puede estar vacío", "Error", JOptionPane.ERROR_MESSAGE);
            return false;
        }

        if (txtNumero.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "El campo Número no puede estar vacío", "Error", JOptionPane.ERROR_MESSAGE);
            return false;
        }

        if (txtColonia.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "El campo Colonia no puede estar vacío", "Error", JOptionPane.ERROR_MESSAGE);
            return false;
        }

        if (txtCP.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "El campo codigo postal no puede estar vacío", "Error", JOptionPane.ERROR_MESSAGE);
            return false;
        }

        String codigoPostal = txtCP.getText().trim();
        String codigoPostalRegex = "\\d+";
        if (!codigoPostal.matches(codigoPostalRegex)) {
            JOptionPane.showMessageDialog(this, "El código postal debe contener solo números", "Error", JOptionPane.ERROR_MESSAGE);
            return false;
        }

        if (txtCiudad.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "El campo Ciudad no puede estar vacío", "Error", JOptionPane.ERROR_MESSAGE);
            return false;
        }

        if (txtATelefonos.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "El campo Teléfonos no puede estar vacío", "Error", JOptionPane.ERROR_MESSAGE);
            return false;
        }

        String telefonos = txtATelefonos.getText();
        String[] telefonosArray = telefonos.split(",");

        String telefonoRegex = "^(\\+\\d{1,3}( )?)?((\\(\\d{1,3}\\))|\\d{1,3})[- .]?\\d{3,4}[- .]?\\d{4}$"; // Expresión regular para el formato de teléfono mexicano (10 dígitos)

        for (String telefono : telefonosArray) {
            telefono = telefono.trim(); 
            Pattern telefonoPattern = Pattern.compile(telefonoRegex);
            Matcher telefonoMatcher = telefonoPattern.matcher(telefono);

            if (!telefonoMatcher.matches()) {
                JOptionPane.showMessageDialog(this, "El formato del teléfono '" + telefono + "' no es válido", "Error", JOptionPane.ERROR_MESSAGE);
                return false;
            }
        }

        String rfcRegex = "[A-Z]{4}[0-9]{6}[A-Z0-9]{3}"; // Expresión regular para el formato de RFC
        Pattern rfcPattern = Pattern.compile(rfcRegex);
        Matcher rfcMatcher = rfcPattern.matcher(txtRFC.getText());
        if (!rfcMatcher.matches()) {
            JOptionPane.showMessageDialog(this, "El RFC ingresado no es válido", "Error", JOptionPane.ERROR_MESSAGE);
            return false;
        }
        
        return true;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAccion;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JPanel fondo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea txtATelefonos;
    private javax.swing.JTextField txtCP;
    private javax.swing.JTextField txtCalle;
    private javax.swing.JTextField txtCiudad;
    private javax.swing.JTextField txtColonia;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtNumero;
    private javax.swing.JTextField txtRFC;
    // End of variables declaration//GEN-END:variables
}

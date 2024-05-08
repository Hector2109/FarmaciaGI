/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JDialog.java to edit this template
 */
package org.itson.diseñosoftware.farmaciagi.interfaces;

import java.awt.Color;
import java.awt.Frame;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumnModel;
import org.itson.disenosoftware.farmaciagi_dtos.ProductoDTO;
import org.itson.disenosoftware.farmaciagi_subsistema_productos.GestorProductos;
import org.itson.disenosoftware.farmaciagi_subsistema_productos.IGestorProductos;

/**
 *
 * @author Hector Espinoza
 */
public class DlgInventarioProductos extends javax.swing.JDialog {

    private IGestorProductos gestorProductos;
    private Frame parent;
    private int constante;

    /**
     * Creates new form DlgInventarioProductos
     */
    public DlgInventarioProductos(java.awt.Frame parent, boolean modal, int decision) {
        super(parent, modal);
        gestorProductos = new GestorProductos();
        this.constante = decision;
        this.parent = parent;
        initComponents();
        
        btnActualizar.setBackground(Color.WHITE);
        btnVolver.setBackground(Color.WHITE);
        
        llenarTablaProductos();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        btnProductos = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        btnCompras = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        btnProveedores = new javax.swing.JButton();
        jPanel6 = new javax.swing.JPanel();
        btnVenta = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblProductosInventario = new javax.swing.JTable();
        btnVolver = new javax.swing.JButton();
        btnActualizar = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(216, 215, 255));

        jPanel2.setBackground(new java.awt.Color(166, 164, 255));
        jPanel2.setPreferredSize(new java.awt.Dimension(145, 145));
        jPanel2.setRequestFocusEnabled(false);

        btnProductos.setBackground(new java.awt.Color(216, 215, 255));
        btnProductos.setForeground(new java.awt.Color(166, 164, 255));
        btnProductos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/prouctos1.png"))); // NOI18N
        btnProductos.setBorderPainted(false);
        btnProductos.setFocusPainted(false);
        btnProductos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProductosActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btnProductos, javax.swing.GroupLayout.DEFAULT_SIZE, 145, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btnProductos, javax.swing.GroupLayout.DEFAULT_SIZE, 115, Short.MAX_VALUE)
        );

        jPanel3.setBackground(new java.awt.Color(166, 164, 255));
        jPanel3.setPreferredSize(new java.awt.Dimension(145, 145));
        jPanel3.setRequestFocusEnabled(false);

        btnCompras.setBackground(new java.awt.Color(166, 164, 255));
        btnCompras.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icono_carrito.png"))); // NOI18N
        btnCompras.setBorderPainted(false);
        btnCompras.setFocusPainted(false);
        btnCompras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnComprasActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btnCompras, javax.swing.GroupLayout.DEFAULT_SIZE, 145, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btnCompras, javax.swing.GroupLayout.DEFAULT_SIZE, 115, Short.MAX_VALUE)
        );

        jPanel5.setBackground(new java.awt.Color(166, 164, 255));
        jPanel5.setPreferredSize(new java.awt.Dimension(145, 145));
        jPanel5.setRequestFocusEnabled(false);

        btnProveedores.setBackground(new java.awt.Color(166, 164, 255));
        btnProveedores.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proveedor.png"))); // NOI18N
        btnProveedores.setBorder(null);
        btnProveedores.setFocusPainted(false);
        btnProveedores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProveedoresActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btnProveedores, javax.swing.GroupLayout.DEFAULT_SIZE, 145, Short.MAX_VALUE)
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btnProveedores, javax.swing.GroupLayout.DEFAULT_SIZE, 114, Short.MAX_VALUE)
        );

        jPanel6.setBackground(new java.awt.Color(166, 164, 255));
        jPanel6.setPreferredSize(new java.awt.Dimension(145, 145));
        jPanel6.setRequestFocusEnabled(false);

        btnVenta.setBackground(new java.awt.Color(166, 164, 255));
        btnVenta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagenVenta.png"))); // NOI18N
        btnVenta.setBorder(null);
        btnVenta.setFocusPainted(false);
        btnVenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVentaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btnVenta, javax.swing.GroupLayout.DEFAULT_SIZE, 145, Short.MAX_VALUE)
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btnVenta, javax.swing.GroupLayout.DEFAULT_SIZE, 115, Short.MAX_VALUE)
        );

        tblProductosInventario.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        tblProductosInventario.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "CÓDIGO", "NOMBRE", "MARCA", "COSTO"
            }
        ));
        jScrollPane1.setViewportView(tblProductosInventario);

        btnVolver.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        btnVolver.setText("VOLVER");
        btnVolver.setFocusPainted(false);
        btnVolver.setPreferredSize(new java.awt.Dimension(173, 48));
        btnVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVolverActionPerformed(evt);
            }
        });

        btnActualizar.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        btnActualizar.setText("CONTINUAR");
        btnActualizar.setFocusPainted(false);
        btnActualizar.setPreferredSize(new java.awt.Dimension(173, 48));
        btnActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActualizarActionPerformed(evt);
            }
        });

        jPanel4.setBackground(new java.awt.Color(166, 164, 255));
        jPanel4.setPreferredSize(new java.awt.Dimension(145, 145));
        jPanel4.setRequestFocusEnabled(false);

        jButton1.setBackground(new java.awt.Color(166, 164, 255));
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/tagIcon.png"))); // NOI18N
        jButton1.setActionCommand("btnPromociones");
        jButton1.setBorderPainted(false);
        jButton1.setFocusPainted(false);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, 145, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, 115, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 895, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 6, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnVolver, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnActualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(49, 49, 49))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 430, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 72, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnVolver, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnActualizar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnProductosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProductosActionPerformed
        dispose();
        DlgProductosPrincipal menuProductos = new DlgProductosPrincipal(parent, true);
        menuProductos.setVisible(true);
    }//GEN-LAST:event_btnProductosActionPerformed

    private void btnProveedoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProveedoresActionPerformed
        dispose();
        DlgProveedores proveedores = new DlgProveedores(parent, true);
        proveedores.setVisible(true);
    }//GEN-LAST:event_btnProveedoresActionPerformed

    private void btnVentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVentaActionPerformed
        dispose();
        PantallaVenta venta = new PantallaVenta();
        venta.setVisible(true);
    }//GEN-LAST:event_btnVentaActionPerformed

    private void btnVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVolverActionPerformed
        dispose();
        DlgProductosPrincipal productosPrincipal = new DlgProductosPrincipal(parent, true);
        productosPrincipal.setVisible(true);
    }//GEN-LAST:event_btnVolverActionPerformed

    private void btnActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarActionPerformed

        ProductoDTO producto = obtenerProductoSeleccionado();

        if (producto != null) {

            if (constante == ConstantesGUI.ASIGNAR_PROVEEDOR) {
                dispose();
                DlgInventarioProveedores proveedores = new DlgInventarioProveedores(parent, true, producto);
                proveedores.setVisible(true);
            } else if (constante == ConstantesGUI.ACTUALIZAR){
                dispose();
                DlgRegistroProductos actualizar = new DlgRegistroProductos(parent, true, producto);
                actualizar.setVisible(true);
            }

        } else {
            JOptionPane.showMessageDialog(rootPane, "Haga click en algún producto y seleccione continuar", "No se seleccino ningún producto", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_btnActualizarActionPerformed

    private void btnComprasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnComprasActionPerformed
        dispose();
        DlgComprarProductos productosPrincipal = new DlgComprarProductos(parent, true);
        productosPrincipal.setVisible(true);
    }//GEN-LAST:event_btnComprasActionPerformed

    private void llenarTablaProductos() {
        DefaultTableModel modelo = new DefaultTableModel();

        modelo.addColumn("CODIGO");
        modelo.addColumn("NOMBRE");
        modelo.addColumn("MARCA");
        modelo.addColumn("COSTO");

        for (ProductoDTO p : gestorProductos.obtnerInventario()) {
            Object[] fila = {
                p.getCodigo(),
                p.getNombre(),
                p.getMarca(),
                p.getCosto(),};
            modelo.addRow(fila);
        }

        tblProductosInventario.setModel(modelo);
        TableColumnModel columnModel = tblProductosInventario.getColumnModel();

    }

    private ProductoDTO obtenerProductoSeleccionado() {

        int filaSeleccionada = tblProductosInventario.getSelectedRow();

        if (filaSeleccionada != -1) {
            int filaModelo = tblProductosInventario.convertRowIndexToModel(filaSeleccionada);

            DefaultTableModel modelo = (DefaultTableModel) tblProductosInventario.getModel();

            String codigo = modelo.getValueAt(filaModelo, 0).toString();
            String nombre = modelo.getValueAt(filaModelo, 1).toString();
            String marca = modelo.getValueAt(filaModelo, 2).toString();
            Float costo = Float.parseFloat(modelo.getValueAt(filaModelo, 3).toString());

            ProductoDTO productoSeleccionado = new ProductoDTO();
            productoSeleccionado.setCodigo(codigo);
            productoSeleccionado.setNombre(nombre);
            productoSeleccionado.setMarca(marca);
            productoSeleccionado.setCosto(costo);

            return productoSeleccionado;
        } else {
            return null;
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnActualizar;
    private javax.swing.JButton btnCompras;
    private javax.swing.JButton btnProductos;
    private javax.swing.JButton btnProveedores;
    private javax.swing.JButton btnVenta;
    private javax.swing.JButton btnVolver;
    private javax.swing.JButton jButton1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblProductosInventario;
    // End of variables declaration//GEN-END:variables
}

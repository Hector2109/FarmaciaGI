package org.itson.diseñosoftware.farmaciagi.interfaces;

import java.awt.Color;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumnModel;
import org.itson.disenosoftware.farmaciagi_subsistema_productos.GestorProductos;
import org.itson.disenosoftware.farmaciagi_subsistema_productos.IGestorProductos;
import org.itson.disenosoftware.farmaciagi_subsistema_ventas.GestorVentas;
import org.itson.disenosoftware.farmaciagi_subsistema_ventas.IGestorVentas;

public class PantallaVenta extends javax.swing.JFrame {

    private Float total;
    private IGestorProductos gestorInventario;
    private IGestorVentas gestorVenta;

    public PantallaVenta() {
        initComponents();
        this.gestorInventario = new GestorProductos();
        this.gestorVenta = new GestorVentas();
        this.total = 0.0F;
        btnBuscarProducto.setBackground(Color.WHITE);
        btnContinuar.setBackground(Color.WHITE);
        llenarTabla();
    }

    public static void main(String[] args) {
        // Crear una instancia de PantallaVenta y pasarle el inventario
        PantallaVenta pantallaVenta = new PantallaVenta();

        // Hacer visible la pantalla de venta
        pantallaVenta.setVisible(true);
    }

    public void limpiarVenta() {
        productosVenta.getProductos().clear();
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
        jPanel3 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        btnVenta = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblVenta = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        txtTotal = new javax.swing.JTextField();
        btnBuscarProducto = new javax.swing.JButton();
        btnContinuar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setName("Pantalla Venta"); // NOI18N

        jPanel1.setBackground(new java.awt.Color(216, 215, 255));

        jPanel2.setBackground(new java.awt.Color(166, 164, 255));
        jPanel2.setPreferredSize(new java.awt.Dimension(145, 145));
        jPanel2.setRequestFocusEnabled(false);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 145, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 145, Short.MAX_VALUE)
        );

        jPanel3.setBackground(new java.awt.Color(166, 164, 255));
        jPanel3.setPreferredSize(new java.awt.Dimension(145, 145));
        jPanel3.setRequestFocusEnabled(false);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 145, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 145, Short.MAX_VALUE)
        );

        jPanel5.setBackground(new java.awt.Color(166, 164, 255));
        jPanel5.setPreferredSize(new java.awt.Dimension(145, 145));
        jPanel5.setRequestFocusEnabled(false);

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 145, Short.MAX_VALUE)
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 145, Short.MAX_VALUE)
        );

        jPanel6.setBackground(new java.awt.Color(166, 164, 255));
        jPanel6.setPreferredSize(new java.awt.Dimension(145, 145));
        jPanel6.setRequestFocusEnabled(false);

        jLabel1.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("VENTA");

        btnVenta.setBackground(new java.awt.Color(166, 164, 255));
        btnVenta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagenVenta.png"))); // NOI18N
        btnVenta.setBorder(null);

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jLabel1)
                .addContainerGap(34, Short.MAX_VALUE))
            .addComponent(btnVenta, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addComponent(btnVenta, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        tblVenta.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        tblVenta.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "ARTÍCULO", "CANTIDAD", "IMPORTE"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblVenta);

        jLabel2.setFont(new java.awt.Font("Arial", 1, 30)); // NOI18N
        jLabel2.setText("TOTAL");

        txtTotal.setEditable(false);
        txtTotal.setBackground(new java.awt.Color(255, 255, 255));
        txtTotal.setFont(new java.awt.Font("Arial", 1, 30)); // NOI18N
        txtTotal.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txtTotal.setText("0.0");
        txtTotal.setDisabledTextColor(new java.awt.Color(255, 255, 255));

        btnBuscarProducto.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        btnBuscarProducto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Lupa.png"))); // NOI18N
        btnBuscarProducto.setText(" | BUSCAR PRODUCTO");
        btnBuscarProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarProductoActionPerformed(evt);
            }
        });

        btnContinuar.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        btnContinuar.setText("CONTINUAR");
        btnContinuar.setPreferredSize(new java.awt.Dimension(173, 48));
        btnContinuar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnContinuarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnBuscarProducto)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnContinuar, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addComponent(txtTotal))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 895, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 30, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 418, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(txtTotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnBuscarProducto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnContinuar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap())))
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

    private void btnBuscarProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarProductoActionPerformed
        if (!inventario.getProductos().isEmpty()) {
            DlgBuscarProducto busquedaProducto = new DlgBuscarProducto(this, true, gestorInventario, gestorProductosVenta);
            busquedaProducto.setVisible(true);
            llenarTabla();
            establecerTotal();
        } else {
            JOptionPane.showMessageDialog(rootPane, "No hay inventario", "Error en persistencia", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnBuscarProductoActionPerformed

    private void btnContinuarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnContinuarActionPerformed
        if (total != 0.0F) {
            DlgTipoPago pago = new DlgTipoPago(this, true, total, gestorProductosVenta, gestorVenta);
            pago.setVisible(true);
            limpiarVenta();
            llenarTabla();
            establecerTotal();
        } else {
            JOptionPane.showMessageDialog(this, "Asegúrese de agregar productos a la venta.",
                    "Venta vacía", JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_btnContinuarActionPerformed

    //Métodos 
    private void llenarTabla() {
        DefaultTableModel modelo = new DefaultTableModel();

        modelo.addColumn("ARTICULO");
        modelo.addColumn("");
        modelo.addColumn("CANTIDAD");
        modelo.addColumn("");
        modelo.addColumn("IMPORTE UNITARIO");

        if (!gestorProductosVenta.obtenerProductos().isEmpty()) {
            for (ProductoDTO producto : gestorProductosVenta.obtenerProductos()) {
                Object[] fila = {
                    producto.getNombre(),
                    "-",
                    producto.getCantidad(),
                    "+",
                    producto.getCosto()
                };
                modelo.addRow(fila);
            }
        }

        tblVenta.setModel(modelo);
        TableColumnModel columnModel = tblVenta.getColumnModel();

        ButtonColumn botonRestar = new ButtonColumn("-", (e) -> {
            int fila = tblVenta.convertRowIndexToModel(tblVenta.getSelectedRow());

            try {
                ProductoDTO producto = gestorProductosVenta.obtenerProducto(gestorProductosVenta.obtenerProductos().get(fila));
                producto.setCantidad(producto.getCantidad() - 1);
                if (producto.getCantidad() == 0) {
                    ProductoDTO productoActual = gestorInventario.obtenerProducto(producto);
                    productoActual.setCantidad(productoActual.getCantidad() + 1);
                    gestorInventario.actualizarProducto(productoActual);
                    gestorProductosVenta.eliminarProducto(producto);
                } else {
                    ProductoDTO productoActual = gestorInventario.obtenerProducto(producto);
                    productoActual.setCantidad(productoActual.getCantidad() + 1);
                    gestorInventario.actualizarProducto(productoActual);
                    gestorProductosVenta.actualizarProducto(producto);
                }
            } catch (PersistenciaException ex) {
                Logger.getLogger(PantallaVenta.class.getName()).log(Level.SEVERE, null, ex);
            }
            llenarTabla();
            establecerTotal();
        });
        tblVenta.getColumnModel().getColumn(1).setCellRenderer(botonRestar);
        tblVenta.getColumnModel().getColumn(1).setCellEditor(botonRestar);

        ButtonColumn botonSumar = new ButtonColumn("+", (e) -> {
            int fila = tblVenta.convertRowIndexToModel(tblVenta.getSelectedRow());
            try {
                ProductoDTO producto = gestorProductosVenta.obtenerProducto(gestorProductosVenta.obtenerProductos().get(fila));
                ProductoDTO productoActual = gestorInventario.obtenerProducto(producto);

                if (productoActual.getCantidad() >= 1) {

                    productoActual.setCantidad(productoActual.getCantidad() - 1);
                    gestorInventario.actualizarProducto(productoActual);

                    producto.setCantidad(producto.getCantidad() + 1);
                    gestorProductosVenta.actualizarProducto(producto);

                } else {
                    JOptionPane.showMessageDialog(rootPane, "Ya no hay inventario unu", "Inventario", JOptionPane.WARNING_MESSAGE);
                }
            } catch (PersistenciaException ex) {
                Logger.getLogger(PantallaVenta.class.getName()).log(Level.SEVERE, null, ex);
            }
            llenarTabla();
            establecerTotal();
        });
        tblVenta.getColumnModel().getColumn(3).setCellRenderer(botonSumar);
        tblVenta.getColumnModel().getColumn(3).setCellEditor(botonSumar);
    }

    private void establecerTotal() {
        Float sumaTotal = 0.0F;
        for (ProductoDTO producto : gestorProductosVenta.obtenerProductos()) {
            sumaTotal += producto.getCantidad() * producto.getCosto();
        }
        float decimal = (float) Math.pow(10, 2);
        total = Math.round(sumaTotal * decimal) / decimal;
        txtTotal.setText(total.toString());
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuscarProducto;
    private javax.swing.JButton btnContinuar;
    private javax.swing.JButton btnVenta;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblVenta;
    private javax.swing.JTextField txtTotal;
    // End of variables declaration//GEN-END:variables
}

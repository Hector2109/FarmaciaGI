package org.itson.diseñosoftware.farmaciagi.interfaces;

import java.awt.Color;
import java.util.GregorianCalendar;
import java.util.LinkedList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumnModel;
import org.itson.disenosoftware.farmaciagi_dtos.ProductoDTO;
import org.itson.disenosoftware.farmaciagi_dtos.PromocionDTO;
import org.itson.disenosoftware.farmaciagi_dtos.VentaDTO;
import org.itson.disenosoftware.farmaciagi_subsistema_productos.GestorProductos;
import org.itson.disenosoftware.farmaciagi_subsistema_productos.IGestorProductos;
import org.itson.disenosoftware.farmaciagi_subsistema_productos.excepciones.GestorProductosException;
import org.itson.disenosoftware.farmaciagi_subsistema_promociones.GestorPromociones;
import org.itson.disenosoftware.farmaciagi_subsistema_promociones.IGestorPromociones;

public class PantallaVenta extends javax.swing.JFrame {

    private Float total;
    private IGestorProductos gestorInventario;
    private IGestorPromociones gestorPromociones;
    private List<ProductoDTO> productosVenta;
    private List<PromocionDTO> promocionesVenta;

    public PantallaVenta() {
        initComponents();
        this.gestorInventario = new GestorProductos();
        this.gestorPromociones = new GestorPromociones();
        this.productosVenta = new LinkedList<>();
        this.promocionesVenta = new LinkedList<>();
        this.total = 0.0F;
        btnBuscarProducto.setBackground(Color.WHITE);
        btnContinuar.setBackground(Color.WHITE);
        llenarTablaProductosVenta();
    }

    public static void main(String[] args) {
        // Crear una instancia de PantallaVenta y pasarle el inventario
        PantallaVenta pantallaVenta = new PantallaVenta();
        // Hacer visible la pantalla de venta
        pantallaVenta.setVisible(true);
    }

    public void limpiarVenta() {
        productosVenta.clear();
        promocionesVenta.clear();
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
        btnComprarProductos = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        btnProveedores = new javax.swing.JButton();
        jPanel6 = new javax.swing.JPanel();
        btnVenta = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblProductosVenta = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        txtTotal = new javax.swing.JTextField();
        btnBuscarProducto = new javax.swing.JButton();
        btnContinuar = new javax.swing.JButton();
        lblPromociones = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblPromocionesVenta = new javax.swing.JTable();
        jPanel4 = new javax.swing.JPanel();
        btnPromociones = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setName("Pantalla Venta"); // NOI18N
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(216, 215, 255));

        jPanel2.setBackground(new java.awt.Color(166, 164, 255));
        jPanel2.setPreferredSize(new java.awt.Dimension(145, 145));
        jPanel2.setRequestFocusEnabled(false);

        btnProductos.setBackground(new java.awt.Color(166, 164, 255));
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

        btnComprarProductos.setBackground(new java.awt.Color(166, 164, 255));
        btnComprarProductos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icono_carrito.png"))); // NOI18N
        btnComprarProductos.setBorderPainted(false);
        btnComprarProductos.setFocusPainted(false);
        btnComprarProductos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnComprarProductosActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btnComprarProductos, javax.swing.GroupLayout.DEFAULT_SIZE, 145, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btnComprarProductos, javax.swing.GroupLayout.DEFAULT_SIZE, 115, Short.MAX_VALUE)
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

        btnVenta.setBackground(new java.awt.Color(216, 215, 255));
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

        tblProductosVenta.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        tblProductosVenta.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(tblProductosVenta);

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
        btnBuscarProducto.setFocusPainted(false);
        btnBuscarProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarProductoActionPerformed(evt);
            }
        });

        btnContinuar.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        btnContinuar.setText("CONTINUAR");
        btnContinuar.setFocusPainted(false);
        btnContinuar.setPreferredSize(new java.awt.Dimension(173, 48));
        btnContinuar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnContinuarActionPerformed(evt);
            }
        });

        lblPromociones.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        lblPromociones.setText("Promociones");

        tblPromocionesVenta.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "DESCRIPCIÓN"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(tblPromocionesVenta);

        jPanel4.setBackground(new java.awt.Color(166, 164, 255));
        jPanel4.setPreferredSize(new java.awt.Dimension(145, 145));
        jPanel4.setRequestFocusEnabled(false);

        btnPromociones.setBackground(new java.awt.Color(166, 164, 255));
        btnPromociones.setIcon(new javax.swing.ImageIcon(getClass().getResource("/tagIcon.png"))); // NOI18N
        btnPromociones.setBorderPainted(false);
        btnPromociones.setFocusPainted(false);
        btnPromociones.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPromocionesActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btnPromociones, javax.swing.GroupLayout.DEFAULT_SIZE, 145, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btnPromociones, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(btnBuscarProducto)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnContinuar, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addComponent(txtTotal))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 895, Short.MAX_VALUE)
                    .addComponent(lblPromociones)
                    .addComponent(jScrollPane2))
                .addGap(0, 30, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 258, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblPromociones)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtTotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnBuscarProducto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnContinuar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(17, 17, 17))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, 115, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 600, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnBuscarProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarProductoActionPerformed
        DlgBuscarProducto busquedaProducto = new DlgBuscarProducto(this, true, productosVenta, promocionesVenta);
        busquedaProducto.setVisible(true);
        llenarTablaProductosVenta();
        llenarTablaPromociones();
        establecerTotal();
    }//GEN-LAST:event_btnBuscarProductoActionPerformed

    private void btnContinuarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnContinuarActionPerformed
        if (!productosVenta.isEmpty()) {
            VentaDTO venta = new VentaDTO("VNT-001", productosVenta, promocionesVenta, total, new GregorianCalendar());
            DlgTipoPago pago = new DlgTipoPago(this, true, venta);
            pago.setVisible(true);
            limpiarVenta();
            llenarTablaProductosVenta();
            llenarTablaPromociones();
            establecerTotal();
        } else {
            JOptionPane.showMessageDialog(this, "Asegúrese de agregar productos a la venta.",
                    "Venta vacía", JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_btnContinuarActionPerformed

    private void btnProveedoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProveedoresActionPerformed
        dispose();
        DlgProveedores proveedores = new DlgProveedores(this, true);
        proveedores.setVisible(true);
    }//GEN-LAST:event_btnProveedoresActionPerformed

    private void btnVentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVentaActionPerformed
        JOptionPane.showMessageDialog(rootPane, "Ya te encuentras en esta ventana");
    }//GEN-LAST:event_btnVentaActionPerformed

    private void btnProductosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProductosActionPerformed
        dispose();
        DlgProductosPrincipal menuProductos = new DlgProductosPrincipal(this, true);
        menuProductos.setVisible(true);
    }//GEN-LAST:event_btnProductosActionPerformed

    private void btnPromocionesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPromocionesActionPerformed
        dispose();
        DlgPromociones pPromociones = new DlgPromociones(this, true);
        pPromociones.setVisible(true);
        llenarTablaPromociones();
    }//GEN-LAST:event_btnPromocionesActionPerformed

    private void btnComprarProductosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnComprarProductosActionPerformed
        dispose();
        DlgComprarProductos productosPrincipal = new DlgComprarProductos(this, true);
        productosPrincipal.setVisible(true);
    }//GEN-LAST:event_btnComprarProductosActionPerformed

    //Métodos 
    private void llenarTablaProductosVenta() {
        DefaultTableModel modelo = new DefaultTableModel();

        modelo.addColumn("ARTICULO");
        modelo.addColumn("");
        modelo.addColumn("CANTIDAD");
        modelo.addColumn("");
        modelo.addColumn("IMPORTE UNITARIO");

        if (!productosVenta.isEmpty()) {
            for (ProductoDTO producto : productosVenta) {
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

        tblProductosVenta.setModel(modelo);
        TableColumnModel columnModel = tblProductosVenta.getColumnModel();

        ButtonColumn botonRestar = new ButtonColumn("-", (e) -> {
            int fila = tblProductosVenta.convertRowIndexToModel(tblProductosVenta.getSelectedRow());
            ProductoDTO productoVenta = null;

            try {
                productoVenta = productosVenta.get(fila);
                int cantidad = productoVenta.getCantidad();
                productoVenta.setCantidad(productoVenta.getCantidad() - 1);

                if (productoVenta.getCantidad() == 0) {
                    ProductoDTO productoActual = gestorInventario.obtenerProducto(productoVenta);
                    productoActual.setCantidad(1);
                    gestorInventario.modCantidadProducto(productoActual);
                    productosVenta.remove(productoVenta);

                } else {
                    ProductoDTO productoActual = gestorInventario.obtenerProducto(productoVenta);
                    productoActual.setCantidad(1);
                    gestorInventario.modCantidadProducto(productoActual);
                    productoVenta.setCantidad(cantidad - 1);
                    productosVenta.set(productosVenta.indexOf(productoVenta), productoVenta);
                }

            } catch (GestorProductosException ex) {
                JOptionPane.showMessageDialog(this, "No se pudo modificar la cantidad del producto.",
                        "Error", JOptionPane.ERROR_MESSAGE);
                Logger.getLogger(PantallaVenta.class.getName()).log(Level.SEVERE, null, ex);
            }
            llenarTablaProductosVenta();
            eliminarPromocion(productoVenta);
            establecerTotal();
        });
        tblProductosVenta.getColumnModel().getColumn(1).setCellRenderer(botonRestar);
        tblProductosVenta.getColumnModel().getColumn(1).setCellEditor(botonRestar);

        ButtonColumn botonSumar = new ButtonColumn("+", (e) -> {
            int fila = tblProductosVenta.convertRowIndexToModel(tblProductosVenta.getSelectedRow());
            ProductoDTO productoAgregado = null;

            try {
                productoAgregado = productosVenta.get(fila);
                Integer cantidadVentaAct = productoAgregado.getCantidad();
                ProductoDTO productoInventario = gestorInventario.obtenerProducto(productoAgregado);

                if (productoInventario.getCantidad() >= 1) {

                    productoInventario.setCantidad(- 1);
                    gestorInventario.modCantidadProducto(productoInventario);

                    productoAgregado.setCantidad(cantidadVentaAct + 1);
                    productosVenta.set(productosVenta.indexOf(productoAgregado), productoAgregado);

                } else {
                    JOptionPane.showMessageDialog(this, "Cantidad del producto en inventario insuficiente.",
                            "Error", JOptionPane.ERROR_MESSAGE);
                }
            } catch (GestorProductosException ex) {
                JOptionPane.showMessageDialog(this, "No se pudo modificar la cantidad del producto.",
                        "Error", JOptionPane.ERROR_MESSAGE);
                Logger.getLogger(PantallaVenta.class.getName()).log(Level.SEVERE, null, ex);
            }
            llenarTablaProductosVenta();
            agregarPromocion(productoAgregado);
            establecerTotal();
        });
        tblProductosVenta.getColumnModel().getColumn(3).setCellRenderer(botonSumar);
        tblProductosVenta.getColumnModel().getColumn(3).setCellEditor(botonSumar);
    }

    private void agregarPromocion(ProductoDTO productoAgregado) {
        List<PromocionDTO> promocionesRegistro = gestorPromociones.obtenerPromociones();
        for (PromocionDTO promocion : promocionesRegistro) {
            if (productoAgregado.equals(promocion.getProducto())) {
                if ((productoAgregado.getCantidad() % promocion.getCantidad()) == 0) {
                    promocionesVenta.add(promocion);
                }
            }
        }
        llenarTablaPromociones();
    }

    private void eliminarPromocion(ProductoDTO productoEliminado) {
        if (productoEliminado != null) {
            for (PromocionDTO promocion : promocionesVenta) {
                if (promocion.getProducto().equals(productoEliminado)) {
                    if ((productoEliminado.getCantidad() % promocion.getCantidad()) != 0) {
                        promocionesVenta.remove(promocion);
                        break;
                    }
                }
            }
            llenarTablaPromociones();
        }
    }

    private void llenarTablaPromociones() {
        DefaultTableModel modelo = new DefaultTableModel();

        modelo.addColumn("PROMOCIONES");

        if (!promocionesVenta.isEmpty()) {
            for (PromocionDTO promocion : promocionesVenta) {
                Object[] fila = {
                    promocion.getDescripcion()
                };
                modelo.addRow(fila);
            }
        }

        tblPromocionesVenta.setModel(modelo);
        TableColumnModel columnModel = tblPromocionesVenta.getColumnModel();
    }

    private void establecerTotal() {
        Float sumaTotal = 0.0F;
        for (ProductoDTO producto : productosVenta) {
            sumaTotal += producto.getCantidad() * producto.getCosto();
            for (PromocionDTO promocion : promocionesVenta) {
                if (promocion.getProducto().equals(producto)) {
                    if ((producto.getCantidad() % promocion.getCantidad()) == 0) {
                        sumaTotal -= producto.getCantidad() * producto.getCosto();
                        sumaTotal += producto.getCantidad() * promocion.getPrecioUnitario();
                    } else {
                        int division = producto.getCantidad() / promocion.getCantidad();
                        sumaTotal -= division * producto.getCosto();
                    }
                    break;
                }
            }
        }
        total = sumaTotal;
        txtTotal.setText(total.toString());
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuscarProducto;
    private javax.swing.JButton btnComprarProductos;
    private javax.swing.JButton btnContinuar;
    private javax.swing.JButton btnProductos;
    private javax.swing.JButton btnPromociones;
    private javax.swing.JButton btnProveedores;
    private javax.swing.JButton btnVenta;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lblPromociones;
    private javax.swing.JTable tblProductosVenta;
    private javax.swing.JTable tblPromocionesVenta;
    private javax.swing.JTextField txtTotal;
    // End of variables declaration//GEN-END:variables
}

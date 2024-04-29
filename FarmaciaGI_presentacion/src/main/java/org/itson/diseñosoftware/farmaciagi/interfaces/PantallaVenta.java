package org.itson.diseñosoftware.farmaciagi.interfaces;

import java.awt.Color;
import java.util.GregorianCalendar;
import java.util.Iterator;
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
        tblProductosVenta = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        txtTotal = new javax.swing.JTextField();
        btnBuscarProducto = new javax.swing.JButton();
        btnContinuar = new javax.swing.JButton();
        lblPromociones = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblPromocionesVenta = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setName("Pantalla Venta"); // NOI18N
        setResizable(false);

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
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 258, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lblPromociones)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(txtTotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnBuscarProducto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnContinuar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(17, 17, 17))))
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
        DlgBuscarProducto busquedaProducto = new DlgBuscarProducto(this, true, productosVenta);
        busquedaProducto.setVisible(true);
        llenarTablaProductosVenta();
        establecerTotal();
    }//GEN-LAST:event_btnBuscarProductoActionPerformed

    private void btnContinuarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnContinuarActionPerformed
        if (!productosVenta.isEmpty()) {
            VentaDTO venta = new VentaDTO("VNT-001", productosVenta, promocionesVenta, total, new GregorianCalendar());
            DlgTipoPago pago = new DlgTipoPago(this, true, venta);
            pago.setVisible(true);
            limpiarVenta();
            llenarTablaProductosVenta();
            establecerTotal();
        } else {
            JOptionPane.showMessageDialog(this, "Asegúrese de agregar productos a la venta.",
                    "Venta vacía", JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_btnContinuarActionPerformed

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

            try {
                ProductoDTO productoVenta = productosVenta.get(fila);
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
                    productoVenta.setCantidad(cantidad-1);
                    productosVenta.set(productosVenta.indexOf(productoVenta), productoVenta);
                }

            } catch (GestorProductosException ex) {
                JOptionPane.showMessageDialog(this, "No se pudo modificar la cantidad del producto.",
                        "Error", JOptionPane.ERROR_MESSAGE);
                Logger.getLogger(PantallaVenta.class.getName()).log(Level.SEVERE, null, ex);
            }
            llenarTablaProductosVenta();
            establecerTotal();
        });
        tblProductosVenta.getColumnModel().getColumn(1).setCellRenderer(botonRestar);
        tblProductosVenta.getColumnModel().getColumn(1).setCellEditor(botonRestar);

        ButtonColumn botonSumar = new ButtonColumn("+", (e) -> {
            int fila = tblProductosVenta.convertRowIndexToModel(tblProductosVenta.getSelectedRow());

            try {
                ProductoDTO productoVenta = productosVenta.get(fila);
                Integer cantidadVentaAct = productoVenta.getCantidad();
                ProductoDTO productoInventario = gestorInventario.obtenerProducto(productoVenta);

                if (productoInventario.getCantidad() >= 1) {

                    productoInventario.setCantidad(- 1);
                    gestorInventario.modCantidadProducto(productoInventario);

                    productoVenta.setCantidad(cantidadVentaAct + 1);
                    productosVenta.set(productosVenta.indexOf(productoVenta), productoVenta);

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
//            eliminarPromocion();
            establecerTotal();
        });
        tblProductosVenta.getColumnModel().getColumn(3).setCellRenderer(botonSumar);
        tblProductosVenta.getColumnModel().getColumn(3).setCellEditor(botonSumar);
    }

    private void identificarPromocion() {
        List<PromocionDTO> promocionesRegistro = gestorPromociones.obtenerPromociones();
        for (ProductoDTO productoVenta : productosVenta) {
            for (PromocionDTO promocion : promocionesRegistro) {
                if (productoVenta.equals(promocion.getProducto())) {
                    if ((productoVenta.getCantidad() % promocion.getCantidad()) == 0) {
                        total -= productoVenta.getCantidad() * promocion.getPrecioUnitario();
                        promocionesVenta.add(promocion);
                    } else {
                        int division = productoVenta.getCantidad() / promocion.getCantidad();
                        total -= division * productoVenta.getCosto();
                    }
                }
            }
        }
        llenarTablaPromociones();
    }
    
//    private void eliminarPromocion(){
//        List<PromocionDTO> promocionesRegistro = gestorPromociones.obtenerPromociones();
//        for (ProductoDTO productoVenta : productosVenta) {
//            for (PromocionDTO promocion : promocionesRegistro) {
//                if (productoVenta.equals(promocion.getProducto())) {
//                    if ((productoVenta.getCantidad() % promocion.getCantidad()) == 0) {
//                        total -= productoVenta.getCantidad() * promocion.getPrecioUnitario();
//                        promocionesVenta.add(promocion);
//                    } else {
//                        int division = productoVenta.getCantidad() / promocion.getCantidad();
//                        total -= division * productoVenta.getCosto();
//                    }
//                }
//            }
//        }
//        llenarTablaPromociones();
//    }

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
        }
        float decimal = (float) Math.pow(10, 2);
        total = Math.round(sumaTotal * decimal) / decimal;
        identificarPromocion();
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
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lblPromociones;
    private javax.swing.JTable tblProductosVenta;
    private javax.swing.JTable tblPromocionesVenta;
    private javax.swing.JTextField txtTotal;
    // End of variables declaration//GEN-END:variables
}

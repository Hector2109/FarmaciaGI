package org.itson.diseñosoftware.farmaciagi.interfaces;

import java.awt.Color;
import java.awt.Frame;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;
import org.itson.basesdedatosavanzadas_tramitesvehiculares_negocio.farmaciagi_subsistema_productos.IGestorProductos;
import org.itson.diseñosoftware.farmaciagipersistencia.dtos.ProductoDTO;
import org.itson.diseñosoftware.farmaciagipersistencia.dtos.VentaDTO;
import org.itson.diseñosoftware.farmaciagipersistencia.excepciones.PersistenciaException;
import org.itson.basesdedatosavanzadas_tramitesvehiculares_negocio.farmaciagi_subsistema_ventas.IGestorVentas;

public class DlgResumenVenta extends javax.swing.JDialog {

    private Float total;
    private Float pago;
    private Float cambio;
    private IGestorProductos gestorProductosVenta;
    private IGestorVentas gestorVentas;
    private int cantidad = 0;
    private Frame parent;

    /**
     * Creates new form DlgResumenVenta
     */
    public DlgResumenVenta(java.awt.Frame parent, boolean modal, IGestorProductos gestorProductosVenta,IGestorVentas gestorVenta ,Float total, Float pago, Float cambio) {
        super(parent, modal);
        this.total = total;
        this.cambio = cambio;
        this.pago = pago;
        this.gestorProductosVenta = gestorProductosVenta;
        this.gestorVentas = gestorVenta;
        initComponents();
        llenarTabla();
        actualizarFecha();
        actualizarCantidad();
        txtCantidad.setText(String.valueOf(cantidad));
        txtTotal.setText(Float.toString(total));
        txtPago.setText(Float.toString(pago));
        float decimal = (float) Math.pow(10, 2);
        Float cambioFormato = Math.round(cambio * decimal) / decimal;
        txtCambio.setText(cambioFormato.toString());
        btnCerrar.setBackground(Color.WHITE);
        btnImprimirTicket.setBackground(Color.WHITE);
        generarVenta();
    }

    /**
     * Método para actualizar la cantidad de los productos de la lista
     *
     */
    private void actualizarCantidad() {
        for (ProductoDTO producto : gestorProductosVenta.obtenerProductos()) {
            cantidad += producto.getCantidad();
        }
    }

    /**
     * Método para actualizar la fecha y adémas le asigna un formato.
     *
     */
    public void actualizarFecha() {
        Date currentDate = new Date();
        // Formatear la fecha como una cadena de texto
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        String formattedDate = dateFormat.format(currentDate);
        txtFecha.setText(formattedDate);
    }

    /**
     * Método para llenar la tabla que contiene a todos los productos de la
     * venta
     *
     */
    private void llenarTabla() {
        DefaultTableModel modelo = new DefaultTableModel();

        modelo.addColumn("ARTICULO");
        modelo.addColumn("CANTIDAD");
        modelo.addColumn("IMPORTE");

        for (ProductoDTO producto : gestorProductosVenta.obtenerProductos()) {
            Object[] fila = {
                producto.getNombre(),
                producto.getCantidad(),
                producto.getCantidad() * producto.getCosto()
            };
            modelo.addRow(fila);
        }
        tablaVenta.setModel(modelo);
    }
    
    /**
     * Método que nos ayuda a crear un código al azar
     * con un formato de "AAA-123"
     * @return codigo en formato "AAA-123"
     */
    private String generarCodigo() {
        // Definir el conjunto de caracteres permitidos para las letras
        String letras = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        // Definir el generador de números aleatorios
        Random random = new Random();
        // Crear un StringBuilder para construir el código
        StringBuilder codigo = new StringBuilder();

        // Generar tres letras aleatorias
        for (int i = 0; i < 3; i++) {
            codigo.append(letras.charAt(random.nextInt(letras.length())));
        }

        // Generar tres dígitos aleatorios
        for (int i = 0; i < 3; i++) {
            codigo.append(random.nextInt(10)); // Dígitos del 0 al 9
        }

        // Agregar el guion entre las letras y los números
        codigo.insert(3, "-");

        // Convertir el StringBuilder a String y devolver el código generado
        return codigo.toString();
    }

    /**
     * Método que nos ayuda a generar la venta y esta sea registrada y
     * administrada por su respectivo gestor.
     */
    private void generarVenta() {
        try {
            gestorVentas.agregarVenta(new VentaDTO(generarCodigo(), gestorProductosVenta.obtenerProductos(), total, new GregorianCalendar()));
        } catch (PersistenciaException ex) {
            Logger.getLogger(DlgResumenVenta.class.getName()).log(Level.SEVERE, null, ex);
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
        jPanel1 = new javax.swing.JPanel();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaVenta = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtCantidad = new javax.swing.JLabel();
        txtFecha = new javax.swing.JLabel();
        txtTotal = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtPago = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtCambio = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        btnCerrar = new javax.swing.JButton();
        btnImprimirTicket = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        fondo.setBackground(new java.awt.Color(216, 215, 255));

        jLabel1.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("RESUMEN DE VENTA");

        tablaVenta.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "ARTICULO", "CANTIDAD", "IMPORTE"
            }
        ));
        jScrollPane1.setViewportView(tablaVenta);

        jLabel2.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel2.setText("FECHA");

        jLabel3.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel3.setText("TOTAL:");

        txtCantidad.setText("jLabel4");

        txtFecha.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        txtFecha.setText("FECHA");

        txtTotal.setText("jLabel4");

        jLabel4.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel4.setText("PAGO:");

        txtPago.setText("jLabel4");

        jLabel5.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel5.setText("CAMBIO:");

        txtCambio.setText("jLabel4");

        jLabel6.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel6.setText("CANTIDAD DE PRODUCTOS");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(txtFecha, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 702, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 711, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(12, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 711, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtCantidad)
                        .addGap(35, 35, 35)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtCambio))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(7, 7, 7)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel3)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(txtTotal))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel4)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(txtPago)))))
                        .addGap(21, 21, 21))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtFecha, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 321, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtTotal)
                    .addComponent(txtCantidad)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtPago))
                .addGap(8, 8, 8)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtCambio))
                .addContainerGap(14, Short.MAX_VALUE))
        );

        btnCerrar.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        btnCerrar.setText("CERRAR");
        btnCerrar.setMaximumSize(new java.awt.Dimension(100, 30));
        btnCerrar.setPreferredSize(new java.awt.Dimension(173, 48));
        btnCerrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCerrarActionPerformed(evt);
            }
        });

        btnImprimirTicket.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        btnImprimirTicket.setText("IMPRIMIR TICKET");
        btnImprimirTicket.setPreferredSize(new java.awt.Dimension(173, 48));
        btnImprimirTicket.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnImprimirTicketActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout fondoLayout = new javax.swing.GroupLayout(fondo);
        fondo.setLayout(fondoLayout);
        fondoLayout.setHorizontalGroup(
            fondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(fondoLayout.createSequentialGroup()
                .addContainerGap(36, Short.MAX_VALUE)
                .addGroup(fondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(fondoLayout.createSequentialGroup()
                        .addComponent(btnImprimirTicket, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnCerrar, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35))
            .addGroup(fondoLayout.createSequentialGroup()
                .addGap(215, 215, 215)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        fondoLayout.setVerticalGroup(
            fondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(fondoLayout.createSequentialGroup()
                .addGap(8, 8, 8)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(fondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnImprimirTicket, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCerrar, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(20, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(fondo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(fondo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnImprimirTicketActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnImprimirTicketActionPerformed
        DlgTicket ticket = new DlgTicket(parent, rootPaneCheckingEnabled, total, pago, cambio, gestorProductosVenta);
        ticket.setVisible(true);
    }//GEN-LAST:event_btnImprimirTicketActionPerformed

    private void btnCerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCerrarActionPerformed
        dispose();
    }//GEN-LAST:event_btnCerrarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCerrar;
    private javax.swing.JButton btnImprimirTicket;
    private javax.swing.JPanel fondo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JTable tablaVenta;
    private javax.swing.JLabel txtCambio;
    private javax.swing.JLabel txtCantidad;
    private javax.swing.JLabel txtFecha;
    private javax.swing.JLabel txtPago;
    private javax.swing.JLabel txtTotal;
    // End of variables declaration//GEN-END:variables
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.itson.diseñosoftware.farmaciagi_objetosNegocio;

import java.time.Instant;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.itson.diseniosofware.mifarmaciagi.persistencia.Conexion.Conexion;
import org.itson.diseniosofware.mifarmaciagi.persistencia.Conexion.IConexion;
import org.itson.diseniosofware.mifarmaciagi.persistencia.Exception.PersistenciaException;
import org.itson.diseniosofware.mifarmaciagi.persistencia.daos.ComprasDAO;
import org.itson.diseniosofware.mifarmaciagi.persistencia.daos.IComprasDAO;
import org.itson.diseniosofware.mifarmaciagi.persistencia.entidades.Compra;
import org.itson.disenosoftware.farmaciagi_dtos.CompraDTO;
import org.itson.diseñosoftware.farmaciagi_objetosNegocio.excepciones.ObjetosNegocioException;

/**
 *
 * @author Enrique Rodriguez
 */
public class CompraBO {

    private IComprasDAO comprasDAO;

    public CompraBO() {
        IConexion conexion = new Conexion();
        comprasDAO = new ComprasDAO(conexion);
    }

    public void registrarCompra(CompraDTO compraNueva) {
        Compra compra = null;
        String codigo;
        do {
            codigo = generarCodigoCompra();
            compra = encontrarVenta(codigo);
        } while (compra != null);
        
        compra = new Compra();
        compra.setCodigo(codigo);
        compra.setCostoTotal(compraNueva.getCostoTotal());
        long millis = compraNueva.getFecha().getTimeInMillis();
        compra.setFecha(Instant.ofEpochMilli(millis));
        //compra.setProveedores(compraNueva.getProveedores());
        //compra.setProductos(compraNueva.getProductos());

        try {
            comprasDAO.registrar(compra);
        } catch (PersistenciaException ex) {
            try {
                throw new ObjetosNegocioException("No se pudo registrar la compra.");
            } catch (ObjetosNegocioException ex1) {
                Logger.getLogger(CompraBO.class.getName()).log(Level.SEVERE, null, ex1);
            }
        }
    }

    /**
     * Permite generar un código para una compra.
     *
     * @return código generado
     */
    private String generarCodigoCompra() {
        Random random = new Random();
        StringBuilder codigo = new StringBuilder();
        for (int i = 0; i < 7; i++) {
            int numeroAleatorio = random.nextInt(10);
            codigo.append(numeroAleatorio);
        }
        return codigo.toString();
    }
    
        /**
     * Método el cual encuentra una venta a partir del código
     *
     * @param codigo código de venta
     * @return venta que se encuentra
     */
    private Compra encontrarVenta(String codigo) {
        Compra venta = comprasDAO.encontrarCompra(codigo);
        return venta;
    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.farmaciagi_subsistema_compra;

import com.mycompany.farmaciagi_subsistema_compra_excepciones.ControlCompraProductosException;
import org.itson.disenosoftware.farmaciagi_dtos.CompraDTO;
import org.itson.diseñosoftware.farmaciagi_objetosNegocio.CompraBO;
import org.itson.diseñosoftware.farmaciagi_objetosNegocio.excepciones.ObjetosNegocioException;

/**
 * Clase control para el registro de compras.
 * 
 * @author Enrique Rodriguez
 */
public class ControlCompraProductos {
    private CompraBO compra;
    
    /**
     * Constructor de la clase que inicializa el atributo de la clase
     * 
     */
    public ControlCompraProductos() {
        compra = new CompraBO();
    }
    
    /**
     * Método que permite registrar una compra haciendo llamado al método de
     * la clase de negocio.
     * 
     * @param compraNueva compra a registrar.
     * @throws ControlCompraProductosException en caso de no poder registrarla.
     */
    public void registrarCompra(CompraDTO compraNueva) throws ControlCompraProductosException {
        try {
            compra.registrarCompra(compraNueva);
        } catch (ObjetosNegocioException ex) {
            throw new ControlCompraProductosException("No se pudo registrar la venta.");
        }
    }
}

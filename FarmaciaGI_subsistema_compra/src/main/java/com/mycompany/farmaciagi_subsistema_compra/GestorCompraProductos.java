/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.farmaciagi_subsistema_compra;

import com.mycompany.farmaciagi_subsistema_compra_excepciones.ControlCompraProductosException;
import com.mycompany.farmaciagi_subsistema_compra_excepciones.GestorCompraProductosException;
import org.itson.disenosoftware.farmaciagi_dtos.CompraDTO;

/**
 *
 * @author Enrique Rodriguez
 */
public class GestorCompraProductos implements IGestorCompraProductos{

    private ControlCompraProductos control;

    public GestorCompraProductos(ControlCompraProductos control) {
        this.control = control;
    }

    @Override
    public void registrarVenta(CompraDTO compraNueva) throws GestorCompraProductosException {
        try {
            control.registrarCompra(compraNueva);
        } catch (ControlCompraProductosException ex) {
            throw new GestorCompraProductosException("No se pudo registrar la venta.");
        }
    }
}

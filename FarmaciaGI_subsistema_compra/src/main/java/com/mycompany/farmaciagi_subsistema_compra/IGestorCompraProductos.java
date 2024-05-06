/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.mycompany.farmaciagi_subsistema_compra;

import com.mycompany.farmaciagi_subsistema_compra_excepciones.GestorCompraProductosException;
import org.itson.disenosoftware.farmaciagi_dtos.CompraDTO;

/**
 * Interfaz encargada de administrar los métodos para la compra.
 * 
 * @author Enrique Rodriguez
 */
public interface IGestorCompraProductos {
    public void registrarCompra(CompraDTO compraNueva) throws GestorCompraProductosException;
}

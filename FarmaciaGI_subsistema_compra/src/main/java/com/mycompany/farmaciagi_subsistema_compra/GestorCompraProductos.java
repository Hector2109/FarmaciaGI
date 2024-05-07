/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.farmaciagi_subsistema_compra;

import com.mycompany.farmaciagi_subsistema_compra_excepciones.ControlCompraProductosException;
import com.mycompany.farmaciagi_subsistema_compra_excepciones.GestorCompraProductosException;
import java.util.List;
import org.itson.disenosoftware.farmaciagi_dtos.CompraDTO;
import org.itson.disenosoftware.farmaciagi_dtos.ProductoDTO;
import org.itson.disenosoftware.farmaciagi_dtos.ProveedorDTO;

/**
 * Clase que administra la compra de productos.
 * @author Enrique Rodriguez
 */
public class GestorCompraProductos implements IGestorCompraProductos{

    private ControlCompraProductos control;
    
    /**
     * Constructor de la clase que inicializa el atributo de la clase
     * 
     */
    public GestorCompraProductos() {
        control = new ControlCompraProductos();
    }
    
    /**
     * Método que permite registrar una compra haciendo llamado al método de
     * la clase control.
     * 
     * @param compraNueva compra a registrar.
     * @throws GestorCompraProductosException en caso de no poder registrarla.
     */
    @Override
    public void registrarCompra(CompraDTO compraNueva) throws GestorCompraProductosException {
        try {
            control.registrarCompra(compraNueva);
        } catch (ControlCompraProductosException ex) {
            throw new GestorCompraProductosException("No se pudo registrar la compra.");
        }
    }
    
    /**
     * Método para encontrar una serie de proveedores que estén ligados a un 
     * producto en cuestión.
     * 
     * @param productoDTO producto a evaluar
     * @return lista de proveedores
     * @throws GestorCompraProductosException en caso de no poder encontrar a 
     * ningun proveedor.
     */
    @Override
    public List<ProveedorDTO> encontrarProveedores(ProductoDTO productoDTO) throws GestorCompraProductosException{
        try {
            List<ProveedorDTO> proveedores = control.encontrarProveedores(productoDTO);
            return proveedores;
        } catch (ControlCompraProductosException e) {
            throw new GestorCompraProductosException("No se pudo encontrar a ningun proveedor");
        }
    }
}

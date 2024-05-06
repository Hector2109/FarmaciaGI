/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.itson.disenosoftware.farmaciagi_dtos;

import java.util.Calendar;
import java.util.List;

/**
 *
 * @author Enrique Rodriguez
 */
public class CompraDTO {
    private String codigo; 
    private List<ProductoDTO> productos;
    private List<ProveedorDTO> proveedores;
    private Float costoTotal;
    private Calendar fecha;

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public List<ProductoDTO> getProductos() {
        return productos;
    }

    public void setProductos(List<ProductoDTO> productos) {
        this.productos = productos;
    }

    public List<ProveedorDTO> getProveedores() {
        return proveedores;
    }

    public void setProveedores(List<ProveedorDTO> proveedores) {
        this.proveedores = proveedores;
    }

    public Float getCostoTotal() {
        return costoTotal;
    }

    public void setCostoTotal(Float costoTotal) {
        this.costoTotal = costoTotal;
    }

    public Calendar getFecha() {
        return fecha;
    }

    public void setFecha(Calendar fecha) {
        this.fecha = fecha;
    }
    
    // Contructores

    public CompraDTO(String codigo, List<ProductoDTO> productos, List<ProveedorDTO> proveedores, Float costoTotal, Calendar fecha) {
        this.codigo = codigo;
        this.productos = productos;
        this.proveedores = proveedores;
        this.costoTotal = costoTotal;
        this.fecha = fecha;
    }

    public CompraDTO(String codigo) {
        this.codigo = codigo;
    }
    
    
}

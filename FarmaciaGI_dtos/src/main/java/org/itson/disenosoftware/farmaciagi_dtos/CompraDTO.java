/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.itson.disenosoftware.farmaciagi_dtos;

import java.util.Calendar;

/**
 *
 * @author Enrique Rodriguez
 */
public class CompraDTO {
    private String codigo; 
    private ProductoDTO producto;
    private ProveedorDTO proveedor;
    private Float costoTotal;
    private Calendar fecha;

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public ProductoDTO getProducto() {
        return producto;
    }

    public void setProducto(ProductoDTO producto) {
        this.producto = producto;
    }

    public ProveedorDTO getProveedor() {
        return proveedor;
    }

    public void setProveedores(ProveedorDTO proveedor) {
        this.proveedor = proveedor;
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

    public CompraDTO(String codigo, ProductoDTO producto, ProveedorDTO proveedor, Float costoTotal, Calendar fecha) {
        this.codigo = codigo;
        this.producto = producto;
        this.proveedor = proveedor;
        this.costoTotal = costoTotal;
        this.fecha = fecha;
    }

    public CompraDTO(String codigo) {
        this.codigo = codigo;
    }
    
    
}

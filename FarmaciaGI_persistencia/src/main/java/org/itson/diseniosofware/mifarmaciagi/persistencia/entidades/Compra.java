/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.itson.diseniosofware.mifarmaciagi.persistencia.entidades;

import java.time.Instant;
import java.util.List;
import java.util.Objects;
import org.bson.types.ObjectId;

/**
 *
 * @author Enrique Rodriguez
 */
public class Compra {

    private ObjectId _id;
    private String codigo; 
    private Producto producto;
    private Proveedor proveedor;
    private Float costoTotal;
    private Instant fecha;

    public Compra() {
    }

    public Compra(String codigo, Producto producto, Proveedor proveedor, Float costoTotal, Instant fecha) {
        this.codigo = codigo;
        this.producto = producto;
        this.proveedor = proveedor;
        this.costoTotal = costoTotal;
        this.fecha = fecha;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }
    
    public ObjectId getId() {
        return _id;
    }

    public void setId(ObjectId _id) {
        this._id = _id;
    }

    public Producto getProducto() {
        return producto;
    }

    public void setProducto(Producto producto) {
        this.producto = producto;
    }

    public Proveedor getProveedor() {
        return proveedor;
    }

    public void setProveedor(Proveedor proveedor) {
        this.proveedor = proveedor;
    }

    public Float getCostoTotal() {
        return costoTotal;
    }

    public void setCostoTotal(Float costoTotal) {
        this.costoTotal = costoTotal;
    }

    public Instant getFecha() {
        return fecha;
    }

    public void setFecha(Instant fecha) {
        this.fecha = fecha;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Compra{");
        sb.append("_id=").append(_id);
        sb.append(", productos=").append(producto);
        sb.append(", proveedores=").append(proveedor);
        sb.append(", costoTotal=").append(costoTotal);
        sb.append(", fecha=").append(fecha);
        sb.append('}');
        return sb.toString();
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 43 * hash + Objects.hashCode(this._id);
        hash = 43 * hash + Objects.hashCode(this.producto);
        hash = 43 * hash + Objects.hashCode(this.proveedor);
        hash = 43 * hash + Objects.hashCode(this.costoTotal);
        hash = 43 * hash + Objects.hashCode(this.fecha);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Compra other = (Compra) obj;
        if (!Objects.equals(this._id, other._id)) {
            return false;
        }
        if (!Objects.equals(this.producto, other.producto)) {
            return false;
        }
        if (!Objects.equals(this.proveedor, other.proveedor)) {
            return false;
        }
        if (!Objects.equals(this.costoTotal, other.costoTotal)) {
            return false;
        }
        return Objects.equals(this.fecha, other.fecha);
    }
    
    
    
}

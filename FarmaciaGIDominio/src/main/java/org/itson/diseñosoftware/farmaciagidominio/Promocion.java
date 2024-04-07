package org.itson.diseñosoftware.farmaciagidominio;

import java.util.Objects;

public class Promocion {

    private String codigo;
    private String descripcion;
    private Float descuento;

    public Promocion(String codigo) {
        this.codigo = codigo;
        this.descripcion = null;
        this.descuento = 0.0F;
    }

    public Promocion(String codigo, String descripcion, Float descuento) {
        this.codigo = codigo;
        this.descripcion = descripcion;
        this.descuento = descuento;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Float getDescuento() {
        return descuento;
    }

    public void setDescuento(Float descuento) {
        this.descuento = descuento;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 53 * hash + Objects.hashCode(this.codigo);
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
        final Promocion other = (Promocion) obj;
        return Objects.equals(this.codigo, other.codigo);
    }
    
}

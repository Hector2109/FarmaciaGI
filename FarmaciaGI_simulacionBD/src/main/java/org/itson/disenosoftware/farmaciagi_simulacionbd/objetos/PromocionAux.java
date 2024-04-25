package org.itson.disenosoftware.farmaciagi_simulacionbd.objetos;

import java.util.Objects;

public class PromocionAux {

    private String codigo;
    private String descripcion;
    private Float descuento;
    
    public PromocionAux(String codigo) {
        this.codigo = codigo;
        this.descripcion = null;
        this.descuento = 0.0F;
    }

    public PromocionAux(String codigo, String descripcion, Float descuento) {
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
        int hash = 7;
        hash = 71 * hash + Objects.hashCode(this.codigo);
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
        final PromocionAux other = (PromocionAux) obj;
        return Objects.equals(this.codigo, other.codigo);
    }

}

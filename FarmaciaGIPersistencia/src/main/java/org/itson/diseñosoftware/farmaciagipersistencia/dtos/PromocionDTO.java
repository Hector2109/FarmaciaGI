package org.itson.diseñosoftware.farmaciagipersistencia.dtos;

public class PromocionDTO {
    
    private String codigo;
    private String descripcion;
    private Float descuento;

    public PromocionDTO(String codigo, String descripcion, Float descuento) {
        this.codigo = codigo;
        this.descripcion = descripcion;
        this.descuento = descuento;
    }

    public String getCodigo() {
        return codigo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public Float getDescuento() {
        return descuento;
    }

    public void setDescuento(Float descuento) {
        this.descuento = descuento;
    }
    
}

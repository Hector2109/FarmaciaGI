package org.itson.diseniosofware.mifarmaciagi.persistencia.entidades;

public class Promocion {

    private String codigo;
    private String descripcion;
    private Float descuento;
    
    public Promocion(){
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
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Promocion{");
        sb.append("codigo=").append(codigo);
        sb.append(", descripcion=").append(descripcion);
        sb.append(", descuento=").append(descuento);
        sb.append('}');
        return sb.toString();
    }
    
}

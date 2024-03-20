package org.itson.diseñosoftware.farmaciagipersistencia.dtos;

public class ProductoDTO {
    
    private String codigo;
    private String nombre;
    private Float costo;
    private String marca;
    private Integer cantidad;
    
    public ProductoDTO(String codigo, String nombre, Float costo, String marca, Integer cantidad){
        this.codigo = codigo;
        this.nombre = nombre;
        this.costo = costo;
        this.marca = marca;
        this.cantidad = cantidad;
    }

    public String getCodigo() {
        return codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public Float getCosto() {
        return costo;
    }

    public String getMarca() {
        return marca;
    }

    public Integer getCantidad() {
        return cantidad;
    }
    
    public void setCantidad(Integer cantidad){
        this.cantidad = cantidad;
    }
    
}

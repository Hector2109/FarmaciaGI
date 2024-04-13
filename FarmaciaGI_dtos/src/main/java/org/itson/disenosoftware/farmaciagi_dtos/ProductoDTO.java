package org.itson.disenosoftware.farmaciagi_dtos;

import java.util.Objects;

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

    public ProductoDTO(String codigo, String nombre, Float costo, String marca) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.costo = costo;
        this.marca = marca;
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

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 23 * hash + Objects.hashCode(this.codigo);
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
        final ProductoDTO other = (ProductoDTO) obj;
        return Objects.equals(this.codigo, other.codigo);
    }
    
    
    
}

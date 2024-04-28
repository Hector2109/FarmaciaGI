package org.itson.disenosoftware.farmaciagi_dtos;

import java.util.Objects;

public class PromocionDTO {

    private String codigo;
    private String descripcion;
    private ProductoDTO producto;
    private Integer cantidad;
    private Float precioUnitario;
    
    public PromocionDTO(String codigo, String descripcion, ProductoDTO producto, Integer cantidad, Float precioUnitario){
        this.codigo = codigo;
        this.descripcion = descripcion;
        this.producto = producto;
        this.cantidad = cantidad;
        this.precioUnitario = precioUnitario;
    }

    public String getCodigo() {
        return codigo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public ProductoDTO getProducto() {
        return producto;
    }

    public Integer getCantidad() {
        return cantidad;
    }

    public Float getPrecioUnitario() {
        return precioUnitario;
    }
    
    public boolean isValid(){
        if (precioUnitario < 0) {
            return false;
        }
        if (producto == null) {
            return false;
        }
        if (cantidad < 1) {
            return false;
        }
        return true;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 59 * hash + Objects.hashCode(this.codigo);
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
        final PromocionDTO other = (PromocionDTO) obj;
        return Objects.equals(this.codigo, other.codigo);
    }
    
}

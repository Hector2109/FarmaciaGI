package org.itson.disenosoftware.farmaciagi_dtos;

import java.util.Objects;

public class ProductoDTO {

    private String codigo;
    private String nombre;
    private Float costo;
    private String marca;
    private Integer cantidad;

    public ProductoDTO(String codigo, String nombre, Float costo, String marca, Integer cantidad) {
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

    public ProductoDTO() {
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

    public void setCantidad(Integer cantidad) {
        this.cantidad = cantidad;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setCosto(Float costo) {
        this.costo = costo;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public boolean isValid() {
        if (cantidad < 0) {
            return false;
        }
        if (costo < 0.0) {
            return false;
        }
        return true;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 89 * hash + Objects.hashCode(this.codigo);
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

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("ProductoDTO{");
        sb.append("codigo=").append(codigo);
        sb.append(", nombre=").append(nombre);
        sb.append(", costo=").append(costo);
        sb.append(", marca=").append(marca);
        sb.append(", cantidad=").append(cantidad);
        sb.append('}');
        return sb.toString();
    }

}

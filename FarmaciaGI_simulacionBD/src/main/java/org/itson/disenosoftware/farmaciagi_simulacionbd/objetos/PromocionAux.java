package org.itson.disenosoftware.farmaciagi_simulacionbd.objetos;

import java.util.Objects;

public class PromocionAux {

    private String codigo;
    private String descripcion;
    private ProductoAux producto;
    private Integer cantidad;
    private Float precioUnitario;

    public PromocionAux(String codigo, String descripcion, ProductoAux producto, Integer cantidad, Float precioUnitario) {
        this.codigo = codigo;
        this.descripcion = descripcion;
        this.producto = producto;
        this.cantidad = cantidad;
        this.precioUnitario = precioUnitario;
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

    public ProductoAux getProducto() {
        return producto;
    }

    public void setProducto(ProductoAux producto) {
        this.producto = producto;
    }

    public Integer getCantidad() {
        return cantidad;
    }

    public void setCantidad(Integer cantidad) {
        this.cantidad = cantidad;
    }

    public Float getPrecioUnitario() {
        return precioUnitario;
    }

    public void setPrecioUnitario(Float precioUnitario) {
        this.precioUnitario = precioUnitario;
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

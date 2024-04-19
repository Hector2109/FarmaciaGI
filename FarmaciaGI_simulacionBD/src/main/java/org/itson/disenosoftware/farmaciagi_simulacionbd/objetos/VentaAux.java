package org.itson.disenosoftware.farmaciagi_simulacionbd.objetos;

import java.util.Calendar;
import java.util.List;
import java.util.Objects;

public class VentaAux {

    private String codigo;
    private List<ProductoAux> productos;
    private Float total;
    private Calendar fecha;

    public VentaAux(String codigo) {
        this.codigo = codigo;
    }

    public VentaAux(String codigo, List<ProductoAux> productos, Float total, Calendar fecha) {
        this.codigo = codigo;
        this.productos = productos;
        this.total = total;
        this.fecha = fecha;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public List<ProductoAux> getProductos() {
        return productos;
    }

    public void setProductos(List<ProductoAux> productos) {
        this.productos = productos;
    }

    public Float getTotal() {
        return total;
    }

    public void setTotal(Float total) {
        this.total = total;
    }

    public Calendar getFecha() {
        return fecha;
    }

    public void setFecha(Calendar fecha) {
        this.fecha = fecha;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 37 * hash + Objects.hashCode(this.codigo);
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
        final VentaAux other = (VentaAux) obj;
        return Objects.equals(this.codigo, other.codigo);
    }
    
}

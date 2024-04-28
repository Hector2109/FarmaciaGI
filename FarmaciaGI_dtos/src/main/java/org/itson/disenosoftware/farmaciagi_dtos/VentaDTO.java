package org.itson.disenosoftware.farmaciagi_dtos;

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.LinkedList;
import java.util.List;
import java.util.Objects;

public class VentaDTO {

    private String codigo;
    private List<ProductoDTO> productos;
    private List<PromocionDTO> promociones;
    private Float total;
    private Calendar fecha;

    public VentaDTO(String codigo) {
        this.codigo = codigo;
        this.productos = new LinkedList<>();
        this.total = 0.0F;
        this.fecha = null;
    }

    public VentaDTO(String codigo, List<ProductoDTO> productos, Float total, Calendar fecha) {
        this.codigo = codigo;
        this.productos = productos;
        this.total = total;
        this.fecha = fecha;
    }

    public VentaDTO(String codigo, List<ProductoDTO> productos, List<PromocionDTO> promociones, Float total, Calendar fecha) {
        this.codigo = codigo;
        this.productos = productos;
        this.promociones = promociones;
        this.total = total;
        this.fecha = fecha;
    }

    public String getCodigo() {
        return codigo;
    }

    public List<ProductoDTO> getProductos() {
        return productos;
    }

    public List<PromocionDTO> getPromociones() {
        return promociones;
    }

    public void setPromociones(List<PromocionDTO> promociones) {
        this.promociones = promociones;
    }

    public Float getTotal() {
        return total;
    }

    public Calendar getFecha() {
        return fecha;
    }

    public boolean isValid() {
        if (total < 0) {
            return false;
        }
        if (fecha.after(new GregorianCalendar())) {
            return false;
        }
        return true;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 83 * hash + Objects.hashCode(this.codigo);
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
        final VentaDTO other = (VentaDTO) obj;
        return Objects.equals(this.codigo, other.codigo);
    }

}

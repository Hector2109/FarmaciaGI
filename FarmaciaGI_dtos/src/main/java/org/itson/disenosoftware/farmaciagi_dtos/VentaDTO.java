package org.itson.disenosoftware.farmaciagi_dtos;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

public class VentaDTO {

    private String codigo;
    private List<ProductoDTO> productos;
    private Float total;
    private Calendar fecha;
    
    public VentaDTO(String codigo){
        this.codigo = codigo;
        this.productos = new ArrayList<>();
        this.total = 0.0F;
        this.fecha = null;
    }

    public VentaDTO(String codigo, List<ProductoDTO> productos, Float total, Calendar fecha) {
        this.codigo = codigo;
        this.productos = productos;
        this.total = total;
        this.fecha = fecha;
    }

    public String getCodigo() {
        return codigo;
    }

    public List<ProductoDTO> getProductos() {
        return productos;
    }

    public Float getTotal() {
        return total;
    }

    public Calendar getFecha() {
        return fecha;
    }

}
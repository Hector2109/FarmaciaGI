package org.itson.diseñosoftware.farmaciagipersistencia.dtos;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.List;
import org.itson.diseñosoftware.farmaciagidominio.Cliente;
import org.itson.diseñosoftware.farmaciagidominio.Producto;
import org.itson.diseñosoftware.farmaciagidominio.Promocion;

public class VentaDTO {

    private String codigo;
    private List<Producto> productos;
    private Cliente cliente;
    private List<Promocion> promociones;
    private Float total;
    private Calendar fecha;
    
    public VentaDTO(String codigo, Calendar fecha){
        this.codigo = codigo;
        this.productos = new ArrayList<>();
        this.promociones = new ArrayList<>();
        this.total = 0.0F;
        this.cliente = null;
        this.fecha = fecha;
    }

    public VentaDTO(String codigo, List<Producto> productos, Float total, Calendar fecha) {
        this.codigo = codigo;
        this.productos = productos;
        this.cliente = null;
        this.promociones = null;
        this.total = total;
        this.fecha = fecha;
    }

    public VentaDTO(String codigo, List<Producto> productos, Cliente cliente, List<Promocion> promociones, Float total, Calendar fecha) {
        this.codigo = codigo;
        this.productos = productos;
        this.cliente = cliente;
        this.promociones = promociones;
        this.total = total;
        this.fecha = fecha;
    }

    public String getCodigo() {
        return codigo;
    }

    public List<Producto> getProductos() {
        return productos;
    }

    public Float getTotal() {
        return total;
    }

    public Calendar getFecha() {
        return fecha;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public List<Promocion> getPromociones() {
        return promociones;
    }

}

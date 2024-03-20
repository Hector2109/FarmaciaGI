package org.itson.diseñosoftware.farmaciagipersistencia.dtos;

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
    private GregorianCalendar fecha;

    public VentaDTO(String codigo, List<Producto> productos, Float total, GregorianCalendar fecha) {
        this.codigo = codigo;
        this.productos = productos;
        this.total = total;
        this.fecha = fecha;
    }

    public VentaDTO(String codigo, List<Producto> productos, Cliente cliente, List<Promocion> promociones, Float total, GregorianCalendar fecha) {
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

    public GregorianCalendar getFecha() {
        return fecha;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public List<Promocion> getPromociones() {
        return promociones;
    }

}

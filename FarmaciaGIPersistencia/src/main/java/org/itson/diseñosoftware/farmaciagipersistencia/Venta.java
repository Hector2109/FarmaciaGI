package org.itson.diseñosoftware.farmaciagipersistencia;

import java.util.GregorianCalendar;
import org.itson.diseñosoftware.farmaciagidominio.Producto;

public class Venta {

    private Integer codigo;
    private Productos productos;
    private Float total;
    private GregorianCalendar fecha;

    public Venta(Integer codigo, Productos productos, Float total, GregorianCalendar fecha) {
        this.codigo = codigo;
        this.productos = productos;
        this.total = total;
        this.fecha = fecha;
    }

    public Venta(Productos productos, Float total, GregorianCalendar fecha) {
        this.productos = productos;
        this.total = total;
        this.fecha = fecha;
    }

    public Integer getCodigo() {
        return codigo;
    }

    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }

    public Productos getProductos() {
        return productos;
    }

    public void setProductos(Productos productos) {
        this.productos = productos;
    }

    public Float getTotal() {
        return total;
    }

    public void setTotal(Float total) {
        this.total = total;
    }

    public GregorianCalendar getFecha() {
        return fecha;
    }

    public void setFecha(GregorianCalendar fecha) {
        this.fecha = fecha;
    }

    public Float calcularCosto() {
        total = 0F;
        for (Producto producto : productos.getProductos()) {
            total += producto.getCosto();
        }
        return total;
    }

}

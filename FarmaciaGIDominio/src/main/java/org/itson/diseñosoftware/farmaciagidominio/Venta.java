package org.itson.diseñosoftware.farmaciagidominio;

import java.util.GregorianCalendar;
import java.util.List;
import org.itson.diseñosoftware.farmaciagipersistencia.Productos;
/**
 *
 * @author Enrique Rodriguez
 */
public class Venta {
    private Integer idVenta;
    private Productos productos;
    private Float total;
    private GregorianCalendar fecha;

    public Venta(Integer idVenta, Productos productos, Float total, GregorianCalendar fecha) {
        this.idVenta = idVenta;
        this.productos = productos;
        this.total = total;
        this.fecha = fecha;
    }
    
    public Venta(Productos productos, Float total, GregorianCalendar fecha) {
        this.productos = productos;
        this.total = total;
        this.fecha = fecha;
    }

    public Integer getIdVenta() {
        return idVenta;
    }

    public void setIdVenta(Integer idVenta) {
        this.idVenta = idVenta;
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

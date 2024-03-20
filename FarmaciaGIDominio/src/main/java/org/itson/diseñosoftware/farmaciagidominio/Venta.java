package org.itson.diseñosoftware.farmaciagidominio;

import java.util.Calendar;
import java.util.List;
import java.util.Objects;

public class Venta {

    private String codigo;
    private List<Producto> productos;
    private Cliente cliente;
    private List<Promocion> promociones;
    private Float total;
    private Calendar fecha;

    public Venta(String codigo) {
        this.codigo = codigo;
    }

    public Venta(String codigo, List<Producto> productos, Float total, Calendar fecha) {
        this.codigo = codigo;
        this.productos = productos;
        this.total = total;
        this.fecha = fecha;
    }

    public Venta(String codigo, List<Producto> productos, Cliente cliente, List<Promocion> promociones, Float total, Calendar fecha) {
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

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public List<Producto> getProductos() {
        return productos;
    }

    public void setProductos(List<Producto> productos) {
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

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public List<Promocion> getPromociones() {
        return promociones;
    }

    public void setPromociones(List<Promocion> promociones) {
        this.promociones = promociones;
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
        final Venta other = (Venta) obj;
        return Objects.equals(this.codigo, other.codigo);
    }
    
}

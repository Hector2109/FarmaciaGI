package org.itson.diseniosofware.mifarmaciagi.persistencia.entidades;

public class Promocion {

    private String codigo;
    private String descripcion;
    private Producto producto;
    private Integer cantidad;
    private Float precioUnitario;
    
    public Promocion(){
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

    public Producto getProducto() {
        return producto;
    }

    public void setProducto(Producto producto) {
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
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Promocion{");
        sb.append("codigo=").append(codigo);
        sb.append(", descripcion=").append(descripcion);
        sb.append(", producto=").append(producto);
        sb.append(", cantidad=").append(cantidad);
        sb.append(", precioUnitario=").append(precioUnitario);
        sb.append('}');
        return sb.toString();
    }
    
}

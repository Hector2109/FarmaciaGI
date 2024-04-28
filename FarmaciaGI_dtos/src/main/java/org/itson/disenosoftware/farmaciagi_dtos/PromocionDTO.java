package org.itson.disenosoftware.farmaciagi_dtos;

public class PromocionDTO {

    private String codigo;
    private String descripcion;
    private ProductoDTO producto;
    private Integer cantidad;
    private Float precioUnitario;
    
    public PromocionDTO(String codigo, String descripcion, ProductoDTO producto, Integer cantidad, Float precioUnitario){
        this.codigo = codigo;
        this.descripcion = descripcion;
        this.producto = producto;
        this.cantidad = cantidad;
        this.precioUnitario = precioUnitario;
    }

    public String getCodigo() {
        return codigo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public ProductoDTO getProducto() {
        return producto;
    }

    public Integer getCantidad() {
        return cantidad;
    }

    public Float getPrecioUnitario() {
        return precioUnitario;
    }
    
    public boolean isValid(){
        if (precioUnitario < 0) {
            return false;
        }
        if (producto == null) {
            return false;
        }
        if (cantidad < 1) {
            return false;
        }
        return true;
    }
}

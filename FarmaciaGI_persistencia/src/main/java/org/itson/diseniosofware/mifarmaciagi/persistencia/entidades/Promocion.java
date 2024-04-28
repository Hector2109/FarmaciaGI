package org.itson.diseniosofware.mifarmaciagi.persistencia.entidades;

import java.util.List;

public class Promocion {

    private String codigo;
    private String descripcion;
    private List<String> producto;
    private Integer cantidad;
    private Float precioUnitario;

    /**
     * Constructor vacío.
     */
    public Promocion() {
    }

    /**
     * Permite obtener el código de la promoción.
     *
     * @return El código de la promoción
     */
    public String getCodigo() {
        return codigo;
    }

    /**
     * Permite establecer el código de la promoción.
     *
     * @param codigo El código de la promoción
     */
    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    /**
     * Permite obtener la descripción de la promoción.
     *
     * @return La descripción de la promoción
     */
    public String getDescripcion() {
        return descripcion;
    }

    /**
     * Permite establecer la descripción de la promoción.
     *
     * @param descripcion La descripción de la promoción
     */
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    /**
     * Permite obtener el producto de la promoción.
     *
     * @return El producto de la promoción
     */
    public List<String> getProducto() {
        return producto;
    }

    /**
     * Permite establecer el producto de la promoción.
     *
     * @param producto El producto de la promoción
     */
    public void setProducto(List<String> producto) {
        this.producto = producto;
    }

    /**
     * Permite obtener la cantidad mínima de producto para aplicar la promoción.
     *
     * @return La cantidad mínima de producto para aplicar la promoción
     */
    public Integer getCantidad() {
        return cantidad;
    }

    /**
     * Permite establecer la cantidad mínima de producto para aplicar la
     * promoción.
     *
     * @param cantidad L cantidad mínima de producto para aplicar la promoción
     */
    public void setCantidad(Integer cantidad) {
        this.cantidad = cantidad;
    }

    /**
     * Permite obtener el precio unitario del producto de la promoción una vez
     * que esta se aplique.
     *
     * @return El precio unitario del producto de la promoción
     */
    public Float getPrecioUnitario() {
        return precioUnitario;
    }

    /**
     * Permite establecer el precio unitario del producto de la promoción una
     * vez que esta se aplique.
     *
     * @param precioUnitario El precio unitario del producto de la promoción
     */
    public void setPrecioUnitario(Float precioUnitario) {
        this.precioUnitario = precioUnitario;
    }

    /**
     * Permite obtener una cadena con los atributos de la promoción.
     *
     * @return Una cadena con los atributos de la promoción
     */
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

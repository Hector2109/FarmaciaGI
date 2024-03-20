package org.itson.diseñosoftware.farmaciagidominio;

import java.util.Objects;

/**
 *
 * @author MiFarmaciaGI
 */
public class Producto {

    private String codigo;
    private String nombre;
    private Float costo;
    private String marca;
    private Integer cantidad;
    
    public Producto(String codigo, String nombre){
        this.codigo = codigo;
        this.nombre = nombre;
        this.marca = null;
        this.costo = null;
        this.cantidad = null;
    }

    /**
     * Constructor para crear un producto
     *
     * @param nombre
     * @param costo
     * @param marca
     * @param codigo
     * @param cantidad
     */
    public Producto(String nombre, Float costo, String marca, String codigo, Integer cantidad) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.costo = costo;
        this.marca = marca;
        this.cantidad = cantidad;
    }
    
    public Producto(Producto producto) {
        this.codigo = producto.getCodigo();
        this.nombre = producto.getNombre();
        this.marca = producto.getMarca();
        this.costo = producto.getCosto();
        this.cantidad = producto.getCantidad();
    }
    
    /**
     * Método para obtener el id del producto
     *
     * @return regresa id del producto
     */
    public String getCodigo() {
        return codigo;
    }

    /**
     * Método para modificar el id del producto
     *
     * @param codigo id del producto
     */
    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    /**
     * Método para obterner nombre del producto
     *
     * @return nombre del producto
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Método para modificar el nombre del producto
     *
     * @param nombre nombre del producto
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Método para obterner costo del producto
     *
     * @return costo del producto
     */
    public Float getCosto() {
        return costo;
    }

    /**
     * Método para modificar costo del producto
     *
     * @param costo costo del producto
     */
    public void setCosto(Float costo) {
        this.costo = costo;
    }

    /**
     * Método para obterner la marca del producto
     *
     * @return marca del producto
     */
    public String getMarca() {
        return marca;
    }

    /**
     * Método para modificar la marca del producto
     *
     * @param marca marca del producto
     */
    public void setMarca(String marca) {
        this.marca = marca;
    }


    /**
     * Permite obtener la cantidad del producto
     *
     * @return La cantidad del producto
     */
    public Integer getCantidad() {
        return cantidad;
    }

    /**
     * Permite establecer la cantidad del producto
     *
     * @param cantidad La cantidad el producto
     */
    public void setCantidad(Integer cantidad) {
        this.cantidad = cantidad;
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
        final Producto other = (Producto) obj;
        return this.codigo.equalsIgnoreCase(other.codigo);
    }

}

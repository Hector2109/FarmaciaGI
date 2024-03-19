package org.itson.diseñosoftware.farmaciagidominio;

import java.util.Objects;

/**
 *
 * @author MiFarmaciaGI
 */
public class Producto {

    private String nombre;
    private Float costo;
    private String marca;
    private String id;
    private Integer cantidad;

    /**
     * Constructor para crear un producto
     *
     * @param nombre
     * @param costo
     * @param marca
     * @param id
     * @param cantidad
     */
    public Producto(String nombre, Float costo, String marca, String id, Integer cantidad) {
        this.nombre = nombre;
        this.costo = costo;
        this.marca = marca;
        this.id = id;
        this.cantidad = cantidad;
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
     * Método para obtener el id del producto
     *
     * @return regresa id del producto
     */
    public String getId() {
        return id;
    }

    /**
     * Método para modificar el id del producto
     *
     * @param id id del producto
     */
    public void setId(String id) {
        this.id = id;
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
        hash = 37 * hash + Objects.hashCode(this.id);
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
        return this.id.equalsIgnoreCase(other.id);
    }

}

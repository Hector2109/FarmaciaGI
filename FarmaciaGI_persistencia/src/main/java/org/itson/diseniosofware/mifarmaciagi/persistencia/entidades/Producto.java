package org.itson.diseniosofware.mifarmaciagi.persistencia.entidades;

import org.bson.types.ObjectId;

/**
 *
 * @author Hector Espinoza
 */
public class Producto {
    
    private ObjectId _id; //id del producto
    private String nombre; //nombre delñ producto
    private String marca; //marca del producto
    private Float costo; //costo del producto
    private String codigo; //codigo del producto
    private Integer cantidad; //cantidad del producto

    /**
     * Constructor default de un objeto tipo producto
     */
    public Producto() {
    }

    /**
     * Retorna el id del producto
     * @return id del producto
     */
    public ObjectId getId() {
        return _id;
    }

    /**
     * Establece el id del producto
     * @param _id id del producto
     */
    public void setId(ObjectId _id) {
        this._id = _id;
    }

    /**
     * Retorna el el nombre del producto
     * @return nombre del producto
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Establec el nombre del producto
     * @param nombre nombre del producto
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Retorna la marca del producto
     * @return marca del producto
     */
    public String getMarca() {
        return marca;
    }
    
    /**
     * Establece la marca del producto
     * @param marca marca del producto
     */
    public void setMarca(String marca) {
        this.marca = marca;
    }

    /**
     * Retorna el costo del producto
     * @return coste del producto
     */
    public Float getCosto() {
        return costo;
    }

    /**
     * Establece el costo del producto
     * @param costo coste del producto
     */
    public void setCosto(Float costo) {
        this.costo = costo;
    }

    /**
     * Retorna el codigo del producto
     * @return codigo del producto
     */
    public String getCodigo() {
        return codigo;
    }

    /**
     * Establece el código de producto
     * @param codigo código del producto
     */
    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    /**
     * Retorna la cantidad del producto
     * @return cantidad del producto
     */
    public Integer getCantidad() {
        return cantidad;
    }

    /**
     * Establece la cantidad del producto
     * @param cantidad cantidad del producto
     */
    public void setCantidad(Integer cantidad) {
        this.cantidad = cantidad;
    }

    @Override
    public String toString() {
        return "Producto{" + "_id=" + _id + ", nombre=" + nombre + ", marca=" + marca + ", costo=" + costo + ", codigo=" + codigo + ", cantidad=" + cantidad + '}';
    }
    
    
    
}

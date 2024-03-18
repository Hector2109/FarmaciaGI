package org.itson.diseñosoftware.farmaciagidominio;

/**
 *
 * @author MiFarmaciaGI
 */
public class Producto {
    
    private String nombre;
    private float costo;
    private String marca;

    /**
     * Constructor para crear un producto
     * @param nombre
     * @param costo
     * @param marca 
     */
    public Producto(String nombre, float costo, String marca) {
        this.nombre = nombre;
        this.costo = costo;
        this.marca = marca;
    }

    /**
     * Método para obterner nombre del producto
     * @return nombre del producto
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Método para modificar el nombre del producto
     * @param nombre nombre del producto
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Método para obterner costo del producto
     * @return costo del producto
     */
    public float getCosto() {
        return costo;
    }

    /**
     * Método para modificar costo del producto
     * @param costo costo del producto
     */
    public void setCosto(float costo) {
        this.costo = costo;
    }

    /**
     * Método para obterner la marca del producto
     * @return marca del producto
     */
    public String getMarca() {
        return marca;
    }

    /**
     * Método para modificar la marca del producto
     * @param marca marca del producto
     */
    public void setMarca(String marca) {
        this.marca = marca;
    }

    
}

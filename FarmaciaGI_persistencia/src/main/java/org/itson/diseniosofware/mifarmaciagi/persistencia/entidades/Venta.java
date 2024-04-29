package org.itson.diseniosofware.mifarmaciagi.persistencia.entidades;

import java.time.Instant;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

/**
 *
 * @author Hector Espinoza
 */
public class Venta {
    
    private List <Producto> productos; //Lista de productos de la venta
    private List <Promocion> promociones; //Lista de promociones de la venta
    private float costo_total; //Costo total de la venta
    private String codigo_venta; // codigo de la venta
    private Instant fecha_venta;
    
    /**
     * Constructor vacio
     */
    public Venta() {
    }

    /**
     * Obtiene el código d la venta
     * @return código de la venta
     */
    public String getCodigo_venta() {
        return codigo_venta;
    }

    /**
     * Establece el código de la venta
     * @param codigo_venta 
     */
    public void setCodigo_venta(String codigo_venta) {
        this.codigo_venta = codigo_venta;
    }
    
    /**
     * Obtiene la lista de productos de la venta
     * @return productos de la venta
     */
    public List<Producto> getProductos() {
        return productos;
    }

    /**
     * Establece la lista de productos de la venta
     * @param productos productos de la venta 
     */
    public void setProductos(List<Producto> productos) {
        this.productos = productos;
    }

    /**
     * Obtiene las promociones de la venta
     * @return lsita de promociones de la venta
     */
    public List<Promocion> getPromociones() {
        return promociones;
    }

    /**
     * Establece la lista de promociones de la venta
     * @param promociones promociones de la venta
     */
    public void setPromociones(List<Promocion> promociones) {
        this.promociones = promociones;
    }

    /**
     * Obtiene el costo total de la venta
     * @return costo total de venta
     */
    public Float getCosto_total() {
        return costo_total;
    }

    /**
     * Modifica el costo total de la venta
     * @param costo_total costo total de la venta
     */
    public void setCosto_total(Float costo_total) {
        this.costo_total = costo_total;
    }

    /**
     * Obtiene la fecha de la venta
     * @return fecha de venta
     */
    public Instant getFecha_venta() {
        return fecha_venta;
    }

    /**
     * Establece la fecha de la venta
     * @param fecha_venta fecha de la venta
     */
    public void setFecha_venta(Instant fecha_venta) {
        this.fecha_venta = fecha_venta;
    }
    
    
    
    
    
    
}

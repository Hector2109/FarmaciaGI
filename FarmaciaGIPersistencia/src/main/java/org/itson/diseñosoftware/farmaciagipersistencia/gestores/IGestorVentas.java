package org.itson.diseñosoftware.farmaciagipersistencia.gestores;

import org.itson.diseñosoftware.farmaciagipersistencia.dtos.ProductoDTO;
import org.itson.diseñosoftware.farmaciagipersistencia.dtos.VentaDTO;
import org.itson.diseñosoftware.farmaciagipersistencia.excepciones.PersistenciaException;

public interface IGestorVentas {
    
    public VentaDTO obtenerVenta(VentaDTO venta) throws PersistenciaException;
    
    public void agregarVenta(VentaDTO venta) throws PersistenciaException;
    
    public void agregarProducto(VentaDTO venta, ProductoDTO producto) throws PersistenciaException;
    
    public Float calcularCosto(VentaDTO ventaBuscada) throws PersistenciaException;
    
}

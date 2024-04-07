package org.itson.diseñosoftware.farmaciagipersistencia.gestores;

import org.itson.diseñosoftware.farmaciagidominio.Venta;
import org.itson.diseñosoftware.farmaciagipersistencia.Productos;
import org.itson.diseñosoftware.farmaciagipersistencia.dtos.ClienteDTO;
import org.itson.diseñosoftware.farmaciagipersistencia.dtos.ProductoDTO;
import org.itson.diseñosoftware.farmaciagipersistencia.dtos.PromocionDTO;
import org.itson.diseñosoftware.farmaciagipersistencia.dtos.VentaDTO;
import org.itson.diseñosoftware.farmaciagipersistencia.excepciones.PersistenciaException;

public interface IGestorVentas {
    
    public Venta obtenerVenta(VentaDTO venta) throws PersistenciaException;
    
    public void agregarVenta(VentaDTO venta) throws PersistenciaException;
    
    public void agregarProducto(VentaDTO venta, ProductoDTO producto) throws PersistenciaException;
    
    public void agregarCliente(VentaDTO venta, ClienteDTO cliente) throws PersistenciaException;
    
    public void agregarPromocion(VentaDTO venta, PromocionDTO promocion) throws PersistenciaException;
    
    public Float calcularCosto(VentaDTO ventaBuscada) throws PersistenciaException;
    
    public Productos agregarProductosAVista(Productos inventario, String filtro) throws PersistenciaException;
    
}

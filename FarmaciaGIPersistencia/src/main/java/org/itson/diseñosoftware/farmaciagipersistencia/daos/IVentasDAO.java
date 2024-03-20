package org.itson.diseñosoftware.farmaciagipersistencia.daos;

import org.itson.diseñosoftware.farmaciagidominio.Producto;
import org.itson.diseñosoftware.farmaciagipersistencia.dtos.ClienteDTO;
import org.itson.diseñosoftware.farmaciagipersistencia.dtos.ProductoDTO;
import org.itson.diseñosoftware.farmaciagipersistencia.dtos.PromocionDTO;

public interface IVentasDAO {
    
    public Producto obtenerProducto(ProductoDTO producto);
    
    public void agregarCliente(ClienteDTO cliente);
    
    public void agregarPromocion(PromocionDTO promocion);
    
}

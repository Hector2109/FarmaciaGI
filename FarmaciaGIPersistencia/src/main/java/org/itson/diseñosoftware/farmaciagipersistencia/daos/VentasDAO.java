package org.itson.diseñosoftware.farmaciagipersistencia.daos;

import java.util.List;
import org.itson.diseñosoftware.farmaciagidominio.Producto;
import org.itson.diseñosoftware.farmaciagidominio.Venta;
import org.itson.diseñosoftware.farmaciagipersistencia.dtos.ClienteDTO;
import org.itson.diseñosoftware.farmaciagipersistencia.dtos.ProductoDTO;
import org.itson.diseñosoftware.farmaciagipersistencia.dtos.PromocionDTO;

public class VentasDAO implements IVentasDAO {
    
    List<Venta> ventas;

    public VentasDAO(List<Venta> ventas) {
        this.ventas = ventas;
    }

    @Override
    public Producto obtenerProducto(ProductoDTO producto) {
            
    }

    @Override
    public void agregarCliente(ClienteDTO cliente) {
        
    }

    @Override
    public void agregarPromocion(PromocionDTO promocion) {
        
    }
    
}

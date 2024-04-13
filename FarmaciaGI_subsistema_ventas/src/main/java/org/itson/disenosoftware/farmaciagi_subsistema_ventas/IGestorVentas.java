package org.itson.disenosoftware.farmaciagi_subsistema_ventas;

import org.itson.disenosoftware.farmaciagi_dtos.ProductoDTO;
import org.itson.disenosoftware.farmaciagi_dtos.VentaDTO;

public interface IGestorVentas {
    
    public void registrarVenta(VentaDTO venta);
    
    public void agregarProducto(VentaDTO venta, ProductoDTO producto);
    
    public Float calcularCosto(VentaDTO ventaBuscada);
    
}

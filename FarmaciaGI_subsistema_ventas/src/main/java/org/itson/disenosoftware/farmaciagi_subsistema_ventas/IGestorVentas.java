package org.itson.disenosoftware.farmaciagi_subsistema_ventas;

import org.itson.disenosoftware.farmaciagi_dtos.VentaDTO;
import org.itson.disenosoftware.farmaciagi_subsistema_ventas.excepciones.GestorVentasException;

public interface IGestorVentas {

    public void registrarVenta(VentaDTO venta) throws GestorVentasException;

}

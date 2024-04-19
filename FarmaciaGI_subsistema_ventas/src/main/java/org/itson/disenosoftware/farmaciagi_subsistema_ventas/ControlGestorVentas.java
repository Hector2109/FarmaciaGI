package org.itson.disenosoftware.farmaciagi_subsistema_ventas;

import org.itson.disenosoftware.farmaciagi_dtos.VentaDTO;
import org.itson.disenosoftware.farmaciagi_subsistema_ventas.excepciones.ControlVentasException;
import org.itson.diseñosoftware.farmaciagi_objetosNegocio.Venta;
import org.itson.diseñosoftware.farmaciagi_objetosNegocio.excepciones.ObjetosNegocioException;

class ControlGestorVentas {
    
    private Venta venta;

    public ControlGestorVentas() {
        venta = new Venta();
    }

    public void registrarVenta(VentaDTO ventaNueva) throws ControlVentasException {
        try {
            venta.registrarVenta(ventaNueva);
        } catch (ObjetosNegocioException ex) {
            throw new ControlVentasException("No se pudo registrar la venta.");
        }
    }

}

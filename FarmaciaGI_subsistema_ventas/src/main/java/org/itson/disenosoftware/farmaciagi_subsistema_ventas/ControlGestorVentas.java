package org.itson.disenosoftware.farmaciagi_subsistema_ventas;

import org.itson.disenosoftware.farmaciagi_dtos.VentaDTO;
import org.itson.disenosoftware.farmaciagi_subsistema_ventas.excepciones.ControlVentasException;
import org.itson.diseñosoftware.farmaciagi_objetosNegocio.VentaBO;
import org.itson.diseñosoftware.farmaciagi_objetosNegocio.excepciones.ObjetosNegocioException;

class ControlGestorVentas {
    
    private VentaBO venta;

    /**
     * Constructor.
     */
    public ControlGestorVentas() {
        venta = new VentaBO();
    }

    /**
     * Permite registrar una venta en el registro.
     *
     * @param venta La venta que se va a registrar
     * @throws GestorVentasException Si no se puede registrar la venta
     */
    public void registrarVenta(VentaDTO ventaNueva) throws ControlVentasException {
        try {
            venta.registrarVenta(ventaNueva);
        } catch (ObjetosNegocioException ex) {
            throw new ControlVentasException("No se pudo registrar la venta.");
        }
    }

}

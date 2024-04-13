package org.itson.disenosoftware.farmaciagi_subsistema_ventas;

import org.itson.disenosoftware.farmaciagi_dtos.ProductoDTO;
import org.itson.disenosoftware.farmaciagi_dtos.VentaDTO;
import org.itson.disenosoftware.farmaciagi_subsistema_ventas.excepciones.ControlVentasException;
import org.itson.disenosoftware.farmaciagi_subsistema_ventas.excepciones.GestorVentasException;

public class GestorVentas implements IGestorVentas {

    private ControlGestorVentas control;

    public GestorVentas() {
        control = new ControlGestorVentas();
    }

    @Override
    public void registrarVenta(VentaDTO ventaNueva) throws GestorVentasException {
        try {
            control.registrarVenta(ventaNueva);
        } catch (ControlVentasException ex) {
            throw new GestorVentasException("No se pudo registrar la venta.");
        }
    }

    @Override
    public void agregarProducto(VentaDTO ventaBuscada, ProductoDTO productoNuevo) throws GestorVentasException {
        try {
            control.agregarProducto(ventaBuscada, productoNuevo);
        } catch (ControlVentasException ex) {
            throw new GestorVentasException("No se pudo agregar el producto a la venta.");
        }
    }

    @Override
    public Float calcularCosto(VentaDTO ventaBuscada) throws GestorVentasException {
        Float costo;
        try {
            costo = control.calcularCosto(ventaBuscada);

            return costo;
        } catch (ControlVentasException ex) {
            throw new GestorVentasException("No se pudo calcular el costo de la venta.");
        }
    }

}

package org.itson.disenosoftware.farmaciagi_subsistema_ventas;

import org.itson.disenosoftware.farmaciagi_dtos.ProductoDTO;
import org.itson.disenosoftware.farmaciagi_dtos.VentaDTO;

public class GestorVentas implements IGestorVentas {

    private ControlGestorVentas control;

    public GestorVentas() {
        control = new ControlGestorVentas();
    }

    @Override
    public void registrarVenta(VentaDTO ventaNueva) {
        control.registrarVenta(ventaNueva);
    }

    @Override
    public void agregarProducto(VentaDTO ventaBuscada, ProductoDTO productoNuevo) {
        control.agregarProducto(ventaBuscada, productoNuevo);
    }

    @Override
    public Float calcularCosto(VentaDTO ventaBuscada) {
        Float costo = control.calcularCosto(ventaBuscada);
        
        return costo;
    }

}

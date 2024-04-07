package org.itson.diseñosoftware.farmaciagipersistencia;

import java.util.LinkedList;
import java.util.List;
import org.itson.diseñosoftware.farmaciagidominio.Venta;
import org.itson.diseñosoftware.farmaciagipersistencia.excepciones.PersistenciaException;

public class RegistroVentas {

    private List<Venta> registroVentas;

    public RegistroVentas() {
        registroVentas = new LinkedList<>();
    }

    public Venta obtenerVenta(Venta venta) {
        if (registroVentas.contains(venta)) {
            return registroVentas.get(registroVentas.indexOf(venta));
        }
        return null;
    }

    public void agregarVenta(Venta venta) {
        registroVentas.add(venta);
    }

}

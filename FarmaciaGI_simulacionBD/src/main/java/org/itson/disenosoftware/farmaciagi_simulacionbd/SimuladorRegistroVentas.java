package org.itson.disenosoftware.farmaciagi_simulacionbd;

import java.util.LinkedList;
import java.util.List;
import org.itson.diseñosoftware.farmaciagidominio.Venta;

public class SimuladorRegistroVentas {

    private static SimuladorRegistroVentas simulador;
    private List<Venta> registro;
    
    private SimuladorRegistroVentas(){
        registro = new LinkedList<>();
    }
    
    public static SimuladorRegistroVentas getInstance(){
        if (simulador == null) {
            simulador = new SimuladorRegistroVentas();
        }
        return simulador;
    }
    
    public List<Venta> obtenerRegistro(){
        return registro;
    }
    
}

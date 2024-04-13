package org.itson.disenosoftware.farmaciagi_simulacionbd;

import java.util.LinkedList;
import java.util.List;
import org.itson.diseñosoftware.farmaciagidominio.Venta;

public class SimuladorRegistroVentas {

    private List<Venta> registro;
    
    public SimuladorRegistroVentas(){
        registro = new LinkedList<>();
    }
    
    public List<Venta> obtenerRegistro(){
        return registro;
    }
    
}

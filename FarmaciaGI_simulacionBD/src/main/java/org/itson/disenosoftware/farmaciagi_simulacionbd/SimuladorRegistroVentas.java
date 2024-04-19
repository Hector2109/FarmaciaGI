package org.itson.disenosoftware.farmaciagi_simulacionbd;

import java.util.LinkedList;
import java.util.List;
import org.itson.disenosoftware.farmaciagi_simulacionbd.objetos.VentaAux;

public class SimuladorRegistroVentas {

    private static SimuladorRegistroVentas simulador;
    private List<VentaAux> registro;
    
    private SimuladorRegistroVentas(){
        registro = new LinkedList<>();
    }
    
    public static SimuladorRegistroVentas getInstance(){
        if (simulador == null) {
            simulador = new SimuladorRegistroVentas();
        }
        return simulador;
    }
    
    public List<VentaAux> obtenerRegistro(){
        return registro;
    }
    
}

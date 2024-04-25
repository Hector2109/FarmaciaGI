package org.itson.disenosoftware.farmaciagi_simulacionbd;

import java.util.LinkedList;
import java.util.List;
import org.itson.disenosoftware.farmaciagi_simulacionbd.objetos.PromocionAux;

public class SimuladorRegistroPromociones {
    
    private static SimuladorRegistroPromociones simulador;
    private List<PromocionAux> registro;
    
    private SimuladorRegistroPromociones(){
        registro = new LinkedList<>();
    }
    
    public static SimuladorRegistroPromociones getInstance(){
        if (simulador == null) {
            simulador = new SimuladorRegistroPromociones();
        }
        return simulador;
    }
    
    public List<PromocionAux> getRegistro(){
        return registro;
    }
    
}

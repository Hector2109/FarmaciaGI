package org.itson.disenosoftware.farmaciagi_simulacionbd;

import java.util.LinkedList;
import java.util.List;
import org.itson.disenosoftware.farmaciagi_simulacionbd.objetos.ProductoAux;
import org.itson.disenosoftware.farmaciagi_simulacionbd.objetos.PromocionAux;

public class SimuladorRegistroPromociones {
    
    private static SimuladorRegistroPromociones simulador;
    private List<PromocionAux> registro;
    
    private SimuladorRegistroPromociones(){
        registro = new LinkedList<>();
        agregarPromociones();
    }
    
    private void agregarPromociones(){
        registro.add(new PromocionAux("PRO-001", "Paracetamol 2x1", new ProductoAux("Paracetamol", 20f, "Bayer", "PAR-001", 10), 2, 10F));
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

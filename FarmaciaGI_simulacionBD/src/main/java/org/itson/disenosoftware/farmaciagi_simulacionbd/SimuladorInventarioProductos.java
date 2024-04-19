package org.itson.disenosoftware.farmaciagi_simulacionbd;

import java.util.LinkedList;
import java.util.List;
import org.itson.disenosoftware.farmaciagi_simulacionbd.objetos.ProductoAux;

public class SimuladorInventarioProductos {

    private static SimuladorInventarioProductos simulador;
    private List<ProductoAux> inventario;

    private SimuladorInventarioProductos() {
        inventario = new LinkedList<>();
        agregarInventario();
    }

    private void agregarInventario() {
        inventario.add(new ProductoAux("Paracetamol", 8.21F, "Ultra", "PCO-001", 10));
        inventario.add(new ProductoAux("Sildenafil", 25.04F, "Ultra", "SLD-541", 10));
        inventario.add(new ProductoAux("Naproxeno", 30.19F, "Amsa", "NPX-649", 10));
        inventario.add(new ProductoAux("Treda", 35.21F, "Amsa", "TDA-874", 10));
        inventario.add(new ProductoAux("Rebotril", 500F, "Psychopath", "RPL-871", 10));
        inventario.add(new ProductoAux("Ventanilo", 54.98F, "Psychopath", "VLP-405", 10));
        inventario.add(new ProductoAux("Simi Paletas", 40.87F, "Simi", "SMP-408", 10));
        inventario.add(new ProductoAux("Simi Fibra", 299.5F, "Simi", "SMF-740", 10));
        inventario.add(new ProductoAux("Diclofenaco", 84F, "Amsa", "DCA-471", 10));
        inventario.add(new ProductoAux("Proctoacid", 121.04F, "Ultra", "PRD-450", 10));
    }

    public static SimuladorInventarioProductos getInstance(){
        if (simulador == null) {
            simulador = new SimuladorInventarioProductos();
        }
        return simulador;
    }
    
    public List<ProductoAux> getInventario() {
        return inventario;
    }
    
}

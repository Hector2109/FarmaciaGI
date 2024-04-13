package org.itson.disenosoftware.farmaciagi_simulacionbd;

import java.util.LinkedList;
import java.util.List;
import org.itson.diseñosoftware.farmaciagidominio.Producto;

public class SimuladorInventarioProductos {

    private static SimuladorInventarioProductos simulador;
    private List<Producto> inventario;

    private SimuladorInventarioProductos() {
        inventario = new LinkedList<>();
        agregarInventario();
    }

    private void agregarInventario() {
        inventario.add(new Producto("Paracetamol", 8.21F, "Ultra", "PCO-001", 10));
        inventario.add(new Producto("Sildenafil", 25.04F, "Ultra", "SLD-541", 10));
        inventario.add(new Producto("Naproxeno", 30.19F, "Amsa", "NPX-649", 10));
        inventario.add(new Producto("Treda", 35.21F, "Amsa", "TDA-874", 10));
        inventario.add(new Producto("Rebotril", 500F, "Psychopath", "RPL-871", 10));
        inventario.add(new Producto("Ventanilo", 54.98F, "Psychopath", "VLP-405", 10));
        inventario.add(new Producto("Simi Paletas", 40.87F, "Simi", "SMP-408", 10));
        inventario.add(new Producto("Simi Fibra", 299.5F, "Simi", "SMF-740", 10));
        inventario.add(new Producto("Diclofenaco", 84F, "Amsa", "DCA-471", 10));
        inventario.add(new Producto("Proctoacid", 121.04F, "Ultra", "PRD-450", 10));
    }

    public static SimuladorInventarioProductos getInstance(){
        if (simulador == null) {
            simulador = new SimuladorInventarioProductos();
        }
        return simulador;
    }
    
    public List<Producto> getInventario() {
        return inventario;
    }
    
}

package pruebas;

import java.util.ArrayList;
import java.util.GregorianCalendar;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.itson.diseñosoftware.farmaciagidominio.Cliente;
import org.itson.diseñosoftware.farmaciagidominio.Producto;
import org.itson.diseñosoftware.farmaciagidominio.Promocion;
import org.itson.diseñosoftware.farmaciagidominio.Venta;
import org.itson.diseñosoftware.farmaciagipersistencia.gestores.GestorClientes;
import org.itson.diseñosoftware.farmaciagipersistencia.gestores.GestorProductos;
import org.itson.diseñosoftware.farmaciagipersistencia.gestores.GestorPromociones;
import org.itson.diseñosoftware.farmaciagipersistencia.gestores.GestorVentas;
import org.itson.diseñosoftware.farmaciagipersistencia.dtos.ClienteDTO;
import org.itson.diseñosoftware.farmaciagipersistencia.dtos.PromocionDTO;
import org.itson.diseñosoftware.farmaciagipersistencia.excepciones.PersistenciaException;
import org.itson.diseñosoftware.farmaciagipersistencia.gestores.IGestorClientes;
import org.itson.diseñosoftware.farmaciagipersistencia.gestores.IGestorProductos;
import org.itson.diseñosoftware.farmaciagipersistencia.gestores.IGestorPromociones;
import org.itson.diseñosoftware.farmaciagipersistencia.gestores.IGestorVentas;

public class Pruebas {
    
    public static void main(String[] args) {
        
        List<Producto> productos = new ArrayList<>();
        IGestorProductos productosDAO = new GestorProductos(productos);
        
        List<Promocion> promociones = new ArrayList<>();
        IGestorPromociones promocionesDAO = new GestorPromociones(promociones);
        
        List<Cliente> clientes = new ArrayList<>();
        IGestorClientes clientesDAO = new GestorClientes(clientes);

        List<Venta> ventas = new ArrayList<>();
        IGestorVentas ventasDAO = new GestorVentas(ventas);
        
        PromocionDTO promocionNueva = new PromocionDTO("P-001", "Paracetamol 2x1", 10.0F);
        try {
            promocionesDAO.agregarPromocion(promocionNueva);
        } catch (PersistenciaException ex) {
            Logger.getLogger(Pruebas.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        ClienteDTO clienteNuevo = new ClienteDTO("C-001", "Ricardo", "Gutiérrez", new GregorianCalendar());
        try {
            clientesDAO.agregarCliente(clienteNuevo);
        } catch (PersistenciaException ex) {
            Logger.getLogger(Pruebas.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
}

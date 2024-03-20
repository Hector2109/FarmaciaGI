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
import org.itson.diseñosoftware.farmaciagipersistencia.daos.ClientesDAO;
import org.itson.diseñosoftware.farmaciagipersistencia.daos.IClientesDAO;
import org.itson.diseñosoftware.farmaciagipersistencia.daos.IProductosDAO;
import org.itson.diseñosoftware.farmaciagipersistencia.daos.IPromocionesDAO;
import org.itson.diseñosoftware.farmaciagipersistencia.daos.IVentasDAO;
import org.itson.diseñosoftware.farmaciagipersistencia.daos.ProductosDAO;
import org.itson.diseñosoftware.farmaciagipersistencia.daos.PromocionesDAO;
import org.itson.diseñosoftware.farmaciagipersistencia.daos.VentasDAO;
import org.itson.diseñosoftware.farmaciagipersistencia.dtos.ClienteDTO;
import org.itson.diseñosoftware.farmaciagipersistencia.dtos.PromocionDTO;
import org.itson.diseñosoftware.farmaciagipersistencia.excepciones.PersistenciaException;

public class Pruebas {
    
    public static void main(String[] args) {
        
        List<Producto> productos = new ArrayList<>();
        IProductosDAO productosDAO = new ProductosDAO(productos);
        
        List<Promocion> promociones = new ArrayList<>();
        IPromocionesDAO promocionesDAO = new PromocionesDAO(promociones);
        
        List<Cliente> clientes = new ArrayList<>();
        IClientesDAO clientesDAO = new ClientesDAO(clientes);

        List<Venta> ventas = new ArrayList<>();
        IVentasDAO ventasDAO = new VentasDAO(ventas);
        
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

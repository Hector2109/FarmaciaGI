package pruebaBD;

import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.itson.diseniosofware.mifarmaciagi.persistencia.Conexion.Conexion;
import org.itson.diseniosofware.mifarmaciagi.persistencia.Conexion.IConexion;
import org.itson.diseniosofware.mifarmaciagi.persistencia.Exception.PersistenciaException;
import org.itson.diseniosofware.mifarmaciagi.persistencia.entidades.Producto;
import org.itson.diseniosofware.mifarmaciagi.persistencia.daos.IProductosDAO;
import org.itson.diseniosofware.mifarmaciagi.persistencia.daos.IProductosDAO;
import org.itson.diseniosofware.mifarmaciagi.persistencia.daos.IPromocionesDAO;
import org.itson.diseniosofware.mifarmaciagi.persistencia.daos.IPromocionesDAO;
import org.itson.diseniosofware.mifarmaciagi.persistencia.daos.ProductosDAO;
import org.itson.diseniosofware.mifarmaciagi.persistencia.daos.PromocionesDAO;
import org.itson.diseniosofware.mifarmaciagi.persistencia.daos.PromocionesDAO;
import org.itson.diseniosofware.mifarmaciagi.persistencia.entidades.Promocion;

/**
 *
 * @author Hector Espinoza
 */
public class Prueba {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        IConexion conexion = new Conexion();
        IPromocionesDAO promocionesDAO = new PromocionesDAO(conexion);
        
//        try {
//            productosDAO.registrarProducto(producto);
//        } catch (PersistenciaException ex) {
//            Logger.getLogger(Prueba.class.getName()).log(Level.SEVERE, null, ex);
//        }
        
//        Promocion promocionRegistro = promocionesDAO.obtenerPromocion("PR001");
//        System.out.println(promocionRegistro);
        
//        List<Promocion> promociones = promocionesDAO.obtenerPromociones();
//        for (Promocion promocion : promociones) {
//            System.out.println(promocion);
//        }
        

        IProductosDAO productosDAO= new ProductosDAO(conexion); 
        
        Producto producto = new Producto();
        
        producto.setCodigo("AAA-000");
        producto.setCosto(100F);
        producto.setMarca("FarmaciaGI");
        producto.setNombre("Paracetamol uwu");
        
        try {
            productosDAO.actualizarProducto(producto);
            
            
//        Promocion promocionNueva = new Promocion();
//        promocionNueva.setDescripcion("Paracetamol 2x1");
//        promocionNueva.setDescuento(20.0f);
//        
//        try {
//            promocionesDAO.agregarPromocion(promocionNueva);
//            
//            Logger.getLogger(Prueba.class.getName()).log(Level.INFO, "Se agregó la promocion correctamente");
//        } catch (PersistenciaException ex) {
//            Logger.getLogger(Prueba.class.getName()).log(Level.SEVERE, null, ex);
//        }
        } catch (PersistenciaException ex) {
            Logger.getLogger(Prueba.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
}

package pruebaBD;

import java.util.logging.Level;
import java.util.logging.Logger;
import org.itson.diseniosofware.mifarmaciagi.persistencia.Conexion.Conexion;
import org.itson.diseniosofware.mifarmaciagi.persistencia.Conexion.IConexion;
import org.itson.diseniosofware.mifarmaciagi.persistencia.Exception.PersistenciaException;
import org.itson.diseniosofware.mifarmaciagi.persistencia.entidades.Producto;
import org.itson.diseniosofware.mifarmaciagi.persistencia.productos.IProductosDAO;
import org.itson.diseniosofware.mifarmaciagi.persistencia.productos.ProductosDAO;

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
        IProductosDAO productosDAO = new ProductosDAO(conexion);
        
        
        Producto producto = new Producto();
        
        producto.setCodigo("AAA-000");
        producto.setCantidad(777);
        producto.setCosto(500.0f);
        producto.setMarca("Similares");
        producto.setNombre("Simi paletas uwu");
        
        try {
            productosDAO.registrarProducto(producto);
        } catch (PersistenciaException ex) {
            Logger.getLogger(Prueba.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
    }
    
}

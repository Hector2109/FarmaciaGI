package pruebas;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.itson.diseniosofware.mifarmaciagi.persistencia.Conexion.Conexion;
import org.itson.diseniosofware.mifarmaciagi.persistencia.Conexion.IConexion;
import org.itson.diseniosofware.mifarmaciagi.persistencia.Exception.PersistenciaException;
import org.itson.diseniosofware.mifarmaciagi.persistencia.daos.IProveedoresDAO;
import org.itson.diseniosofware.mifarmaciagi.persistencia.daos.ProveedoresDAO;
import org.itson.diseniosofware.mifarmaciagi.persistencia.entidades.Direccion;
import org.itson.diseniosofware.mifarmaciagi.persistencia.entidades.Proveedor;

public class pruebas {

    public static void main(String[] args) {
        IConexion conexion = new Conexion();
        IProveedoresDAO provColeccion = new ProveedoresDAO(conexion);
        
        List<String> telefonos = new ArrayList<>();
        telefonos.add("6442522645");
        telefonos.add("6442522646");
        
        Proveedor proveedor = new Proveedor(
                "PEMEX", 
                new Direccion("Arroz", "Valle Verde", "13450", "85080", "Cd.Obregón"), 
                telefonos, 
                "RIDLWR878"
        );
        
//        Proveedor proveedor = new Proveedor();
//        proveedor.setNombre("Amazon");

        try {
            System.out.println(provColeccion.obtenerProveedores());
        } catch (PersistenciaException ex) {
            Logger.getLogger(pruebas.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}

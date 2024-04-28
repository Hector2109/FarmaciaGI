package org.itson.diseniosofware.mifarmaciagi.persistencia.daos;

import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import java.util.LinkedList;
import java.util.List;
import org.itson.diseniosofware.mifarmaciagi.persistencia.Conexion.IConexion;
import org.itson.diseniosofware.mifarmaciagi.persistencia.entidades.Promocion;

public class PromocionesDAO implements IPromocionesDAO {

    private final MongoDatabase baseDatos;
    private String nombreColeccion;

    public PromocionesDAO(IConexion conexion) {
        baseDatos = conexion.crearConexion();
        nombreColeccion = "promociones";
    }

    @Override
    public List<Promocion> obtenerPromociones() {
        MongoCollection<Promocion> coleccion = baseDatos.getCollection(nombreColeccion, Promocion.class);

        List<Promocion> promociones = new LinkedList<>();
        coleccion.find().into(promociones);

        return promociones;
    }

}

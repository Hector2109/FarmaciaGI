package org.itson.diseniosofware.mifarmaciagi.persistencia.daos;

import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import static com.mongodb.client.model.Filters.eq;
import java.util.LinkedList;
import java.util.List;
import org.itson.diseniosofware.mifarmaciagi.persistencia.Conexion.IConexion;
import org.itson.diseniosofware.mifarmaciagi.persistencia.Exception.PersistenciaException;
import org.itson.diseniosofware.mifarmaciagi.persistencia.entidades.Promocion;

public class PromocionesDAO implements IPromocionesDAO {

    private final MongoDatabase baseDatos;
    private String nombreColeccion;

    public PromocionesDAO(IConexion conexion) {
        baseDatos = conexion.crearConexion();
        nombreColeccion = "promociones";
    }

    @Override
    public Promocion obtenerPromocion(String codigo) {
        MongoCollection<Promocion> coleccion = baseDatos.getCollection(nombreColeccion, Promocion.class);

        Promocion promocion = coleccion.find(eq("codigo", codigo)).first();

        return promocion;
    }

    @Override
    public void agregarPromocion(Promocion promocionNueva) throws PersistenciaException {
        MongoCollection<Promocion> coleccion = baseDatos.getCollection(nombreColeccion, Promocion.class);
        
        coleccion.insertOne(promocionNueva);
    }

    @Override
    public List<Promocion> obtenerPromociones() {
        MongoCollection<Promocion> coleccion = baseDatos.getCollection(nombreColeccion, Promocion.class);

        List<Promocion> promociones = new LinkedList<>();
        coleccion.find().into(promociones);

        return promociones;
    }

}

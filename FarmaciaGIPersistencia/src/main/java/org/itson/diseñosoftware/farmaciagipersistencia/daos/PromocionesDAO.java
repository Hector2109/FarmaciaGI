package org.itson.diseñosoftware.farmaciagipersistencia.daos;

import java.util.List;
import org.itson.diseñosoftware.farmaciagidominio.Promocion;
import org.itson.diseñosoftware.farmaciagipersistencia.dtos.PromocionDTO;
import org.itson.diseñosoftware.farmaciagipersistencia.excepciones.PersistenciaException;

public class PromocionesDAO implements IPromocionesDAO {

    private List<Promocion> promociones;

    public PromocionesDAO(List<Promocion> promociones) {
        this.promociones = promociones;
    }

    @Override
    public Promocion obtenerPromocion(PromocionDTO promocionBuscada) throws PersistenciaException {
        Promocion promocion = new Promocion(promocionBuscada.getCodigo(), promocionBuscada.getDescripcion(), 
                promocionBuscada.getDescuento());
        
        if (promociones.contains(promocion)) {
            return promociones.get(promociones.indexOf(promocion));
        }
        throw new PersistenciaException("La promoción no existe.");
    }

    @Override
    public void agregarPromocion(PromocionDTO promocionNueva) throws PersistenciaException {
        Promocion promocion = new Promocion(promocionNueva.getCodigo(), promocionNueva.getDescripcion(),
                promocionNueva.getDescuento());
        
        if (!promociones.contains(promocion)) {
            promociones.add(promocion);
        } else {
            throw new PersistenciaException("La promoción ya existe.");
        }
    }

}

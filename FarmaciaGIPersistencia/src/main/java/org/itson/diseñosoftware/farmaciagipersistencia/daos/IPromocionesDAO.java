package org.itson.diseñosoftware.farmaciagipersistencia.daos;

import org.itson.diseñosoftware.farmaciagidominio.Promocion;
import org.itson.diseñosoftware.farmaciagipersistencia.dtos.PromocionDTO;

public interface IPromocionesDAO {
    
    public Promocion obtenerPromocion(PromocionDTO promocion);
    
    public void crearPromocion(PromocionDTO promocion);
}

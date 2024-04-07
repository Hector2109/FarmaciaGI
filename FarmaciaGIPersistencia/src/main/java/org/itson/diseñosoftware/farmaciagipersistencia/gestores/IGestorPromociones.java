package org.itson.diseñosoftware.farmaciagipersistencia.gestores;

import org.itson.diseñosoftware.farmaciagidominio.Promocion;
import org.itson.diseñosoftware.farmaciagipersistencia.dtos.PromocionDTO;
import org.itson.diseñosoftware.farmaciagipersistencia.excepciones.PersistenciaException;

public interface IGestorPromociones {
    
    public Promocion obtenerPromocion(PromocionDTO promocion) throws PersistenciaException;
    
    public void agregarPromocion(PromocionDTO promocion) throws PersistenciaException;
}

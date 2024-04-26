package org.itson.diseniosofware.mifarmaciagi.persistencia.daos;

import java.util.List;
import org.itson.diseniosofware.mifarmaciagi.persistencia.Exception.PersistenciaException;
import org.itson.diseniosofware.mifarmaciagi.persistencia.entidades.Promocion;

public interface IPromocionesDAO {

    public Promocion obtenerPromocion(String codigo);

    public void agregarPromocion(Promocion promocionNueva) throws PersistenciaException;

    public List<Promocion> obtenerPromociones();

}

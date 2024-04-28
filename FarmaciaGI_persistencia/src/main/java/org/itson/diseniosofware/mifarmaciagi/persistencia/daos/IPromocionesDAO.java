package org.itson.diseniosofware.mifarmaciagi.persistencia.daos;

import java.util.List;
import org.itson.diseniosofware.mifarmaciagi.persistencia.entidades.Promocion;

public interface IPromocionesDAO {

    /**
     * Permite obtener una lista con todas las promociones del registro.
     *
     * @return Una lista con todas las promociones del registro
     */
    public List<Promocion> obtenerPromociones();

}

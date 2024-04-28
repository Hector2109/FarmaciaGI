package org.itson.disenosoftware.farmaciagi_subsistema_promociones;

import java.util.List;
import org.itson.disenosoftware.farmaciagi_dtos.PromocionDTO;
import org.itson.diseñosoftware.farmaciagi_objetosNegocio.PromocionBO;

public class ControlGestorPromociones {

    private PromocionBO promocion;

    /**
     * Constructor.
     */
    public ControlGestorPromociones() {
        promocion = new PromocionBO();
    }

    /**
     * Permite obtener una lista con todas las promociones del registro.
     *
     * @return Una lista con todas las promociones del registro
     */
    public List<PromocionDTO> obtenerPromociones() {
        return promocion.obtenerPromociones();
    }
}

package org.itson.disenosoftware.farmaciagi_subsistema_promociones;

import java.util.List;
import org.itson.disenosoftware.farmaciagi_dtos.PromocionDTO;

public class GestorPromociones implements IGestorPromociones {

    private ControlGestorPromociones control;

    /**
     * Constructor.
     */
    public GestorPromociones() {
        control = new ControlGestorPromociones();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<PromocionDTO> obtenerPromociones() {
        return control.obtenerPromociones();
    }

}

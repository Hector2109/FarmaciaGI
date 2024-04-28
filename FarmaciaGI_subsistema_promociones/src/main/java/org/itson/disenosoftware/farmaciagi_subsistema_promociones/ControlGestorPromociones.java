package org.itson.disenosoftware.farmaciagi_subsistema_promociones;

import java.util.List;
import org.itson.disenosoftware.farmaciagi_dtos.PromocionDTO;
import org.itson.diseñosoftware.farmaciagi_objetosNegocio.PromocionBOAux;

public class ControlGestorPromociones {

    private PromocionBOAux promocion;

    public ControlGestorPromociones() {
        promocion = new PromocionBOAux();
    }

    public List<PromocionDTO> obtenerPromociones() {
        return promocion.obtenerPromociones();
    }
}

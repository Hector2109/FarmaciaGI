package org.itson.disenosoftware.farmaciagi_subsistema_promociones;

import java.util.List;
import org.itson.disenosoftware.farmaciagi_dtos.PromocionDTO;
import org.itson.diseñosoftware.farmaciagi_objetosNegocio.PromocionBO;

public class ControlGestorPromociones {

    private PromocionBO promocion;

    public ControlGestorPromociones() {
        promocion = new PromocionBO();
    }

    public PromocionDTO obtenerPromocion(PromocionDTO promocionBuscada) {
        return promocion.obtenerPromocion(promocionBuscada);
    }

    public List<PromocionDTO> obtenerPromociones() {
        return promocion.obtenerPromociones();
    }
}

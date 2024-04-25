package org.itson.disenosoftware.farmaciagi_subsistema_promociones;

import java.util.List;
import org.itson.disenosoftware.farmaciagi_dtos.PromocionDTO;

public interface IGestorPromociones {

    public PromocionDTO obtenerPromocion(PromocionDTO promocionBuscada);

    public List<PromocionDTO> obtenerPromociones();

}

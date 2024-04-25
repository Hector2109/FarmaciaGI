package org.itson.diseñosoftware.farmaciagi_objetosNegocio;

import java.util.LinkedList;
import java.util.List;
import org.itson.disenosoftware.farmaciagi_dtos.ProductoDTO;
import org.itson.disenosoftware.farmaciagi_dtos.PromocionDTO;
import org.itson.disenosoftware.farmaciagi_simulacionbd.SimuladorRegistroPromociones;
import org.itson.disenosoftware.farmaciagi_simulacionbd.objetos.ProductoAux;
import org.itson.disenosoftware.farmaciagi_simulacionbd.objetos.PromocionAux;

public class Promocion {

    private SimuladorRegistroPromociones registro;

    public Promocion() {
        registro = SimuladorRegistroPromociones.getInstance();
    }

    public PromocionDTO obtenerPromocion(PromocionDTO promocionBuscada) {
        PromocionAux promocionRegistro = null;
        for (PromocionAux promocion : registro.getRegistro()) {
            if (promocion.getCodigo().equals(promocionBuscada.getCodigo())) {
                promocionRegistro = promocion;
            }
        }

        if (promocionRegistro != null) {
            PromocionDTO promocion = new PromocionDTO(promocionRegistro.getCodigo(),
                    promocionRegistro.getDescripcion(), promocionRegistro.getDescuento());

            return promocion;
        } else {
            return null;
        }
    }

    public List<PromocionDTO> obtenerPromociones() {
        List<PromocionDTO> promocionesRegistro = new LinkedList<>();
        for (PromocionAux promocionRegistro : registro.getRegistro()) {
            PromocionDTO promocion = new PromocionDTO(promocionRegistro.getCodigo(), 
                    promocionRegistro.getDescripcion(), promocionRegistro.getDescuento());
            promocionesRegistro.add(promocion);
        }
        return promocionesRegistro;
    }
}

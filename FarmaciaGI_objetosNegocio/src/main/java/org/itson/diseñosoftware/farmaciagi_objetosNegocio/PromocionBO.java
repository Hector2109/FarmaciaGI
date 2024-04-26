package org.itson.diseñosoftware.farmaciagi_objetosNegocio;

import java.util.LinkedList;
import java.util.List;
import org.itson.diseniosofware.mifarmaciagi.persistencia.Conexion.Conexion;
import org.itson.diseniosofware.mifarmaciagi.persistencia.Conexion.IConexion;
import org.itson.diseniosofware.mifarmaciagi.persistencia.daos.IPromocionesDAO;
import org.itson.diseniosofware.mifarmaciagi.persistencia.daos.PromocionesDAO;
import org.itson.diseniosofware.mifarmaciagi.persistencia.entidades.Promocion;
import org.itson.disenosoftware.farmaciagi_dtos.PromocionDTO;
import org.itson.disenosoftware.farmaciagi_simulacionbd.objetos.PromocionAux;

public class PromocionBO {

    private IPromocionesDAO promocionesDAO;
    private IConexion conexion;

    public PromocionBO() {
        conexion = new Conexion();
        promocionesDAO = new PromocionesDAO(conexion);
    }

    public PromocionDTO obtenerPromocion(PromocionDTO promocionBuscada) {
        Promocion promocionRegistro = promocionesDAO.obtenerPromocion(promocionBuscada.getCodigo());
    
        PromocionDTO promocion = new PromocionDTO(promocionRegistro.getCodigo(), promocionRegistro.getDescripcion(),
        promocionRegistro.getDescuento());
        
        return promocion;
    }

    public List<PromocionDTO> obtenerPromociones() {
        List<Promocion> promocionesRegistro = promocionesDAO.obtenerPromociones();
        List<PromocionDTO> promociones = new LinkedList<>();
        
        for (Promocion promocionRegistro : promocionesRegistro) {
            PromocionDTO promocion = new PromocionDTO(promocionRegistro.getCodigo(), 
                    promocionRegistro.getDescripcion(), promocionRegistro.getDescuento());
            promociones.add(promocion);
        }
        
        return promociones;
    }
}

package org.itson.diseñosoftware.farmaciagi_objetosNegocio;

import java.util.LinkedList;
import java.util.List;
import org.itson.diseniosofware.mifarmaciagi.persistencia.Conexion.Conexion;
import org.itson.diseniosofware.mifarmaciagi.persistencia.Conexion.IConexion;
import org.itson.diseniosofware.mifarmaciagi.persistencia.daos.IPromocionesDAO;
import org.itson.diseniosofware.mifarmaciagi.persistencia.daos.PromocionesDAO;
import org.itson.diseniosofware.mifarmaciagi.persistencia.entidades.Promocion;
import org.itson.disenosoftware.farmaciagi_dtos.ProductoDTO;
import org.itson.disenosoftware.farmaciagi_dtos.PromocionDTO;

public class PromocionBO {

    private IPromocionesDAO promocionesDAO;
    private IConexion conexion;

    /**
     * Constructor.
     */
    public PromocionBO() {
        conexion = new Conexion();
        promocionesDAO = new PromocionesDAO(conexion);
    }

    /**
     * Permite obtener una lista con todas las promociones del registro.
     *
     * @return Una lista con todas las promociones del registro
     */
    public List<PromocionDTO> obtenerPromociones() {
        List<Promocion> promocionesRegistro = promocionesDAO.obtenerPromociones();
        List<PromocionDTO> promociones = new LinkedList<>();

        for (Promocion promocionRegistro : promocionesRegistro) {
            List<String> productoPromocion = promocionRegistro.getProducto();

            String[] datosProducto = new String[5];
            productoPromocion.toArray(datosProducto);

            ProductoDTO producto = new ProductoDTO(datosProducto[0], datosProducto[1],
                    Float.valueOf(datosProducto[2]), datosProducto[3], Integer.valueOf(datosProducto[4]));

            PromocionDTO promocion = new PromocionDTO(promocionRegistro.getCodigo(), promocionRegistro.getDescripcion(),
                    producto, promocionRegistro.getCantidad(), promocionRegistro.getPrecioUnitario());

            promociones.add(promocion);
        }

        return promociones;
    }
}

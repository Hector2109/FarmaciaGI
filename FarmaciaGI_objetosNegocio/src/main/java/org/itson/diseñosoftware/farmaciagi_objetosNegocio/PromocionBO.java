package org.itson.diseñosoftware.farmaciagi_objetosNegocio;

import java.util.LinkedList;
import java.util.List;
import org.itson.diseniosofware.mifarmaciagi.persistencia.Conexion.Conexion;
import org.itson.diseniosofware.mifarmaciagi.persistencia.Conexion.IConexion;
import org.itson.diseniosofware.mifarmaciagi.persistencia.daos.IPromocionesDAO;
import org.itson.diseniosofware.mifarmaciagi.persistencia.daos.PromocionesDAO;
import org.itson.diseniosofware.mifarmaciagi.persistencia.entidades.Producto;
import org.itson.diseniosofware.mifarmaciagi.persistencia.entidades.Promocion;
import org.itson.disenosoftware.farmaciagi_dtos.ProductoDTO;
import org.itson.disenosoftware.farmaciagi_dtos.PromocionDTO;

public class PromocionBO {

    private IPromocionesDAO promocionesDAO;
    private IConexion conexion;

    public PromocionBO() {
        conexion = new Conexion();
        promocionesDAO = new PromocionesDAO(conexion);
    }

    public PromocionDTO obtenerPromocion(PromocionDTO promocionBuscada) {
        Promocion promocionRegistro = promocionesDAO.obtenerPromocion(promocionBuscada.getCodigo());

        Producto productoPromocion = promocionRegistro.getProducto();

        ProductoDTO producto = new ProductoDTO(productoPromocion.getCodigo(), productoPromocion.getNombre(),
                productoPromocion.getCosto(), productoPromocion.getMarca(), productoPromocion.getCantidad());

        PromocionDTO promocion = new PromocionDTO(promocionRegistro.getCodigo(), promocionRegistro.getDescripcion(),
                producto, promocionRegistro.getCantidad(), promocionRegistro.getPrecioUnitario());

        return promocion;
    }

    public List<PromocionDTO> obtenerPromociones() {
        List<Promocion> promocionesRegistro = promocionesDAO.obtenerPromociones();
        List<PromocionDTO> promociones = new LinkedList<>();

        for (Promocion promocionRegistro : promocionesRegistro) {
            Producto productoPromocion = promocionRegistro.getProducto();

            ProductoDTO producto = new ProductoDTO(productoPromocion.getCodigo(), productoPromocion.getNombre(),
                    productoPromocion.getCosto(), productoPromocion.getMarca(), productoPromocion.getCantidad());

            PromocionDTO promocion = new PromocionDTO(promocionRegistro.getCodigo(), promocionRegistro.getDescripcion(), 
                    producto, promocionRegistro.getCantidad(), promocionRegistro.getPrecioUnitario());
            
            promociones.add(promocion);
        }

        return promociones;
    }
}

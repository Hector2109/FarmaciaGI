package org.itson.diseñosoftware.farmaciagi_objetosNegocio;

import java.util.LinkedList;
import java.util.List;
import org.itson.disenosoftware.farmaciagi_dtos.ProductoDTO;
import org.itson.disenosoftware.farmaciagi_dtos.PromocionDTO;
import org.itson.disenosoftware.farmaciagi_simulacionbd.SimuladorRegistroPromociones;
import org.itson.disenosoftware.farmaciagi_simulacionbd.objetos.ProductoAux;
import org.itson.disenosoftware.farmaciagi_simulacionbd.objetos.PromocionAux;

public class PromocionBOAux {
    
    private SimuladorRegistroPromociones registro;

    public PromocionBOAux() {
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
            ProductoAux productoPromocion = promocionRegistro.getProducto();
            
            ProductoDTO producto = new ProductoDTO(productoPromocion.getCodigo(), productoPromocion.getNombre(), 
                    productoPromocion.getCosto(),productoPromocion.getMarca(), productoPromocion.getCantidad());
            
            PromocionDTO promocion = new PromocionDTO(promocionRegistro.getCodigo(), promocionRegistro.getDescripcion(), 
                    producto, promocionRegistro.getCantidad(), promocionRegistro.getPrecioUnitario());

            return promocion;
        } else {
            return null;
        }
    }

    public List<PromocionDTO> obtenerPromociones() {
        List<PromocionDTO> promocionesRegistro = new LinkedList<>();
        for (PromocionAux promocionRegistro : registro.getRegistro()) {
            ProductoAux productoPromocion = promocionRegistro.getProducto();
            
            ProductoDTO producto = new ProductoDTO(productoPromocion.getCodigo(), productoPromocion.getNombre(), 
                    productoPromocion.getCosto(),productoPromocion.getMarca(), productoPromocion.getCantidad());
            
            PromocionDTO promocion = new PromocionDTO(promocionRegistro.getCodigo(), promocionRegistro.getDescripcion(), 
                    producto, promocionRegistro.getCantidad(), promocionRegistro.getPrecioUnitario());

            promocionesRegistro.add(promocion);
        }
        return promocionesRegistro;
    }
    
}

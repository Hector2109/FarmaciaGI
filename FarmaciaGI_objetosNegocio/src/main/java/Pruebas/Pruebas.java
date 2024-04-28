package Pruebas;

import java.util.List;
import org.itson.diseniosofware.mifarmaciagi.persistencia.entidades.Producto;
import org.itson.disenosoftware.farmaciagi_dtos.ProductoDTO;
import org.itson.disenosoftware.farmaciagi_dtos.PromocionDTO;
import org.itson.diseñosoftware.farmaciagi_objetosNegocio.ProductoBO;
import org.itson.diseñosoftware.farmaciagi_objetosNegocio.PromocionBO;

public class Pruebas {

    public static void main(String[] args) {
        
        PromocionBO promocionBO = new PromocionBO();
//        
////        PromocionDTO promocion = promocionBO.obtenerPromocion(new PromocionDTO("PR001", "", 0.0f));
////        System.out.println(promocion.getCodigo() + ", " + promocion.getDescripcion() + ", " + promocion.getDescuento());
//        
        List<PromocionDTO> promociones = promocionBO.obtenerPromociones();
        for (PromocionDTO promocion : promociones) {
            System.out.println(promocion.getCodigo() + ", " + promocion.getDescripcion() + ", " + promocion.getProducto() + ", " + promocion.getCantidad() + ", " + promocion.getPrecioUnitario());
        }


//        ProductoBO productoBO = new ProductoBO();
//        
//        ProductoDTO productoDTO = new ProductoDTO();
//        productoDTO.setCodigo("AAA-000");
//        
//        ProductoDTO productoEncontrado = productoBO.obtenerProducto(productoDTO);
//        
//        System.out.println(productoEncontrado);
        
    }
    
}

package org.itson.diseñosoftware.farmaciagi_objetosNegocio;

import java.util.LinkedList;
import java.util.List;
import org.itson.disenosoftware.farmaciagi_dtos.ProductoDTO;
import org.itson.disenosoftware.farmaciagi_dtos.VentaDTO;
import org.itson.disenosoftware.farmaciagi_simulacionbd.SimuladorRegistroVentas;
import org.itson.disenosoftware.farmaciagi_simulacionbd.objetos.ProductoAux;
import org.itson.disenosoftware.farmaciagi_simulacionbd.objetos.VentaAux;
import org.itson.diseñosoftware.farmaciagi_objetosNegocio.excepciones.ObjetosNegocioException;

public class VentaBO {

//    private SimuladorRegistroVentas registro;
    
    public VentaBO(){
//        registro = SimuladorRegistroVentas.getInstance();
    }
    
    public void registrarVenta(VentaDTO ventaNueva) throws ObjetosNegocioException {
//        VentaAux ventaRegistro = null;
//        for (VentaAux venta : registro.obtenerRegistro()) {
//            if (venta.getCodigo().equals(ventaNueva.getCodigo())) {
//                ventaRegistro = venta;
//            }
//        }
//
//        if (ventaRegistro == null) {
//            List<ProductoAux> productosVenta = new LinkedList<>();
//            for (ProductoDTO producto : ventaNueva.getProductos()) {
//                ProductoAux productoVenta = new ProductoAux(producto.getNombre(), producto.getCosto(),
//                        producto.getMarca(), producto.getCodigo(), producto.getCantidad());
//                productosVenta.add(productoVenta);
//            }
//
//            VentaAux venta = new VentaAux(ventaNueva.getCodigo(), productosVenta,
//                    ventaNueva.getTotal(), ventaNueva.getFecha());
//
//            registro.obtenerRegistro().add(venta);
//        } else {
//            throw new ObjetosNegocioException("No se pudo registrar la venta.");
//        }
    }
    
}

package org.itson.disenosoftware.farmaciagi_subsistema_ventas;

import java.util.LinkedList;
import java.util.List;
import org.itson.disenosoftware.farmaciagi_dtos.ProductoDTO;
import org.itson.disenosoftware.farmaciagi_dtos.VentaDTO;
import org.itson.diseñosoftware.farmaciagidominio.Producto;
import org.itson.diseñosoftware.farmaciagidominio.Venta;

class ControlGestorVentas {

    public void registrarVenta(VentaDTO ventaNueva) {
        if (registroVentas.obtenerVenta(new Venta(ventaNueva.getCodigo())) == null) {

            List<Producto> productosVenta = new LinkedList<>();
            for (ProductoDTO producto : ventaNueva.getProductos()) {
                Producto productoVenta = new Producto(producto.getNombre(), producto.getCosto(),
                        producto.getMarca(), producto.getCodigo(), producto.getCantidad());
                productosVenta.add(productoVenta);
            }

            Venta venta = new Venta(ventaNueva.getCodigo(), productosVenta,
                    ventaNueva.getTotal(), ventaNueva.getFecha());

            registroVentas.agregarVenta(venta);
        } else {
//            throw new PersistenciaException("La venta ya se encuentra en el registro.");
        }
    }
    
    public void agregarProducto(VentaDTO ventaBuscada, ProductoDTO productoNuevo){
        try {
            Venta venta = registroVentas.obtenerVenta(new Venta(ventaBuscada.getCodigo()));
            
            Producto producto = new Producto(productoNuevo.getNombre(), productoNuevo.getCosto(), 
                    productoNuevo.getMarca(), productoNuevo.getCodigo(), productoNuevo.getCantidad());

            if (!venta.getProductos().contains(producto)) {
                venta.getProductos().add(producto);
            } else {
//                throw new PersistenciaException("El producto ya se encuentra en la venta.");
            }
        } catch (PersistenciaException | NullPointerException e) {
//            throw new PersistenciaException(e.getMessage());
        }
    }
    
    public Float calcularCosto(VentaDTO ventaBuscada){
        try {
            Venta venta = registroVentas.obtenerVenta(new Venta(ventaBuscada.getCodigo()));

            List<Producto> productosVenta = venta.getProductos();
            Float total = 0.0F;
            for (Producto producto : productosVenta) {
                total += producto.getCantidad() * producto.getCosto();
            }
            return total;
        } catch (NullPointerException e) {
//            throw new PersistenciaException(e.getMessage());
        }
    }

}

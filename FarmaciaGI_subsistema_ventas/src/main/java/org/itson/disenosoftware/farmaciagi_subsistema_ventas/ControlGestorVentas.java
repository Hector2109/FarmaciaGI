package org.itson.disenosoftware.farmaciagi_subsistema_ventas;

import java.util.LinkedList;
import java.util.List;
import org.itson.disenosoftware.farmaciagi_dtos.ProductoDTO;
import org.itson.disenosoftware.farmaciagi_dtos.VentaDTO;
import org.itson.disenosoftware.farmaciagi_simulacionbd.SimuladorRegistroVentas;
import org.itson.disenosoftware.farmaciagi_subsistema_ventas.excepciones.ControlVentasException;
import org.itson.diseñosoftware.farmaciagidominio.Producto;
import org.itson.diseñosoftware.farmaciagidominio.Venta;

class ControlGestorVentas {

    private List<Venta> registro;

    public ControlGestorVentas() {
        registro = SimuladorRegistroVentas.getInstance().obtenerRegistro();
    }

    public void registrarVenta(VentaDTO ventaNueva) throws ControlVentasException {
        Venta ventaRegistro = null;
        for (Venta venta : registro) {
            if (venta.getCodigo().equals(ventaNueva.getCodigo())) {
                ventaRegistro = venta;
            }
        }

        if (ventaRegistro == null) {

            List<Producto> productosVenta = new LinkedList<>();
            for (ProductoDTO producto : ventaNueva.getProductos()) {
                Producto productoVenta = new Producto(producto.getNombre(), producto.getCosto(),
                        producto.getMarca(), producto.getCodigo(), producto.getCantidad());
                productosVenta.add(productoVenta);
            }

            Venta venta = new Venta(ventaNueva.getCodigo(), productosVenta,
                    ventaNueva.getTotal(), ventaNueva.getFecha());

            registro.add(venta);
        } else {
            throw new ControlVentasException("La venta no existe.");
        }
    }

    public void agregarProducto(VentaDTO ventaBuscada, ProductoDTO productoNuevo) throws ControlVentasException {
        Venta ventaRegistro = null;
        for (Venta venta : registro) {
            if (venta.getCodigo().equals(ventaBuscada.getCodigo())) {
                ventaRegistro = venta;
            }
        }

        if (ventaRegistro != null) {
            Producto producto = new Producto(productoNuevo.getNombre(), productoNuevo.getCosto(),
                    productoNuevo.getMarca(), productoNuevo.getCodigo(), productoNuevo.getCantidad());

            if (!ventaRegistro.getProductos().contains(producto)) {
                ventaRegistro.getProductos().add(producto);
            }
        } else {
            throw new ControlVentasException("La venta no existe.");
        }
    }

    public Float calcularCosto(VentaDTO ventaBuscada) throws ControlVentasException {
        Venta ventaRegistro = null;
        for (Venta venta : registro) {
            if (venta.getCodigo().equals(ventaBuscada.getCodigo())) {
                ventaRegistro = venta;
            }
        }

        if (ventaRegistro != null) {
            List<Producto> productosVenta = ventaRegistro.getProductos();
            Float total = 0.0F;
            for (Producto producto : productosVenta) {
                total += producto.getCantidad() * producto.getCosto();
            }
            return total;
        } else {
            throw new ControlVentasException("La venta no existe.");
        }
    }

}

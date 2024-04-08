package org.itson.diseñosoftware.farmaciagipersistencia.gestores;

import java.util.LinkedList;
import java.util.List;
import org.itson.diseñosoftware.farmaciagidominio.Producto;
import org.itson.diseñosoftware.farmaciagidominio.Venta;
import org.itson.diseñosoftware.farmaciagipersistencia.Productos;
import org.itson.diseñosoftware.farmaciagipersistencia.RegistroVentas;
import org.itson.diseñosoftware.farmaciagipersistencia.dtos.ProductoDTO;
import org.itson.diseñosoftware.farmaciagipersistencia.dtos.VentaDTO;
import org.itson.diseñosoftware.farmaciagipersistencia.excepciones.PersistenciaException;

public class GestorVentas implements IGestorVentas {

    private RegistroVentas registroVentas;

    public GestorVentas(RegistroVentas registroVentas) {
        this.registroVentas = registroVentas;
    }

    @Override
    public VentaDTO obtenerVenta(VentaDTO ventaBuscada) throws PersistenciaException {
        Venta ventaRegistro = registroVentas.obtenerVenta(new Venta(ventaBuscada.getCodigo()));

        if (ventaRegistro != null) {
            
            List<ProductoDTO> productosVenta = new LinkedList<>();
            for (Producto producto : ventaRegistro.getProductos()) {
                ProductoDTO productoVenta = new ProductoDTO(producto.getCodigo(), producto.getNombre(),
                        producto.getCosto(), producto.getMarca(), producto.getCantidad());
                productosVenta.add(productoVenta);
            }

            VentaDTO venta = new VentaDTO(ventaRegistro.getCodigo(), productosVenta,
                    ventaRegistro.getTotal(), ventaRegistro.getFecha());
            
            return venta;
        }
        throw new PersistenciaException("La venta no se encuentra en el registro.");
    }

    @Override
    public void agregarVenta(VentaDTO ventaNueva) throws PersistenciaException {
        if (registroVentas.obtenerVenta(new Venta(ventaNueva.getCodigo())) != null) {
            
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
            throw new PersistenciaException("La venta ya se encuentra en el registro.");
        }
    }

    @Override
    public void agregarProducto(VentaDTO ventaBuscada, ProductoDTO productoNuevo) throws PersistenciaException {
        try {
            Venta venta = registroVentas.obtenerVenta(new Venta(ventaBuscada.getCodigo()));
            
            Producto producto = new Producto(productoNuevo.getNombre(), productoNuevo.getCosto(), 
                    productoNuevo.getMarca(), productoNuevo.getCodigo(), productoNuevo.getCantidad());

            if (!venta.getProductos().contains(producto)) {
                venta.getProductos().add(producto);
            } else {
                throw new PersistenciaException("El producto ya se encuentra en la venta.");
            }
        } catch (PersistenciaException | NullPointerException e) {
            throw new PersistenciaException(e.getMessage());
        }
    }

    @Override
    public Float calcularCosto(VentaDTO ventaBuscada) throws PersistenciaException {
        try {
            Venta venta = registroVentas.obtenerVenta(new Venta(ventaBuscada.getCodigo()));

            List<Producto> productosVenta = venta.getProductos();
            Float total = 0.0F;
            for (Producto producto : productosVenta) {
                total += producto.getCantidad() * producto.getCosto();
            }
            return total;
        } catch (NullPointerException e) {
            throw new PersistenciaException(e.getMessage());
        }
    }

}

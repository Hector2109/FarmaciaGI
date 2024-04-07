package org.itson.diseñosoftware.farmaciagipersistencia.gestores;

import java.util.List;
import org.itson.diseñosoftware.farmaciagidominio.Cliente;
import org.itson.diseñosoftware.farmaciagidominio.Producto;
import org.itson.diseñosoftware.farmaciagidominio.Promocion;
import org.itson.diseñosoftware.farmaciagidominio.Venta;
import org.itson.diseñosoftware.farmaciagipersistencia.Productos;
import org.itson.diseñosoftware.farmaciagipersistencia.dtos.ClienteDTO;
import org.itson.diseñosoftware.farmaciagipersistencia.dtos.ProductoDTO;
import org.itson.diseñosoftware.farmaciagipersistencia.dtos.PromocionDTO;
import org.itson.diseñosoftware.farmaciagipersistencia.dtos.VentaDTO;
import org.itson.diseñosoftware.farmaciagipersistencia.excepciones.PersistenciaException;

public class GestorVentas implements IGestorVentas {

    private List<Venta> ventas;

    public GestorVentas() {
        this.ventas = ventas;
    }

    @Override
    public Venta obtenerVenta(VentaDTO ventaBuscada) throws PersistenciaException {
        Venta venta = new Venta(ventaBuscada.getCodigo());

        if (ventas.contains(venta)) {
            return ventas.get(ventas.indexOf(venta));
        }
        throw new PersistenciaException("La venta no se encuentra en el registro.");
    }
    
    @Override
    public void agregarVenta(VentaDTO ventaNueva) throws PersistenciaException{
        Venta venta = new Venta(ventaNueva.getCodigo(), ventaNueva.getProductos(), ventaNueva.getCliente(), 
                ventaNueva.getPromociones(), ventaNueva.getTotal(), ventaNueva.getFecha());
        
        if (!ventas.contains(venta)) {
            ventas.add(venta);
        } else {
            throw new PersistenciaException("La venta ya se encuentra en el registro.");
        }
    }

    @Override
    public void agregarProducto(VentaDTO ventaBuscada, ProductoDTO productoNuevo) throws PersistenciaException {
        try {
            Venta venta = obtenerVenta(ventaBuscada);
            Producto producto = new Producto(productoNuevo.getNombre(), productoNuevo.getCosto(), productoNuevo.getMarca(), productoNuevo.getCodigo(), productoNuevo.getCantidad());
            
            if (!venta.getProductos().contains(producto)) {
                venta.getProductos().add(producto);
            } else {
                throw new PersistenciaException("El producto ya se encuentra en la venta.");
            }
        } catch (PersistenciaException e) {
            throw new PersistenciaException(e.getMessage());
        }
    }
     
    @Override
    public void agregarCliente(VentaDTO ventaBuscada, ClienteDTO clienteNuevo) throws PersistenciaException {
        try {
            Venta venta = obtenerVenta(ventaBuscada);
            Cliente cliente = new Cliente(clienteNuevo.getCodigo(), clienteNuevo.getNombre(), clienteNuevo.getApellidoPaterno(), 
                    clienteNuevo.getApellidoMaterno(), clienteNuevo.getFechaRegistro(), clienteNuevo.getPuntos());
            
            if (venta.getCliente() == null) {
                venta.setCliente(cliente);
            } else {
                throw new PersistenciaException("La venta ya tiene cliente.");
            }
        } catch (PersistenciaException e) {
            throw new PersistenciaException(e.getMessage());
        }
    }

    @Override
    public void agregarPromocion(VentaDTO ventaBuscada, PromocionDTO promocionNueva) throws PersistenciaException {
        try {
            Venta venta = obtenerVenta(ventaBuscada);
            Promocion promocion = new Promocion(promocionNueva.getCodigo(), promocionNueva.getDescripcion(), promocionNueva.getDescuento());
            
            if (!venta.getPromociones().contains(promocion)) {
                venta.getPromociones().add(promocion);
            } else {
                throw new PersistenciaException("La venta ya tiene esta promoción.");
            }
        } catch (PersistenciaException e) {
            throw new PersistenciaException(e.getMessage());
        }
    }

    @Override
    public Float calcularCosto(VentaDTO ventaBuscada) throws PersistenciaException{
        try {
            Venta venta = obtenerVenta(ventaBuscada);
            
            List<Producto> productosVenta = venta.getProductos();
            Float total = 0.0F;
            for (Producto producto : productosVenta) {
                total += producto.getCantidad() * producto.getCosto();
            }
            return total;
        } catch (PersistenciaException e) {
            throw new PersistenciaException(e.getMessage());
        }
    }

    @Override
    public Productos agregarProductosAVista(Productos inventario, String filtro) throws PersistenciaException {
        Productos productosBuscados = new Productos();
        productosBuscados.setProductos(inventario.buscarProductosPorNombre(filtro));
            if (productosBuscados.getProductos().isEmpty()) {
                productosBuscados.setProductos(inventario.buscarProductosPorId(filtro));
            }
        return productosBuscados;    
    }
    
}

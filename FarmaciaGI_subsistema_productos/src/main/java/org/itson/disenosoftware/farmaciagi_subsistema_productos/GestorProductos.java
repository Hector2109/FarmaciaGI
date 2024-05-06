package org.itson.disenosoftware.farmaciagi_subsistema_productos;

import org.itson.disenosoftware.farmaciagi_dtos.ProductoDTO;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.itson.disenosoftware.farmaciagi_dtos.ProveedorDTO;
import org.itson.disenosoftware.farmaciagi_subsistema_productos.excepciones.ControlProductosException;
import org.itson.disenosoftware.farmaciagi_subsistema_productos.excepciones.GestorProductosException;

public class GestorProductos implements IGestorProductos {

    private ControlGestorProductos control;

    /**
     * Constructor.
     */
    public GestorProductos() {
        control = new ControlGestorProductos();
    }

    /**
     * {@inheritDoc }
     */
    @Override
    public ProductoDTO obtenerProducto(ProductoDTO productoBuscado) {
        return control.obtenerProducto(productoBuscado);
    }

    /**
     * {@inheritDoc }
     */
    @Override
    public void modCantidadProducto(ProductoDTO productoActualizado) throws GestorProductosException {
        try {
            control.modCantidadProducto(productoActualizado);
        } catch (ControlProductosException ex) {
            throw new GestorProductosException("No se pudo actualizar el producto.");
        }
    }

    /**
     * {@inheritDoc }
     */
    @Override
    public List<ProductoDTO> buscarProductosPorNombre(String nombre) {
        return control.buscarProductosPorNombre(nombre);
    }

    /**
     * {@inheritDoc }
     */
    @Override
    public void asignarProveedorAProducto(ProductoDTO productoDTO, ProveedorDTO proveedorDTO) throws GestorProductosException {
        try {
            control.asignarProveedorAProducto(productoDTO, proveedorDTO);
        } catch (ControlProductosException ex) {
            throw new GestorProductosException(ex.getMessage());
        }
    }

    /**
     * Este método registra un nuevo producto
     * @param productoDTO producto que se desea registrar
     * @return retorna el producto registrado
     * @throws GestorProductosException en caso de no lograr registrar el producto
     */
    @Override
    public ProductoDTO registrarProducto(ProductoDTO productoDTO) throws GestorProductosException {
        try {
            return control.registrarProducto(productoDTO);
        } catch (ControlProductosException ex) {
            throw new GestorProductosException(ex.getMessage());
        }
    }

    /**
     * Método para obtener el inventario de productos
     * @return lista de productos en el inventario
     */
    @Override
    public List<ProductoDTO> obtnerInventario() {
        return control.obtenerInventario();
    }

}

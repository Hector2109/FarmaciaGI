package org.itson.disenosoftware.farmaciagi_subsistema_productos;

import org.itson.disenosoftware.farmaciagi_dtos.ProductoDTO;
import java.util.List;
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

}

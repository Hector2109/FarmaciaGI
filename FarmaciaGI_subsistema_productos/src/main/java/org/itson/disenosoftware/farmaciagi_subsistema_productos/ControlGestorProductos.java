package org.itson.disenosoftware.farmaciagi_subsistema_productos;

import java.util.List;
import org.itson.disenosoftware.farmaciagi_dtos.ProductoDTO;
import org.itson.disenosoftware.farmaciagi_subsistema_productos.excepciones.ControlProductosException;
import org.itson.diseñosoftware.farmaciagi_objetosNegocio.ProductoBO;
import org.itson.diseñosoftware.farmaciagi_objetosNegocio.excepciones.ObjetosNegocioException;

class ControlGestorProductos {

    private ProductoBO producto;
    
    public ControlGestorProductos() {
        producto = new ProductoBO();
    }

    public ProductoDTO obtenerProducto(ProductoDTO productoBuscado) {
        return producto.obtenerProducto(productoBuscado);
    }
    
    public void modCantidadProducto(ProductoDTO productoActualizado) throws ControlProductosException {
        try {
            producto.modCantidadProducto(productoActualizado);
        } catch (ObjetosNegocioException ex) {
            throw new ControlProductosException(ex.getMessage());
        }
    }

    public List<ProductoDTO> buscarProductosPorNombre(String nombre) {
        return producto.buscarProductosPorNombre(nombre);
    }



}

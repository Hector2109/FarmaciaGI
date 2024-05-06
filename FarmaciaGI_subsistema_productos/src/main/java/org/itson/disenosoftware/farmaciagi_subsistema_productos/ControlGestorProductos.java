package org.itson.disenosoftware.farmaciagi_subsistema_productos;

import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.itson.disenosoftware.farmaciagi_dtos.ProductoDTO;
import org.itson.disenosoftware.farmaciagi_dtos.ProveedorDTO;
import org.itson.disenosoftware.farmaciagi_subsistema_productos.excepciones.ControlProductosException;
import org.itson.diseñosoftware.farmaciagi_objetosNegocio.ProductoBO;
import org.itson.diseñosoftware.farmaciagi_objetosNegocio.excepciones.ObjetosNegocioException;

class ControlGestorProductos {

    private ProductoBO producto;

    /**
     * Constructor.
     */
    public ControlGestorProductos() {
        producto = new ProductoBO();
    }

    /**
     * Permite obtener un producto del inventario.
     *
     * @param producto El producto que se busca
     * @return El producto del inventario
     */
    public ProductoDTO obtenerProducto(ProductoDTO productoBuscado) {
        return producto.obtenerProducto(productoBuscado);
    }

    /**
     * Permite modificar la cantidad de un producto en el inventario.
     *
     * @param productoActualizado El producto con la cantidad modificada
     * @throws GestorProductosException Si no se puede modificar la cantidad
     */
    public void modCantidadProducto(ProductoDTO productoActualizado) throws ControlProductosException {
        try {
            producto.modCantidadProducto(productoActualizado);
        } catch (ObjetosNegocioException ex) {
            throw new ControlProductosException(ex.getMessage());
        }
    }

    /**
     * Permite obtener una lista de productos que se consultan según su nombre.
     *
     * @param nombre El nombre por el que se desean consultar los productos
     * @return Una lista de productos que coinciden con el nombre mandado
     */
    public List<ProductoDTO> buscarProductosPorNombre(String nombre) {
        return producto.buscarProductosPorNombre(nombre);
    }
    
    public void asignarProveedorAProducto (ProductoDTO productoDTO, ProveedorDTO proveedorDTO) throws ControlProductosException{
        try {
            producto.asignarProveedor(productoDTO, proveedorDTO);
        } catch (ObjetosNegocioException ex) {
            throw new ControlProductosException(ex.getMessage());
        }
    }
    
    /**
     * Este método registra un nuevo producto
     * @param productoDTO producto que se desea registrar
     * @return retorna el producto registrado
     * @throws GestorProductosException en caso de no lograr registrar el producto
     */
    public ProductoDTO registrarProducto (ProductoDTO productoDTO) throws ControlProductosException{
        try {
            productoDTO = producto.registrarProducto(productoDTO);
            return productoDTO;
        } catch (ObjetosNegocioException ex) {
            throw new ControlProductosException (ex.getMessage());
        }
    }
   

}

package org.itson.disenosoftware.farmaciagi_subsistema_productos;

import java.util.List;
import org.itson.disenosoftware.farmaciagi_dtos.ProductoDTO;
import org.itson.disenosoftware.farmaciagi_subsistema_productos.excepciones.GestorProductosException;

/**
 *
 * @author Mi FrmaciaGI
 */
public interface IGestorProductos {

    /**
     * Permite obtener un producto del inventario.
     *
     * @param producto El producto que se busca
     * @return El producto del inventario
     */
    public ProductoDTO obtenerProducto(ProductoDTO producto);

    /**
     * Permite modificar la cantidad de un producto en el inventario.
     *
     * @param productoActualizado El producto con la cantidad modificada
     * @throws GestorProductosException Si no se puede modificar la cantidad
     */
    public void modCantidadProducto(ProductoDTO productoActualizado) throws GestorProductosException;

    /**
     * Permite obtener una lista de productos que se consultan según su nombre.
     *
     * @param nombre El nombre por el que se desean consultar los productos
     * @return Una lista de productos que coinciden con el nombre mandado
     */
    public List<ProductoDTO> buscarProductosPorNombre(String nombre);

}

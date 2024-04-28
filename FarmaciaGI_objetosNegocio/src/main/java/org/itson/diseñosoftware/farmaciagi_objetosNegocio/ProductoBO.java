package org.itson.diseñosoftware.farmaciagi_objetosNegocio;

import java.util.LinkedList;
import java.util.List;
import org.itson.diseniosofware.mifarmaciagi.persistencia.Conexion.Conexion;
import org.itson.diseniosofware.mifarmaciagi.persistencia.Conexion.IConexion;
import org.itson.diseniosofware.mifarmaciagi.persistencia.Exception.PersistenciaException;
import org.itson.diseniosofware.mifarmaciagi.persistencia.daos.IProductosDAO;
import org.itson.diseniosofware.mifarmaciagi.persistencia.daos.ProductosDAO;
import org.itson.diseniosofware.mifarmaciagi.persistencia.entidades.Producto;
import org.itson.disenosoftware.farmaciagi_dtos.ProductoDTO;
import org.itson.diseñosoftware.farmaciagi_objetosNegocio.excepciones.ObjetosNegocioException;

public class ProductoBO {

    private IProductosDAO productosDAO;

    public ProductoBO() {
        IConexion conexion = new Conexion();
        productosDAO = new ProductosDAO(conexion);
    }

    /**
     * Este método obtiene un producto de tipo DTO del inventario por medio del
     * código único de un producto
     *
     * @param productoBuscado producto que se desea buscar
     * @return producto que se encontró
     */
    public ProductoDTO obtenerProducto(ProductoDTO productoBuscado) {
        Producto productoInventario = new Producto();

        productoInventario.setCodigo(productoBuscado.getCodigo());

        Producto productoEncontrado = productosDAO.obtenerProducto(productoInventario);

        if (productoEncontrado != null) {

            productoBuscado.setCantidad(productoEncontrado.getCantidad());
            productoBuscado.setNombre(productoEncontrado.getNombre());
            productoBuscado.setMarca(productoEncontrado.getMarca());
            productoBuscado.setCosto(productoEncontrado.getCosto());

            return productoBuscado;

        } else {
            return null;
        }

    }

    public void modCantidadProducto (ProductoDTO productoActualizado) throws ObjetosNegocioException {

        Producto producto = new Producto();

        producto.setCodigo(productoActualizado.getCodigo());
        producto.setCantidad(productoActualizado.getCantidad());

        try {
            productosDAO.modCantidadProducto(producto);
        } catch (PersistenciaException ex) {
            throw new ObjetosNegocioException(ex.getMessage());
        }
    }
    
    public List<ProductoDTO> buscarProductosPorNombre(String nombre) {
        
        Producto producto = new Producto();
        producto.setNombre(nombre);
        
        List<Producto> productosSemejantes = productosDAO.buscarProductosPorNombre(producto);
        
        List <ProductoDTO> productosDTO = new LinkedList<>();
        
        for (Producto productoSemejante: productosSemejantes) {
            ProductoDTO productoSemejanteDTO = new ProductoDTO();
            productoSemejanteDTO.setCantidad(productoSemejante.getCantidad());
            productoSemejanteDTO.setCodigo(productoSemejante.getCodigo());
            productoSemejanteDTO.setCosto(productoSemejante.getCosto());
            productoSemejanteDTO.setMarca(productoSemejante.getMarca());
            productoSemejanteDTO.setNombre(productoSemejante.getNombre());
            
            productosDTO.add(productoSemejanteDTO);
        }
        return productosDTO;                
    }
    
    
//    public void modCantidadProducto (ProductoDTO producto){
//        
//        
//        
//    }


}

package org.itson.diseñosoftware.farmaciagi_objetosNegocio;

import java.util.LinkedList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.itson.diseniosofware.mifarmaciagi.persistencia.Conexion.Conexion;
import org.itson.diseniosofware.mifarmaciagi.persistencia.Conexion.IConexion;
import org.itson.diseniosofware.mifarmaciagi.persistencia.Exception.PersistenciaException;
import org.itson.diseniosofware.mifarmaciagi.persistencia.daos.IProductosDAO;
import org.itson.diseniosofware.mifarmaciagi.persistencia.daos.ProductosDAO;
import org.itson.diseniosofware.mifarmaciagi.persistencia.entidades.Producto;
import org.itson.disenosoftware.farmaciagi_dtos.ProductoDTO;
import org.itson.disenosoftware.farmaciagi_simulacionbd.SimuladorInventarioProductos;
import org.itson.disenosoftware.farmaciagi_simulacionbd.objetos.ProductoAux;
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

    public void actualizarProducto(ProductoDTO productoActualizado) throws ObjetosNegocioException {

        Producto producto = new Producto();

        producto.setCodigo(productoActualizado.getCodigo());
        producto.setCosto(productoActualizado.getCosto());
        producto.setMarca(productoActualizado.getMarca());
        producto.setNombre(productoActualizado.getNombre());

        try {
            productosDAO.actualizarProducto(producto);
        } catch (PersistenciaException ex) {
            throw new ObjetosNegocioException(ex.getMessage());
        }
    }
    
//    public List<ProductoDTO> buscarProductosPorNombre(String nombre) {
//        List<ProductoDTO> productosSemejantes = new LinkedList<>();
//        for (ProductoAux producto : inventario.getInventario()) {
//            if (producto.getNombre().toLowerCase().contains(nombre.toLowerCase())) {
//                ProductoDTO productoSemejante = new ProductoDTO(producto.getCodigo(), producto.getNombre(),
//                        producto.getCosto(), producto.getMarca(), producto.getCantidad());
//
//                productosSemejantes.add(productoSemejante);
//            }
//        }
//        return productosSemejantes;
//    }
//    
//    public List<ProductoDTO> buscarProductosPorCodigo(String codigo) {
//        List<ProductoDTO> productosSemejantes = new LinkedList<>();
//        for (ProductoAux producto : inventario.getInventario()) {
//            if (producto.getCodigo().toLowerCase().contains(codigo.toLowerCase())) {
//                ProductoDTO productoSemejante = new ProductoDTO(producto.getCodigo(), producto.getNombre(),
//                        producto.getCosto(), producto.getMarca(), producto.getCantidad());
//
//                productosSemejantes.add(productoSemejante);
//            }
//        }
//        return productosSemejantes;
//    }
//
//    public List<ProductoDTO> obtenerProductos() {
//        List<ProductoDTO> productosInventario = new LinkedList<>();
//        for (ProductoAux producto : inventario.getInventario()) {
//            ProductoDTO productoInventario = new ProductoDTO(producto.getCodigo(), producto.getNombre(),
//                    producto.getCosto(), producto.getMarca(), producto.getCantidad());
//            productosInventario.add(productoInventario);
//        }
//        return productosInventario;
//    }

}

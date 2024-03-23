package org.itson.diseñosoftware.farmaciagipersistencia.gestores;

import java.util.List;
import org.itson.diseñosoftware.farmaciagidominio.Producto;
import org.itson.diseñosoftware.farmaciagipersistencia.dtos.ProductoDTO;
import org.itson.diseñosoftware.farmaciagipersistencia.excepciones.PersistenciaException;

public interface IGestorProductos {

    public Producto obtenerProducto(ProductoDTO producto) throws PersistenciaException;

    public void agregarProducto(ProductoDTO producto) throws PersistenciaException;

    public void eliminarProducto(ProductoDTO producto) throws PersistenciaException;

    public void sumarCantidadProducto(ProductoDTO producto) throws PersistenciaException;

    public void restarCantidadProducto(ProductoDTO producto) throws PersistenciaException;

    public List<Producto> buscarProductosPorNombre(String nombre) throws PersistenciaException;

    public List<Producto> buscarProductoPorCodigo(String codigo) throws PersistenciaException;

    public List<Producto> obtenerProductos() throws PersistenciaException;

}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.itson.diseñosoftware.farmaciagi_objetosNegocio;

import java.time.Instant;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.itson.diseniosofware.mifarmaciagi.persistencia.Conexion.Conexion;
import org.itson.diseniosofware.mifarmaciagi.persistencia.Conexion.IConexion;
import org.itson.diseniosofware.mifarmaciagi.persistencia.Exception.PersistenciaException;
import org.itson.diseniosofware.mifarmaciagi.persistencia.daos.ComprasDAO;
import org.itson.diseniosofware.mifarmaciagi.persistencia.daos.IComprasDAO;
import org.itson.diseniosofware.mifarmaciagi.persistencia.entidades.Compra;
import org.itson.diseniosofware.mifarmaciagi.persistencia.entidades.Direccion;
import org.itson.diseniosofware.mifarmaciagi.persistencia.entidades.Producto;
import org.itson.diseniosofware.mifarmaciagi.persistencia.entidades.Proveedor;
import org.itson.disenosoftware.farmaciagi_dtos.CompraDTO;
import org.itson.disenosoftware.farmaciagi_dtos.ProductoDTO;
import org.itson.disenosoftware.farmaciagi_dtos.ProveedorDTO;
import org.itson.diseñosoftware.farmaciagi_objetosNegocio.excepciones.ObjetosNegocioException;

/**
 *
 * @author Enrique Rodriguez
 */
public class CompraBO {

    private IComprasDAO comprasDAO;

    public CompraBO() {
        IConexion conexion = new Conexion();
        comprasDAO = new ComprasDAO(conexion);
    }

    public void registrarCompra(CompraDTO compraNueva) throws ObjetosNegocioException{
        Compra compra = null;
        String codigo;
        
        do {
            codigo = generarCodigoCompra();
            compra = encontrarCompra(codigo);
        } while (compra != null);

        compra = new Compra();
        compra.setCodigo(codigo);
        compra.setCostoTotal(compraNueva.getCostoTotal());
        long millis = compraNueva.getFecha().getTimeInMillis();
        compra.setFecha(Instant.ofEpochMilli(millis));
        compra.setProveedores(proveedoresDTOAProveedoresPOJO(compraNueva.getProveedores()));
        compra.setProductos(productosDTOAProductosPOJO(compraNueva.getProductos()));

        try {
            comprasDAO.registrarCompra(compra);
        } catch (PersistenciaException ex) {
            try {
                throw new ObjetosNegocioException("No se pudo registrar la compra.");
            } catch (ObjetosNegocioException ex1) {
                Logger.getLogger(CompraBO.class.getName()).log(Level.SEVERE, null, ex1);
            }
        }
    }
    
    public void encontrarProveedores(){
        
    }
    
    /**
     * Permite generar un código para una compra.
     *
     * @return código generado
     */
    private String generarCodigoCompra() {
        Random random = new Random();
        StringBuilder codigo = new StringBuilder();
        for (int i = 0; i < 7; i++) {
            int numeroAleatorio = random.nextInt(10);
            codigo.append(numeroAleatorio);
        }
        return codigo.toString();
    }

    /**
     * Permite convertir una lista de Producto DTO a Producto POJO
     *
     * @param productosDTO La lista de Producto DTO
     * @return La lista de Producto POJO
     */
    private List<Producto> productosDTOAProductosPOJO(List<ProductoDTO> productosDTO) {

        List<Producto> productos = new LinkedList<>();

        for (ProductoDTO productoDTO : productosDTO) {
            Producto producto = new Producto();
            producto.setCantidad(productoDTO.getCantidad());
            producto.setNombre(productoDTO.getNombre());
            producto.setMarca(productoDTO.getMarca());
            producto.setCodigo(productoDTO.getCodigo());
            producto.setCosto(productoDTO.getCosto());
            productos.add(producto);
        }
        return productos;
    }
    
        /**
     * Permite convertir una lista de Proveedores DTO a Proveedores POJO
     *
     * @param proveedoresDTO La lista de Proveedor DTO
     * @return La lista de Proveedor POJO
     */
    private List<Proveedor> proveedoresDTOAProveedoresPOJO(List<ProveedorDTO> proveedoresDTO) {

        List<Proveedor> proveedores = new LinkedList<>();

        for (ProveedorDTO proveedorDTO : proveedoresDTO) {
            Direccion direccion = new Direccion();
            direccion.setCalle(proveedorDTO.getDireccion().getCalle());
            direccion.setCiudad(proveedorDTO.getDireccion().getCiudad());
            direccion.setCodigo_postal(proveedorDTO.getDireccion().getCodigo_postal());
            direccion.setColonia(proveedorDTO.getDireccion().getColonia());
            direccion.setNumero(proveedorDTO.getDireccion().getNumero());
            
            Proveedor proveedor = new Proveedor();
            
            proveedor.setNombre(proveedorDTO.getNombre());
            proveedor.setRfc(proveedorDTO.getRfc());
            proveedor.setTelefonos(proveedorDTO.getTelefonos());
            proveedor.setDireccion(direccion);

        }
        return proveedores;
    }

    /**
     * Método el cual encuentra una venta a partir del código
     *
     * @param codigo código de venta
     * @return venta que se encuentra
     */
    private Compra encontrarCompra(String codigo) {
        Compra compra = comprasDAO.encontrarCompra(codigo);
        return compra;
    }
}

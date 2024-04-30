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
import org.itson.diseniosofware.mifarmaciagi.persistencia.daos.IVentasDAO;
import org.itson.diseniosofware.mifarmaciagi.persistencia.daos.VentasDAO;
import org.itson.diseniosofware.mifarmaciagi.persistencia.entidades.Producto;
import org.itson.diseniosofware.mifarmaciagi.persistencia.entidades.Promocion;
import org.itson.diseniosofware.mifarmaciagi.persistencia.entidades.Venta;
import org.itson.disenosoftware.farmaciagi_dtos.ProductoDTO;
import org.itson.disenosoftware.farmaciagi_dtos.PromocionDTO;
import org.itson.disenosoftware.farmaciagi_dtos.VentaDTO;
import org.itson.diseñosoftware.farmaciagi_objetosNegocio.excepciones.ObjetosNegocioException;

public class VentaBO {

    private IVentasDAO ventasDAO;
    
    
    
//    private SimuladorRegistroVentas registro;
    
    public VentaBO(){
       IConexion conexion = new Conexion();
       ventasDAO = new VentasDAO(conexion);
    }
    
    public void registrarVenta(VentaDTO ventaNueva) throws ObjetosNegocioException {
        Venta venta = null;
        String codigo;
        do{
            
            codigo = generarCodigoVenta();
            venta = encontrarVenta(codigo);
            
        }while (venta!=null);
        

        
        venta = new Venta();
        venta.setCodigo_venta(codigo);
        venta.setCosto_total(ventaNueva.getTotal());
        long millis = ventaNueva.getFecha().getTimeInMillis();
        venta.setFecha_venta(Instant.ofEpochMilli(millis));
        venta.setProductos(productosDTOAProductosPOJO(ventaNueva.getProductos()));
        venta.setPromociones(promocionesDTOAPromocionesPOJO(ventaNueva.getPromociones()));
        
        try {
            ventasDAO.registrarVenta(venta);
        } catch (PersistenciaException ex) {
            Logger.getLogger(VentaBO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    /**
     * Generador de código de venta
     * @return código generado
     */
    private String generarCodigoVenta(){
        Random random = new Random();
        StringBuilder codigo = new StringBuilder();
        for (int i = 0; i < 7; i++) {
            int numeroAleatorio = random.nextInt(10);
            codigo.append(numeroAleatorio);
        }
        return codigo.toString();
    }
    
    /**
     * Método el cual encuentra una venta a partir del código
     * @param codigo código de venta
     * @return venta que se encuentra
     */
    private Venta encontrarVenta(String codigo){
        Venta venta = ventasDAO.encontrarVenta(codigo);
        return venta; 
    }
    
    private List<Producto> productosDTOAProductosPOJO(List<ProductoDTO> productosDTO){
        
        List <Producto> productos = new LinkedList<>();
        
        for (ProductoDTO productoDTO: productosDTO) {
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
    
    private List<Promocion> promocionesDTOAPromocionesPOJO(List<PromocionDTO> promocionesDTO){
        List<Promocion> promociones = new LinkedList<>();
        
        for (PromocionDTO promocionDTO: promocionesDTO) {
            Promocion promocion = new Promocion();
            promocion.setCantidad(promocionDTO.getCantidad());
            promocion.setCodigo(promocionDTO.getCodigo());
            promocion.setDescripcion(promocionDTO.getDescripcion());
            promocion.setPrecioUnitario(promocionDTO.getPrecioUnitario());
            promocion.setProducto(promocion.getProducto());
        }
        return promociones;    
    } 
}

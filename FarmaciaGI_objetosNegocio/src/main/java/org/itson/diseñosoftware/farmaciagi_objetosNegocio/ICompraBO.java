/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package org.itson.diseñosoftware.farmaciagi_objetosNegocio;

import java.util.List;
import org.itson.disenosoftware.farmaciagi_dtos.CompraDTO;
import org.itson.disenosoftware.farmaciagi_dtos.ProductoDTO;
import org.itson.disenosoftware.farmaciagi_dtos.ProveedorDTO;
import org.itson.diseñosoftware.farmaciagi_objetosNegocio.excepciones.ObjetosNegocioException;

/**
 *
 * @author Enrique Rodriguez
 */
public interface ICompraBO {
    
    
    public void registrarCompra(CompraDTO compraNueva) throws ObjetosNegocioException;
    
    public List<ProveedorDTO> encontrarProveedores(ProductoDTO productoDTO) throws ObjetosNegocioException;
}

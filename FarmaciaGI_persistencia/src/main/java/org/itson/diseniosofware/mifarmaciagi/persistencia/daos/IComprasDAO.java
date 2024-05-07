/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package org.itson.diseniosofware.mifarmaciagi.persistencia.daos;

import java.util.List;
import org.itson.diseniosofware.mifarmaciagi.persistencia.Exception.PersistenciaException;
import org.itson.diseniosofware.mifarmaciagi.persistencia.entidades.Compra;
import org.itson.diseniosofware.mifarmaciagi.persistencia.entidades.Producto;
import org.itson.diseniosofware.mifarmaciagi.persistencia.entidades.Proveedor;

/**
 *
 * @author Enrique Rodriguez
 */
public interface IComprasDAO {
    public Compra registrarCompra(Compra compra) throws PersistenciaException;
    public Compra encontrarCompra(String codigo);
    public List<Proveedor>encontrarProveedores(Producto producto) throws PersistenciaException;
}

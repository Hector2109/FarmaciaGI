/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package org.itson.diseniosofware.mifarmaciagi.persistencia.daos;

import org.itson.diseniosofware.mifarmaciagi.persistencia.Exception.PersistenciaException;
import org.itson.diseniosofware.mifarmaciagi.persistencia.entidades.Compra;

/**
 *
 * @author Enrique Rodriguez
 */
public interface IComprasDAO {
    public Compra registrar(Compra compra) throws PersistenciaException;
    public Compra encontrarCompra(String codigo);
}

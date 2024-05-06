/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.itson.diseñosoftware.farmaciagi_objetosNegocio;

import org.itson.diseniosofware.mifarmaciagi.persistencia.Conexion.Conexion;
import org.itson.diseniosofware.mifarmaciagi.persistencia.Conexion.IConexion;
import org.itson.diseniosofware.mifarmaciagi.persistencia.daos.ComprasDAO;
import org.itson.diseniosofware.mifarmaciagi.persistencia.daos.IComprasDAO;

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
    
    
}

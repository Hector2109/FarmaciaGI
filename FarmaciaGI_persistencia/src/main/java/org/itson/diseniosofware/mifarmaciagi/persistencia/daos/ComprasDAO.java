/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.itson.diseniosofware.mifarmaciagi.persistencia.daos;

import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import org.itson.diseniosofware.mifarmaciagi.persistencia.Conexion.IConexion;
import org.itson.diseniosofware.mifarmaciagi.persistencia.Exception.PersistenciaException;
import org.itson.diseniosofware.mifarmaciagi.persistencia.entidades.Compra;

/**
 *
 * @author Enrique Rodriguez
 */
public class ComprasDAO implements IComprasDAO{

    private final MongoCollection<Compra> collection;
    
    /**
     * Constructor que recibe la conexión al mecanismo de persistencia.
     * 
     * @param conexion La conexión al mecanismo de persistencia
     */
    public ComprasDAO(IConexion conexion) {
        MongoDatabase baseDatos = conexion.crearConexion();
        
        collection = baseDatos.getCollection("compras", Compra.class);
    }
    
    /**
     * Método el cual nos permitirá registrar una compra de productos, a una bd
     * 
     * @param compra compra a registrar
     * @return compra registrada
     * @throws PersistenciaException en caso de no poder registrarla
     */
    @Override
    public Compra registrar(Compra compra) throws PersistenciaException{
        //añadir método para validar que no exista la compra
        if (true) {
            collection.insertOne(compra);
            return compra;
        } else {
            throw new PersistenciaException("ERROR: Esta compra ya esta registrada");
        }
        
    }
}

package org.itson.diseniosofware.mifarmaciagi.persistencia.Conexion;

import com.mongodb.client.MongoDatabase;

/**
 *
 * @author Hector Espinoza
 */
public interface IConexion {
    
    public MongoDatabase crearConexion();
    

    
}

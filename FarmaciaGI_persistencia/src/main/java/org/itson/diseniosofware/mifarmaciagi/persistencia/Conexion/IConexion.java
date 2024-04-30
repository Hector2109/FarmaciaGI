package org.itson.diseniosofware.mifarmaciagi.persistencia.Conexion;

import com.mongodb.client.MongoDatabase;

public interface IConexion {

    /**
     * Permite crear una conexión al mecanismo de persistencia
     * donde es posible usar clases pojo
     * @return Una conexión al mecanismo de persistencia
     */
    public MongoDatabase crearConexionPojo();
    
     public MongoDatabase crearConexion();
}

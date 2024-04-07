package org.itson.diseñosoftware.farmaciagipersistencia.gestores;

import org.itson.diseñosoftware.farmaciagidominio.Cliente;
import org.itson.diseñosoftware.farmaciagipersistencia.dtos.ClienteDTO;
import org.itson.diseñosoftware.farmaciagipersistencia.excepciones.PersistenciaException;

public interface IGestorClientes {
    
    public Cliente obtenerCliente(ClienteDTO cliente) throws PersistenciaException;
    
    public void agregarCliente(ClienteDTO cliente) throws PersistenciaException;
}

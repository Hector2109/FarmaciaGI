package org.itson.diseñosoftware.farmaciagipersistencia.daos;

import org.itson.diseñosoftware.farmaciagidominio.Cliente;
import org.itson.diseñosoftware.farmaciagipersistencia.dtos.ClienteDTO;

public interface IClientesDAO {
    
    public Cliente obtenerCliente(ClienteDTO cliente);
    
    public void crearCliente(ClienteDTO cliente);
}

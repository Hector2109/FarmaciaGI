package org.itson.diseñosoftware.farmaciagipersistencia.gestores;

import java.util.List;
import org.itson.diseñosoftware.farmaciagidominio.Cliente;
import org.itson.diseñosoftware.farmaciagipersistencia.dtos.ClienteDTO;
import org.itson.diseñosoftware.farmaciagipersistencia.excepciones.PersistenciaException;

public class GestorClientes implements IGestorClientes {

    private List<Cliente> clientes;

    public GestorClientes(List<Cliente> clientes) {
        this.clientes = clientes;
    }

    @Override
    public Cliente obtenerCliente(ClienteDTO clienteBuscado) throws PersistenciaException {
        Cliente cliente = new Cliente(clienteBuscado.getCodigo(), clienteBuscado.getNombre(), clienteBuscado.getApellidoPaterno(), clienteBuscado.getFechaRegistro());

        if (clientes.contains(cliente)) {
            return clientes.get(clientes.indexOf(cliente));
        }
        throw new PersistenciaException("El cliente no está registrado.");
    }

    @Override
    public void agregarCliente(ClienteDTO clienteNuevo) throws PersistenciaException {
        Cliente cliente = new Cliente(clienteNuevo.getCodigo(), clienteNuevo.getNombre(), clienteNuevo.getApellidoPaterno(),
                clienteNuevo.getApellidoMaterno(), clienteNuevo.getFechaRegistro());
        
        if (!clientes.contains(cliente)) {
            clientes.add(cliente);
        } else {
            throw new PersistenciaException("El cliente ya está registrado.");
        }
    }

}

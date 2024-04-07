package org.itson.diseñosoftware.farmaciagipersistencia.dtos;

import java.util.Calendar;

public class ClienteDTO {
    
    private String codigo;
    private String nombre;
    private String apellidoPaterno;
    private String apellidoMaterno;
    private Integer puntos;
    private Calendar fechaRegistro;

    public ClienteDTO(String codigo, String nombre, String apellidoPaterno, Calendar fechaRegistro) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.apellidoPaterno = apellidoPaterno;
        this.apellidoMaterno = "";
        this.fechaRegistro = fechaRegistro;
        this.puntos = 0;
    }

    public ClienteDTO(String codigo, String nombre, String apellidoPaterno, String apellidoMaterno, Calendar fechaRegistro) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.apellidoPaterno = apellidoPaterno;
        this.apellidoMaterno = apellidoMaterno;
        this.fechaRegistro = fechaRegistro;
        this.puntos = 0;
    }
    
    public ClienteDTO(String codigo, String nombre, String apellidoPaterno, String apellidoMaterno, Calendar fechaRegistro, Integer puntos) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.apellidoPaterno = apellidoPaterno;
        this.apellidoMaterno = apellidoMaterno;
        this.fechaRegistro = fechaRegistro;
        this.puntos = puntos;
    }

    public String getCodigo() {
        return codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellidoPaterno() {
        return apellidoPaterno;
    }

    public String getApellidoMaterno() {
        return apellidoMaterno;
    }

    public Integer getPuntos() {
        return puntos;
    }

    public void setPuntos(Integer puntos) {
        this.puntos = puntos;
    }

    public Calendar getFechaRegistro() {
        return fechaRegistro;
    }
    
    
}

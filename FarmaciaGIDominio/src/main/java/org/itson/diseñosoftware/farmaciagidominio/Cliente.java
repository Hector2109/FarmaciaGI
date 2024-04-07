package org.itson.diseñosoftware.farmaciagidominio;

import java.util.Calendar;
import java.util.Objects;

public class Cliente {
    
    private String codigo;
    private String nombre;
    private String apellidoPaterno;
    private String apellidoMaterno;
    private Integer puntos;
    private Calendar fechaRegistro;

    public Cliente(String codigo) {
        this.codigo = codigo;
        this.nombre = null;
        this.apellidoPaterno = null;
        this.apellidoMaterno = null;
        this.fechaRegistro = null;
        this.puntos = 0;
    }

    public Cliente(String codigo, String nombre, String apellidoPaterno, Calendar fechaRegistro) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.apellidoPaterno = apellidoPaterno;
        this.apellidoMaterno = "";
        this.fechaRegistro = fechaRegistro;
        this.puntos = 0;
    }

    public Cliente(String codigo, String nombre, String apellidoPaterno, String apellidoMaterno, Calendar fechaRegistro) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.apellidoPaterno = apellidoPaterno;
        this.apellidoMaterno = apellidoMaterno;
        this.fechaRegistro = fechaRegistro;
        this.puntos = 0;
    }
    
    public Cliente(String codigo, String nombre, String apellidoPaterno, String apellidoMaterno, Calendar fechaRegistro, Integer puntos) {
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

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidoPaterno() {
        return apellidoPaterno;
    }

    public void setApellidoPaterno(String apellidoPaterno) {
        this.apellidoPaterno = apellidoPaterno;
    }

    public String getApellidoMaterno() {
        return apellidoMaterno;
    }

    public void setApellidoMaterno(String apellidoMaterno) {
        this.apellidoMaterno = apellidoMaterno;
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

    public void setFechaRegistro(Calendar fechaRegistro) {
        this.fechaRegistro = fechaRegistro;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 37 * hash + Objects.hashCode(this.codigo);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Cliente other = (Cliente) obj;
        return Objects.equals(this.codigo, other.codigo);
    }
    
}

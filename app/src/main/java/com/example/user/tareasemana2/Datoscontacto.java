package com.example.user.tareasemana2;

/**
 * Created by user on 08/05/16.
 */
public class Datoscontacto {
    private String NombreContacto;
    private String FechaNacimientoDia;
    private String FechaNacimientoMes;
    private String FechaNacimientoAño;
    private String Telefono;
    private String Email;
    private String Descripcion;

    public Datoscontacto(String nombreContacto, String fechaNacimientoDia, String fechaNacimientoMes, String fechaNacimientoAño, String telefono, String email, String descripcion) {
        NombreContacto = nombreContacto;
        FechaNacimientoDia = fechaNacimientoDia;
        FechaNacimientoMes = fechaNacimientoMes;
        FechaNacimientoAño = fechaNacimientoAño;
        Telefono = telefono;
        Email = email;
        Descripcion = descripcion;
    }

    public String getNombreContacto() {
        return NombreContacto;
    }

    public void setNombreContacto(String nombreContacto) {
        NombreContacto = nombreContacto;
    }

    public String getFechaNacimientoDia() {
        return FechaNacimientoDia;
    }

    public void setFechaNacimientoDia(String fechaNacimientoDia) {
        FechaNacimientoDia = fechaNacimientoDia;
    }

    public String getFechaNacimientoMes() {
        return FechaNacimientoMes;
    }

    public void setFechaNacimientoMes(String fechaNacimientoMes) {
        FechaNacimientoMes = fechaNacimientoMes;
    }

    public String getFechaNacimientoAño() {
        return FechaNacimientoAño;
    }

    public void setFechaNacimientoAño(String fechaNacimientoAño) {
        FechaNacimientoAño = fechaNacimientoAño;
    }

    public String getTelefono() {
        return Telefono;
    }

    public void setTelefono(String telefono) {
        Telefono = telefono;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }

    public String getDescripcion() {
        return Descripcion;
    }

    public void setDescripcion(String descripcion) {
        Descripcion = descripcion;
    }
}

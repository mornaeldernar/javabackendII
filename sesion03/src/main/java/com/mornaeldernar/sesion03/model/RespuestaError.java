package com.mornaeldernar.sesion03.model;

import com.mornaeldernar.sesion03.model.builders.RespuestaErrorBuilder;

import java.time.LocalDateTime;
import java.util.Map;

public class RespuestaError {
    private final LocalDateTime timestamp = LocalDateTime.now();
    private int estatus;
    private Map<String, String> errores;
    private String ruta;

    public static RespuestaErrorBuilder builder() {
        return new RespuestaErrorBuilder();
    }


    public int getEstatus() {
        return estatus;
    }

    public void setEstatus(int estatus) {
        this.estatus = estatus;
    }

    public Map<String, String> getErrores() {
        return errores;
    }

    public void setErrores(Map<String, String> errores) {
        this.errores = errores;
    }

    public String getRuta() {
        return ruta;
    }

    public void setRuta(String ruta) {
        this.ruta = ruta;
    }

    public LocalDateTime getTimestamp() {
        return timestamp;
    }
}

package com.example.sesion04.model;

import jakarta.validation.constraints.*;


import java.time.LocalDate;
import java.util.Date;

public class Producto {
    @PositiveOrZero(message = "El identificador no puede ser un número negativo")
    private Long id;

    @NotEmpty(message = "El nombre del producto no puede estar vacío")
    @Size(min = 5, max = 30, message = "El nombre del producto debe tener al menos 5 letras y ser menor a 30")
    private String nombre;
    @DecimalMin(value = "1.0", message = "Los clientes con menos de 10 empleados no son válidos")
    private float precio;
    String categoria;
    private LocalDate fechaCreacion;
    String numeroRegistro;

    public Long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }
}

package com.mornaeldernar.sesion03.model;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.PositiveOrZero;
import jakarta.validation.constraints.Size;

import java.time.LocalDate;

public class Producto {
    @PositiveOrZero(message = "El identificador no puede ser un número negativo")
    long id;
    @NotEmpty(message = "El nombre del producto no puede estar vacío")
    @Size(min = 5, max = 30, message = "El nombre del producto debe tener al menos 5 letras y ser menor a 30")
    String nombre;
    float precio;
    String categoria;
    String numeroRegistro;
    private LocalDate fechaCreacion;
}

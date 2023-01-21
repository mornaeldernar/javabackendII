package com.mornaeldernar.sesion03.model;

import jakarta.validation.constraints.*;

import java.time.LocalDate;

public class Producto {
    @PositiveOrZero(message = "El id debe ser cero o un entero positivo.")
    long id;
    @NotBlank(message = "El nombre no puede ser un valor nulo o un espacio en blanco.")
    String nombre;
    @DecimalMin(value = "1.00", message = "El precio debe hacer de al menos 1.00.", inclusive = true)
    float precio;
    String categoria;
    @Pattern(regexp = "^(\\d{3}[-]?){2}\\d{4}$",message = "El numeroRegistro debe ser un número con el siguiente formato: ###-###-####")
    String numeroRegistro;
    @PastOrPresent(message = "La fechaCreacion no puede ocurrir después del día de hoy.")
    private LocalDate fechaCreacion;
}

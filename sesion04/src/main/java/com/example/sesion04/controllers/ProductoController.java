package com.example.sesion04.controllers;

import com.example.sesion04.model.Producto;
import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

import java.net.URI;

@RestController
@RequestMapping("/producto")
public class ProductoController {
    @PostMapping()
    public ResponseEntity<Void> createProducto(@Valid @RequestBody Producto producto) {
        return ResponseEntity.created(URI.create("")).build();
    }
}

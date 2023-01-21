package com.example.sesion05.controllers;

import com.example.sesion05.model.Producto;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/productos")
public class ProductoController {
    @GetMapping
    public ResponseEntity<Producto> getProducto() {
        Producto p = new Producto();
        p.setId(0l);
        p.setName("planta");
        p.setPrice(235.5);

        return ResponseEntity.ok(p);
    }
}

package com.mornaeldernar.sesion03.controller;

import com.mornaeldernar.sesion03.model.Producto;
import jakarta.validation.Valid;
import org.apache.coyote.Response;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductoController {
    @PostMapping("/producto")
    public ResponseEntity<Void> creaProducto(@Valid @RequestBody Producto producto) {
        return ResponseEntity.ok().build();
    }
}

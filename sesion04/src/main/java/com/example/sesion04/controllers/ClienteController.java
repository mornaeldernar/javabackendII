package com.example.sesion04.controllers;

import com.example.sesion04.model.Cliente;
import com.example.sesion04.model.Producto;
import jakarta.validation.Valid;
import org.apache.coyote.Response;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

import java.net.URI;

@RestController
@RequestMapping("/cliente")
public class ClienteController {

    @GetMapping("")
    public ResponseEntity<Cliente> getClientes() {
        return null;
    }

    @GetMapping("/{clienteId}")
    public ResponseEntity<Cliente> getCliente(@PathVariable long clienteId){
        if(clienteId > 10){
            // (404 - Not Found) No existe
            throw new ResponseStatusException(HttpStatus.NOT_FOUND,"El cliente con el id especificado no existe");
        }
        if(clienteId > 5) {
            // (403 - Forbidden) Confidencial
            throw new ResponseStatusException(HttpStatus.FORBIDDEN,"No tiene permisos para visualizar el cliente indicado");
        }

        // Regresamos la info (200 - OK)
        Cliente cliente = new Cliente();
        cliente.setId(clienteId);
        cliente.setNombre("Juan");

        return ResponseEntity.ok(cliente);
    }
    @PostMapping()
    public ResponseEntity<Void> creaCliente(@Valid @RequestBody Cliente cliente) {
        return ResponseEntity.created(URI.create("")).build();
    }
}

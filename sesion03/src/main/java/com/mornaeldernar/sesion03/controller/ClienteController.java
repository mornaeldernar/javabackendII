package com.mornaeldernar.sesion03.controller;

import com.mornaeldernar.sesion03.model.Cliente;
import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

import java.net.URI;
import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/cliente")
public class ClienteController {

    @GetMapping("${cliente_id}")
    public ResponseEntity<Cliente> getCliente(@PathVariable long clienteId){
        if(clienteId > 10){
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "El cliente con el id especificado no existe");
        }
    }
    @PostMapping()
    public ResponseEntity<Void> creaCliente(@Valid @RequestBody Cliente cliente){
        System.out.println(cliente.getNombre());
        return ResponseEntity.created(URI.create("1")).build();
    }

}

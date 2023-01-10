package com.mornaeldernar.sesion01.controller;

import com.mornaeldernar.sesion01.model.Direccion;
import com.mornaeldernar.sesion01.model.Usuario;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/usuario")
public class UsuarioController {

    @PostMapping
    public ResponseEntity<Usuario> crearUsuario(@RequestBody Usuario usuario, @RequestParam long id, @RequestParam String rol){
        System.out.println("Creando usuario");
        System.out.println("Nombre : "+ usuario.getNombre());
        System.out.println("Email : "+ usuario.getEmail());
        System.out.println("Usuario : "+ usuario.getUsuario());
        System.out.println("Rol : "+ rol);

        Direccion direccion = new Direccion();
        direccion.setCalle("Cordoba");
        direccion.setNumero("282");
        direccion.setCodigoPostal("01473");
        usuario.setDireccion(direccion);

        return ResponseEntity.ok(usuario);
    }
    @GetMapping("/{id}")
    public Usuario getUsuario(@PathVariable("id") long id){
        return new Usuario();
    }
}

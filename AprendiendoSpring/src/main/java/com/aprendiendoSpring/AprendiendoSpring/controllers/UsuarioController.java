package com.aprendiendoSpring.AprendiendoSpring.controllers;

import com.aprendiendoSpring.AprendiendoSpring.models.Usuario;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UsuarioController {
    @RequestMapping(value = "usuario/{id}")
    public Usuario getUsuario(@PathVariable int id){
        Usuario usuario = new Usuario();
        usuario.setId(id);
        usuario.setNombre("Johan");
        usuario.setApellido("Robles");
        usuario.setEmail("joroblesr@unal.edu.co");
        usuario.setContraseña("3177771654");
        return usuario;
    }

    @RequestMapping(value = "usuario/editar/{id}")
    public Usuario editarUsuario(@PathVariable int id){
        Usuario usuario = new Usuario();
        usuario.setId(id);
        usuario.setNombre("Johan");
        usuario.setApellido("Robles");
        usuario.setEmail("joroblesr@unal.edu.co");
        usuario.setContraseña("3177771654");
        return usuario;
    }

    @RequestMapping(value = "usuario/eliminar/{id}")
    public Usuario eliminarUsuario(@PathVariable int id){
        Usuario usuario = new Usuario();
        usuario.setId(id);
        usuario.setNombre("Johan");
        usuario.setApellido("Robles");
        usuario.setEmail("joroblesr@unal.edu.co");
        usuario.setContraseña("3177771654");
        return usuario;
    }

    @RequestMapping(value = "usuario/crear/")
    public Usuario crearUsuario(@PathVariable int id){
        Usuario usuario = new Usuario();
        usuario.setId(id);
        usuario.setNombre("Johan");
        usuario.setApellido("Robles");
        usuario.setEmail("joroblesr@unal.edu.co");
        usuario.setContraseña("3177771654");
        return usuario;
    }
}

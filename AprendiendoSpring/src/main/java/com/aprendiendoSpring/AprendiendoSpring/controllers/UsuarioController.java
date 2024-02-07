package com.aprendiendoSpring.AprendiendoSpring.controllers;

import com.aprendiendoSpring.AprendiendoSpring.models.Usuario;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
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

    @RequestMapping(value = "usuarios")
    public List<Usuario> getUsuarios(){
        List<Usuario> usuarios = new ArrayList<Usuario>();
        Usuario usuario1 = new Usuario();
        usuario1.setId(1);
        usuario1.setNombre("Maria");
        usuario1.setApellido("Isabel");
        usuario1.setEmail("Maria@unal.edu.co");
        usuario1.setTelefono("3143532234");
        usuario1.setContraseña("12345");

        Usuario usuario2 = new Usuario();
        usuario2.setId(1);
        usuario2.setNombre("Nicolas");
        usuario2.setApellido("Henao");
        usuario2.setEmail("heanon@unal.edu.co");
        usuario2.setTelefono("3173456354");
        usuario2.setContraseña("12345");

        Usuario usuario3 = new Usuario();
        usuario3.setId(1);
        usuario3.setNombre("Miguel");
        usuario3.setApellido("Guitierrez");
        usuario3.setEmail("migue@unal.edu.co");
        usuario3.setTelefono("3534571654");
        usuario3.setContraseña("12345");

        Usuario usuario4 = new Usuario();
        usuario4.setId(1);
        usuario4.setNombre("Alezandra");
        usuario4.setApellido("Gonzales");
        usuario4.setEmail("gonza@unal.edu.co");
        usuario4.setTelefono("3173455454");
        usuario4.setContraseña("12345");

        usuarios.add(usuario1);
        usuarios.add(usuario2);
        usuarios.add(usuario3);
        usuarios.add(usuario4);
        return usuarios;
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

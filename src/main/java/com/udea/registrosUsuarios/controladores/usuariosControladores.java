package com.udea.registrosUsuarios.controladores;

import com.udea.registrosUsuarios.entidad.Usuarios;
import com.udea.registrosUsuarios.servicios.usuariosServicios;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class usuariosControladores {

    @Autowired
    private usuariosServicios usuariosservicios;

    @PostMapping ("/addUsuarios")
    public Usuarios saveUsuarios(@RequestBody Usuarios usuarios){
        return usuariosservicios.saveUsuario(usuarios);
    }

    @GetMapping ("/Usuarios")
    public List<Usuarios> findAllUsuarios(){
        return usuariosservicios.getUsuarios();

    }
@GetMapping("/Usuarios/{id}")
    public Usuarios findByID(@PathVariable Integer id){

        return usuariosservicios.getUsuariosById(id);
    }

    @PostMapping ("/saveUsuarios")

    public List<Usuarios>saveUsuarios(@RequestBody List<Usuarios> usuarios){
        return usuariosservicios.saveUsuarios(usuarios);
    }
    @PutMapping("/updateUsuarios")
    public Usuarios updateUsuarios(@RequestBody Usuarios usuarios){

       return usuariosservicios.updateusuarios(usuarios);

    }

    @DeleteMapping ("/deleteUsuarios/{id}")
    public String deleteUsuarios(@PathVariable Integer id){
        return usuariosservicios.eliminarUsuario(id);



    }



}

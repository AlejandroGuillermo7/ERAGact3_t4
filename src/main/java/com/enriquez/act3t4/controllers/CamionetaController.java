package com.enriquez.act3t4.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.enriquez.act3t4.entities.Camioneta;
import com.enriquez.act3t4.services.CamionetaService;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import java.util.List;


@RestController
@RequestMapping("/api/camionetas")
public class CamionetaController {

    @Autowired
    private CamionetaService camionetaService;

    @GetMapping
    public List<Camioneta> listar(){
       return camionetaService.listarTodas();
    }

    @GetMapping("/{id}")
    public Camioneta buscarId(@PathVariable Long id) {
        return camionetaService.buscarId(id).orElse(null);
    }

    @PostMapping
    public Camioneta crear(@RequestBody Camioneta camioneta) {
        return camionetaService.guardar(camioneta);
    }

    @PutMapping("/{id}")
    public Camioneta actualizar(@PathVariable Long id, @RequestBody Camioneta datosNuevos){
        Camioneta camioneta = camionetaService.buscarId(id).orElse(null);
        if(camioneta != null){
            camioneta.setModelo(datosNuevos.getModelo());
            camioneta.setAnio(datosNuevos.getAnio());
            camioneta.setPrecio(datosNuevos.getPrecio());
            camioneta.setCategoria(datosNuevos.getCategoria());
            camioneta.setMarca(datosNuevos.getMarca());
            return camionetaService.guardar(camioneta);
        }
        return null;
    }

    @DeleteMapping("/{id}")
    public String eliminar(@PathVariable Long id){
        camionetaService.eliminar(id);
        return "Camioneta eliminada.";
    }
}
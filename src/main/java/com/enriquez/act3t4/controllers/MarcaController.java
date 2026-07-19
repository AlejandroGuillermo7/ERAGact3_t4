package com.enriquez.act3t4.controllers;
import com.enriquez.act3t4.entities.Marca;
import com.enriquez.act3t4.services.MarcaServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/marcas")
public class MarcaController {
    @Autowired
    private MarcaServices marcaService;
    @GetMapping
    public List<Marca> listar(){
        return marcaService.listarTodas();

    }

    @PostMapping
    public Marca crear(@RequestBody Marca marca){
        return marcaService.guardar(marca);
    }
    @DeleteMapping("/{id}")
    public String eliminar(@PathVariable Long id) {
        marcaService.eliminar(id);
        return "Marca eliminada correctamente";
    }
}
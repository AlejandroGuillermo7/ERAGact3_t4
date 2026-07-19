package com.enriquez.act3t4.services;

import com.enriquez.act3t4.entities.Marca;
import com.enriquez.act3t4.repositories.MarcaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class MarcaServices {
    
    private final MarcaRepository marcaRepository;

    MarcaServices(MarcaRepository marcaRepository) {
        this.marcaRepository = marcaRepository;
    }

    public List<Marca> listarTodas(){
        return marcaRepository.findAll();
    }

    public Marca guardar(Marca marca){
        return marcaRepository.save(marca);
    }
     public void eliminar(Long id) {
        marcaRepository.deleteById(id);
    }
}

package com.enriquez.act3t4.services;

import com.enriquez.act3t4.entities.Camioneta;
import com.enriquez.act3t4.repositories.CamionetaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CamionetaService {

    @Autowired
    private CamionetaRepository camionetaRepository;

    public List<Camioneta> listarTodas() {
        return camionetaRepository.findAll();
    }

    public Optional<Camioneta> buscarId(Long id) {
        return camionetaRepository.findById(id);
    }

    public Camioneta guardar(Camioneta camioneta) {
        return camionetaRepository.save(camioneta);
    }

    public void eliminar(Long id) {
        camionetaRepository.deleteById(id);
    }
}
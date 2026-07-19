package com.enriquez.act3t4.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.enriquez.act3t4.entities.Camioneta;

public interface CamionetaRepository extends JpaRepository<Camioneta, Long> {
    
}

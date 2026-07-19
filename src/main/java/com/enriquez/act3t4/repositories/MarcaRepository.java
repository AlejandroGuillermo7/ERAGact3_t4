package com.enriquez.act3t4.repositories;

import com.enriquez.act3t4.entities.Marca;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MarcaRepository extends JpaRepository<Marca, Long> {
}
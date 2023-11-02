package com.lazarofonseca.cadastrosocio.repository;

import com.lazarofonseca.cadastrosocio.model.Socio;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SocioRepository extends JpaRepository<Socio, Long> {
}

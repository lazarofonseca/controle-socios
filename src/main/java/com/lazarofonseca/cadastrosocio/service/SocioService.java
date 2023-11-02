package com.lazarofonseca.cadastrosocio.service;

import com.lazarofonseca.cadastrosocio.model.Socio;
import com.lazarofonseca.cadastrosocio.repository.SocioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SocioService {

    @Autowired
    private SocioRepository socioRepository;

    public List<Socio> findAll() {
        return socioRepository.findAll();
    }

    public Socio save(Socio socio) {
        return socioRepository.save(socio);
    }
}

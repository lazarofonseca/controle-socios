package com.lazarofonseca.cadastrosocio.controller;

import com.lazarofonseca.cadastrosocio.model.Socio;
import com.lazarofonseca.cadastrosocio.service.SocioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/socios")
public class SocioController {

    @Autowired
    private SocioService socioService;

    @GetMapping
    public List<Socio> findAll() {
        return socioService.findAll();
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Socio save(@RequestBody Socio socio) {
        return socioService.save(socio);
    }
}

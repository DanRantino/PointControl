package com.dio.pointcontrol.controller;

import com.dio.pointcontrol.Service.JornadaService;
import com.dio.pointcontrol.model.JornadaTrabalho;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.NoSuchElementException;
import java.util.Optional;

@RestController
@RequestMapping("/jornada")
public class JornadaTrabalhoController {

    @Autowired
    JornadaService jornadaService;

    @PostMapping
    public JornadaTrabalho createJornada(@RequestBody JornadaTrabalho jornadaTrabalho){
        return jornadaService.saveJornada(jornadaTrabalho);
    }

    @GetMapping
    public ResponseEntity<List<JornadaTrabalho>> getAll()
    {
        return ResponseEntity.ok(jornadaService.getAll());
    }
    @GetMapping("/{id}")
    public ResponseEntity<JornadaTrabalho> getById(@PathVariable("id") long id) throws Exception {
        System.out.println("Aqui");
        return ResponseEntity.ok(jornadaService.getOne(id).orElseThrow(()-> new NoSuchElementException("Jornada não Encontrada")));
    }
    @DeleteMapping("/{id}")
    public boolean deleteByID(@PathVariable("id") long id){
        return jornadaService.deleteOne(id);
    }

    @PutMapping
    public JornadaTrabalho updateById(@RequestBody JornadaTrabalho jornadaTrabalho) throws Exception{
        return jornadaService.updateJornada(jornadaTrabalho);
    }
}

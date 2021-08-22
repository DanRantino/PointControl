package com.dio.pointcontrol.Service;


import com.dio.pointcontrol.Repository.JornadaRepository;
import com.dio.pointcontrol.model.JornadaTrabalho;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class JornadaService {

    JornadaRepository jornadaRepository;

    @Autowired
    public JornadaService(JornadaRepository jornadaRepository) {
        this.jornadaRepository = jornadaRepository;
    }

    public JornadaTrabalho saveJornada(JornadaTrabalho jornadaTrabalho)
    {
        return jornadaRepository.save(jornadaTrabalho);
    }

    public List<JornadaTrabalho> getAll()
    {
        return jornadaRepository.findAll();
    }

    public Optional<JornadaTrabalho> getOne(Long id) throws Exception {
        if (jornadaRepository.existsById(id))
        {
            return jornadaRepository.findById(id);
        }
        throw new Exception("Jornada não encontrada");
    }

    public boolean deleteOne(Long id){
        if (jornadaRepository.existsById(id))
        {
            jornadaRepository.deleteById(id);
            return true;
        }
        return false;
    }

    public JornadaTrabalho updateJornada(JornadaTrabalho jornadaTrabalho) throws Exception {
        if (jornadaRepository.existsById(jornadaTrabalho.getId())) {
            return jornadaRepository.save(jornadaTrabalho);
        }
        throw  new Exception("Jornada não encontrada");
    }

}

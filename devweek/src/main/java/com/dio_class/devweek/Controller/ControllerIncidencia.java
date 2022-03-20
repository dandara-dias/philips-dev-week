package com.dio_class.devweek.Controller;

import com.dio_class.devweek.Entity.IncidenciaExame;
import com.dio_class.devweek.Repo.IncidenciaRepo;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api")
public class ControllerIncidencia {
    private final IncidenciaRepo inRepository;

    public ControllerIncidencia(IncidenciaRepo inRepository) {
        this.inRepository = inRepository;
    }

    @GetMapping("/incidencia")
    public ResponseEntity<List<IncidenciaExame>> findIncidencia() {
        List<IncidenciaExame> listaIncidencia = inRepository.findAll();
        System.out.println("Achou Incidencia");
        if (listaIncidencia.isEmpty()) {
            System.out.println("Incidencia Vazia");
            return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);
        }
        return new ResponseEntity<>(listaIncidencia, HttpStatus.OK);
    }

    @GetMapping("/incidencia/{id}")
    public ResponseEntity<IncidenciaExame> findIncidenciaById(@PathVariable Long id) {
        Optional<IncidenciaExame> incidenciaOptional = inRepository.findById(id);
        if (incidenciaOptional.isPresent()) {
            IncidenciaExame incidenciaUnid = incidenciaOptional.get();
            return new ResponseEntity<>(incidenciaUnid, HttpStatus.OK);
        }
        return new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }

    @PostMapping ("/incidencia/novo")
    public IncidenciaExame newIncidencia(@RequestBody IncidenciaExame newIncidencia) {
        return inRepository.save(newIncidencia);
    }
}

package com.example.nap01.controller;

import com.example.nap01.model.Disciplina;
import com.example.nap01.repository.DisciplinaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/disciplinas")
public class DisciplinaController {

    @Autowired
    private DisciplinaRepository repository;

    @GetMapping
    public List<Disciplina> listarTodas() {
        return repository.findAll();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Disciplina> buscarPorId(@PathVariable Long id) {
        return repository.findById(id).map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @PostMapping
    public Disciplina criar(@RequestBody Disciplina disciplina) {
        return repository.save(disciplina);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Disciplina> atualizar(@PathVariable Long id, @RequestBody Disciplina novaDisciplina) {
        return repository.findById(id)
                .map(d -> {
                    d.setNome(novaDisciplina.getNome());
                    d.setProfessor(novaDisciplina.getProfessor());
                    d.setIndice(novaDisciplina.getIndice());
                    d.setCodigo(novaDisciplina.getCodigo());
                    return ResponseEntity.ok(repository.save(d));
                })
                .orElse(ResponseEntity.notFound().build());
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Object> deletar(@PathVariable Long id) {
        return repository.findById(id)
                .map(d -> {
                    repository.deleteById(id);
                    return ResponseEntity.noContent().build();
                })
                .orElse(ResponseEntity.notFound().build());
    }
}

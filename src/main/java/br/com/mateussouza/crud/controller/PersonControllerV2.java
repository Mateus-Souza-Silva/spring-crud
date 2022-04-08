package br.com.mateussouza.crud.controller;

import br.com.mateussouza.crud.model.PersonModelV2;
import br.com.mateussouza.crud.service.PersonServiceV2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/person/v2")
public class PersonControllerV2 {

    @Autowired
    private PersonServiceV2 service;

    @GetMapping("/{id}")
    public PersonModelV2 findById(@PathVariable("id") long id) throws Exception{
        return service.findById(id);
    }

//    Listar o metodo
    @GetMapping
    public List<PersonModelV2> findAll(){
        return service.findAll();
    }


//    salvar
    @PostMapping
    public PersonModelV2 save(@RequestBody PersonModelV2 personModel){
        return service.save(personModel);
    }

//    update
    @PutMapping
    public PersonModelV2 update(@RequestBody PersonModelV2 personModel) throws Exception{
        return service.update(personModel);
    }


    @DeleteMapping("/{id}")
    public ResponseEntity<?> delete( @PathVariable("id") long id) throws Exception {
        service.delete(id);
        return ResponseEntity.ok().build();
    }
}

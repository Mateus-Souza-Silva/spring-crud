package br.com.mateussouza.crud.controller;

import br.com.mateussouza.crud.model.VehicleModel;
import br.com.mateussouza.crud.service.VehicleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/vehicle")
public class VehicleController {

    @Autowired
    private VehicleService service;

    @GetMapping("/{id}")
    public VehicleModel findById(@PathVariable("id") long id) throws Exception{
        return service.findById(id);
    }
//    listar o metodo
    @GetMapping
    public List<VehicleModel> findAll() { return service.findAll();}

//    salvar
    @PostMapping
    public VehicleModel save(@RequestBody VehicleModel vehicleModel){ return service.save(vehicleModel);}

//    update
    @PutMapping
    public VehicleModel update(@RequestBody VehicleModel vehicleModel) throws Exception{
        return service.update(vehicleModel);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> delete( @PathVariable("id") long id) throws Exception{
        service.delete(id);
        return ResponseEntity.ok().build();
    }
}

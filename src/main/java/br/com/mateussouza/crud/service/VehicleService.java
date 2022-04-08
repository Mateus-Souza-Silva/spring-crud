package br.com.mateussouza.crud.service;

import br.com.mateussouza.crud.model.VehicleModel;
import br.com.mateussouza.crud.repository.VehicleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class VehicleService {

    @Autowired
    private VehicleRepository repository;

    public VehicleModel findById(long id) throws Exception{
        return repository.findById(id).orElseThrow(() -> new Exception("Não Encontrado!"));
    }

    public List<VehicleModel> findAll() { return repository.findAll();}

    public VehicleModel save(VehicleModel vehicle){ return repository.save(vehicle);}

    public VehicleModel update(VehicleModel vehicle) throws Exception{
        VehicleModel v = findById(vehicle.getId());
        v.setVehicleBrand(vehicle.getVehicleBrand());
        v.setVehicleModel(vehicle.getVehicleModel());
        return repository.save(v);
    }

    public void delete(long id) throws Exception{
        VehicleModel v = findById(id);
        repository.delete(v);
    }
}

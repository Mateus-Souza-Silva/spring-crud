package br.com.mateussouza.crud.repository;

import br.com.mateussouza.crud.model.VehicleModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VehicleRepository extends JpaRepository<VehicleModel, Long> {
}

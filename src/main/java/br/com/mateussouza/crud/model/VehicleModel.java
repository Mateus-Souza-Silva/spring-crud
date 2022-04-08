package br.com.mateussouza.crud.model;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "vehicle")
public class VehicleModel implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "vehicle_model", nullable = false, length = 40)
    private String vehicleModel;

    @Column(name = "vehicle_brand", nullable = false, length = 40)
    private String vehicleBrand;

    public VehicleModel() {
    }

    public VehicleModel(long id, String vehicleModel, String vehicleBrand) {
        this.id = id;
        this.vehicleModel = vehicleModel;
        this.vehicleBrand = vehicleBrand;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getVehicleModel() {
        return vehicleModel;
    }

    public void setVehicleModel(String vehicleModel) {
        this.vehicleModel = vehicleModel;
    }

    public String getVehicleBrand() {
        return vehicleBrand;
    }

    public void setVehicleBrand(String vehicleBrand) {
        this.vehicleBrand = vehicleBrand;
    }
}

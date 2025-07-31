package org.example.dtos;

import lombok.Data;
import org.example.Model.Road;

@Data
public class CommandActionAddVehicleDto implements CommandActionDto {
    private String startRoad;
    private String endRoad;
    private String vehicleId;
}

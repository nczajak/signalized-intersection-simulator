package org.example.dtos;

import lombok.Data;

@Data
public class CommandActionAddVehicleDto implements CommandActionDto {
    private String startRoad;
    private String endRoad;
    private String vehicleId;
    private String type;
}

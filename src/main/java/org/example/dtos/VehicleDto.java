package org.example.dtos;

import lombok.Data;

@Data
public class VehicleDto {
    private String VehicleId;
    private int waitingTime;
    private String encRoad;
}

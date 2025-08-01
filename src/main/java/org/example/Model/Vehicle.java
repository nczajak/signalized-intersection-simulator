package org.example.Model;
import org.example.Enum.MoveDirection;
import org.example.Enum.RoadDirection;
import org.example.dtos.VehicleDto;

public class Vehicle {
    private final String vehicleId;
    private final RoadDirection startRoadDirection;
    private final RoadDirection endRoadDirection;
    private final MoveDirection direction;
    private int waitingTime = 0;

    public Vehicle(String vehicleId, RoadDirection startRoadDirection, RoadDirection endRoadDirection){
        this.vehicleId = vehicleId;
        this.startRoadDirection = startRoadDirection;
        this.endRoadDirection = endRoadDirection;
        this.direction = MoveDirection.parse(this.startRoadDirection,this.endRoadDirection);
    }

    public int getWaitingTime(){
        return this.waitingTime;
    }

    public void increaseWaitingTime(){
        this.waitingTime ++;
    }

    public MoveDirection getDirection(){
        return this.direction;
    }

    public RoadDirection getStartRoadDirection(){
        return this.startRoadDirection;
    }

    public VehicleDto toDto(){
        VehicleDto vehicleDto = new VehicleDto();
        vehicleDto.setVehicleId(this.vehicleId);
        vehicleDto.setWaitingTime(this.waitingTime);
        vehicleDto.setEncRoad(this.endRoadDirection.name());

        return vehicleDto;
    }

    @Override
    public String toString(){
        return this.vehicleId;
    }
}

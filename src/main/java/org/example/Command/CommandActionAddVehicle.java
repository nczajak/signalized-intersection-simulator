package org.example.Command;

import org.example.Enum.RoadDirection;
import org.example.Model.CrossRoad;
import org.example.Model.Vehicle;
import org.example.dtos.CommandActionAddVehicleDto;

public class CommandActionAddVehicle implements CommandAction {
    private final Command command;

    public CommandActionAddVehicle(Command command){
        this.command = command;
    }


    @Override
    public void applyAction(CrossRoad crossRoad) {
        Vehicle vehicle = createVehicle(command);
        crossRoad.putVehicleOnValidRoad(vehicle);

    }


    private Vehicle createVehicle(Command command){
        RoadDirection startRoadDirection = RoadDirection.parse(command.startRoad);
        RoadDirection endRoadDirection = RoadDirection.parse(command.endRoad);
        String vehicleId = command.vehicleId;
        return new Vehicle(vehicleId,startRoadDirection,endRoadDirection);
    }

    public CommandActionAddVehicleDto toDto(){
        CommandActionAddVehicleDto commandActionAddVehicleDto = new CommandActionAddVehicleDto();
        commandActionAddVehicleDto.setStartRoad(this.command.startRoad);
        commandActionAddVehicleDto.setEndRoad(this.command.startRoad);
        commandActionAddVehicleDto.setVehicleId(this.command.vehicleId);
        commandActionAddVehicleDto.setType(this.command.type);
        return commandActionAddVehicleDto;
    }

}

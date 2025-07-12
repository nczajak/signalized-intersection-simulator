package Command;

import Enum.RoadDirection;
import Model.CrossRoad;
import Model.Vehicle;

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
}

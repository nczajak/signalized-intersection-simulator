package Command;

import Model.Vehicle;

public class CommandActionAddVehicle implements CommandAction {
    private final Command command;

    public CommandActionAddVehicle(Command command){
        this.command = command;
    }

    @Override
    public void applyAction() {
        Vehicle vehicle = new Vehicle(command.vehicleId, command.startRoad, command.endRoad);

    }
}

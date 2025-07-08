package Model;

public class CommandActionAddVehicle implements CommandAction {

    public CommandActionAddVehicle(Command command){
        Vehicle vehicle = new Vehicle(command.vehicleId, command.startRoad, command.endRoad);
    }

    @Override
    public void action() {

    }
}

package Model;
import Enum.RoadDirection;

public class Road {
    private final RoadDirection direction;
    private VehicleQueue vehicles;

    public Road(RoadDirection direction){
        this.vehicles = new VehicleQueue();
        this.direction = direction;
    }

    public int getVehiclesAmount(){
        return this.vehicles.getSize();
    }

    public void addVehicle(Vehicle vehicle){
    }
}

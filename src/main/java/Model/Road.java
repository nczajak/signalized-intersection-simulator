package Model;
import Enum.RoadDirection;

public class Road {
    private final RoadDirection direction;
    private RoadQueue vehicles;

    public Road(RoadDirection direction){
        this.vehicles = new RoadQueue();
        this.direction = direction;
    }

    public int getVehiclesAmount(){
        return this.vehicles.getSize();
    }

    public void addVehicle(Vehicle vehicle){

    }
}

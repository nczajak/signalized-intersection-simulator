package Model;
import Enum.RoadDirection;
import java.util.ArrayList;
import java.util.List;

public class Road {
    private final RoadDirection direction;
    private List<Vehicle> vehicles;

    public Road(RoadDirection direction){
        this.vehicles = new ArrayList<>();
        this.direction = direction;
    }

    public int getVehiclesAmount(){
        return this.vehicles.size();
    }

    public void addVehicle(Vehicle vehicle){
        this.vehicles.add(vehicle);
    }

    public void moveVehicle(){
        this.vehicles.removeFirst();
    }

    @Override
    public String toString(){
        return this.direction.toString();
    }

}

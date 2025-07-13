package Model;
import Enum.RoadDirection;
import java.util.ArrayList;
import java.util.List;
import Exception.EmptyRoadException;

public class Road {
    public final RoadDirection direction;
    private final List<Vehicle> vehicles = new ArrayList<>();
    private final TrafficLight trafficLight = new TrafficLight();

    public Road(RoadDirection direction){
        this.direction = direction;
    }

    public int getVehiclesAmount(){
        return this.vehicles.size();
    }

    public void addVehicle(Vehicle vehicle){
        this.vehicles.add(vehicle);
    }

    public void moveVehicle() throws EmptyRoadException {
        try {
            this.vehicles.removeFirst();
        }
        catch (Exception e){
            throw new EmptyRoadException("Try get vehicle from empty road");
        }
    }

    @Override
    public String toString(){
        return this.direction.toString();
    }

}

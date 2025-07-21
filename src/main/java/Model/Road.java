package Model;
import Enum.MoveDirection;
import Enum.RoadDirection;
import Enum.Colour;
import java.util.ArrayList;
import java.util.List;
import Exception.EmptyRoadException;

public class Road {
    private final RoadDirection direction;
    private final List<Vehicle> vehicles = new ArrayList<>();
    private final TrafficLight trafficLight = new TrafficLight();

    public Road(RoadDirection direction){
        this.direction = direction;
    }

    public MoveDirection getFirstVehicleDirection(){
        System.out.println(direction+" "+getVehiclesAmount());
        return this.vehicles.getFirst().getDirection();
    }

    public RoadDirection getDirection(){
        return this.direction;
    }

    public boolean isGreenLight(){
        return trafficLight.getColour() == Colour.GREEN;
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

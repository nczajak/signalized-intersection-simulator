package org.example.Model;
import org.example.Enum.MoveDirection;
import org.example.Enum.RoadDirection;
import org.example.Enum.Colour;
import java.util.ArrayList;
import java.util.List;
import org.example.Exception.EmptyRoadException;


public class Road {
    private final RoadDirection direction;
    private final List<Vehicle> vehicles = new ArrayList<>();
    private final TrafficLight trafficLight = new TrafficLight();

    public Road(RoadDirection direction){
        this.direction = direction;
    }

    public RoadDirection getDirection(){
        return this.direction;
    }

    public int getVehiclesAmount(){
        return this.vehicles.size();
    }

    public void updateVehiclesWaitingTime(){
        for(Vehicle vehicle: this.vehicles){
            vehicle.increaseWaitingTime();
        }
    }


    public MoveDirection getFirstVehicleDirection(){
        return this.vehicles.getFirst().getDirection();
    }

    public int getPriority(){
        try {
            return this.getVehiclesAmount()*this.vehicles.getFirst().getWaitingTime();
        }
        catch (Exception e){
            return 0;
        }
    }

    public void setTrafficLight(Colour colour){
        this.trafficLight.setColour(colour);
    }


    public boolean isGreenLight(){
        return trafficLight.getColour() == Colour.GREEN;
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

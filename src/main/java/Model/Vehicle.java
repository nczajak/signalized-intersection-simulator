package Model;
import Enum.MoveDirection;
import Enum.RoadDirection;

public class Vehicle {
    public final String vehicleId;
    private final RoadDirection startRoadDirection;
    private final RoadDirection endRoadDirection;
    private final MoveDirection direction;

    public Vehicle(String vehicleId, RoadDirection startRoadDirection, RoadDirection endRoadDirection){
        this.vehicleId = vehicleId;
        this.startRoadDirection = startRoadDirection;
        this.endRoadDirection = endRoadDirection;
        this.direction = MoveDirection.parse(this.startRoadDirection,this.endRoadDirection);
    }

    public MoveDirection getDirection(){
        return this.direction;
    }

    public RoadDirection getStartRoadDirection(){
        return this.startRoadDirection;
    }

    @Override
    public String toString(){
        return this.vehicleId;
    }
}

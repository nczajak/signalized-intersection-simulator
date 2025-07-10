package Model;
import Enum.MoveDirection;
import Enum.RoadDirection;

public class Vehicle {
    private final String vehicleId;
    private final RoadDirection startRoadDirection;
    private final RoadDirection endRoadDirection;
    private final MoveDirection direction;

    public Vehicle(String vehicleId, RoadDirection startRoadDirection, RoadDirection endRoadDirection){
        this.vehicleId = vehicleId;
        this.startRoadDirection = startRoadDirection;
        this.endRoadDirection = endRoadDirection;
        this.direction = MoveDirection.parse(this.startRoadDirection,this.endRoadDirection);
    }

    public RoadDirection getStartRoadDirection(){
        return this.startRoadDirection;
    }
}

package Model;
import Enum.MoveDirection;
import Enum.RoadDirection;

public class Vehicle {
    private final String vehicleId;
    private final RoadDirection startRoad;
    private final RoadDirection endRoad;
    private final MoveDirection direction;

    public Vehicle(String vehicleId, String startRoad, String endRoad){
        this.vehicleId = vehicleId;
        this.startRoad = RoadDirection.parse(startRoad);
        this.endRoad = RoadDirection.parse(endRoad);
        this.direction = MoveDirection.parse(this.startRoad,this.endRoad);
    }
}

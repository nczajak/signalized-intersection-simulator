package Model;
import Enum.MoveDirection;
import Enum.RoadDirection;

public class Vehicle {
    public final String vehicleId;
    private final RoadDirection startRoadDirection;
    private final RoadDirection endRoadDirection;
    private final MoveDirection direction;
    private int waitingTime = 0;

    public Vehicle(String vehicleId, RoadDirection startRoadDirection, RoadDirection endRoadDirection){
        this.vehicleId = vehicleId;
        this.startRoadDirection = startRoadDirection;
        this.endRoadDirection = endRoadDirection;
        this.direction = MoveDirection.parse(this.startRoadDirection,this.endRoadDirection);
    }

    public int getWaitingTime(){
        return this.waitingTime;
    }

    public void increaseWaitingTime(){
        this.waitingTime ++;
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

package Model;
import Enum.LaneDirection;

public abstract class Lane {
    private final TrafficLaneQueue trafficLaneQueue;

    public Lane(){
        this.trafficLaneQueue = new TrafficLaneQueue();
    }
}

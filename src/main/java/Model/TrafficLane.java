package Model;
import Enum.LaneDirection;

public class TrafficLane {
    private final TrafficLaneQueue trafficLaneQueue;

    public TrafficLane(LaneDirection direction){
        this.trafficLaneQueue = new TrafficLaneQueue();
    }
}

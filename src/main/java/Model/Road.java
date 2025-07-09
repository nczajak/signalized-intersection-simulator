package Model;

public abstract class Road {
    private final TrafficLaneQueue trafficLaneQueue;

    public Road(){
        this.trafficLaneQueue = new TrafficLaneQueue();
    }
}

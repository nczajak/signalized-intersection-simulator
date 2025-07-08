package Model;
import java.util.ArrayList;
import java.util.List;
import Enum.LaneDirection;

public class CrossRoad {
    List<TrafficLane> trafficLaneList = new ArrayList<>();

    public CrossRoad(){
        this.trafficLaneList = createLanes();
    }

    private List<TrafficLane> createLanes(){
        List<TrafficLane> trafficLaneList = new ArrayList<>();
        for(LaneDirection direction: LaneDirection.values()){
            TrafficLane trafficLane = new TrafficLane(direction);
            trafficLaneList.add(trafficLane);
        }
        return trafficLaneList;
    }
}

package Model;
import java.util.ArrayList;
import java.util.List;
import Enum.RoadDirection;

public class CrossRoad {
    List<Road> trafficLaneList = new ArrayList<>();

    public CrossRoad(){
        this.trafficLaneList = createRoads();
    }

    private List<Road> createRoads(){
        List<Road> trafficLaneList = new ArrayList<>();
        for(RoadDirection direction: RoadDirection.values()){
           Road road = switch (direction){
               case NORTH -> new NorthRoad();
               case EAST -> new EastRoad();
               case SOUTH -> new SouthRoad();
               case WEST -> new WestRoad();
           };
            trafficLaneList.add(road);
        }
        return trafficLaneList;
    }
}

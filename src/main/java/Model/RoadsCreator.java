package Model;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import Enum.RoadDirection;

public class RoadsCreator {
    private final Map<RoadDirection,Road> roads = new HashMap<>();

    public RoadsCreator(){
        createRoads();
    }

    private void createRoads(){
        for(RoadDirection direction: RoadDirection.values()){
            Road road = new Road(direction);
            roads.put(direction,road);
        }
    }

    public List<Road> getRoads(){
        return new ArrayList<>(this.roads.values());
    }
}

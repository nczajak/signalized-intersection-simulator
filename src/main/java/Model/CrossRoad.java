package Model;
import java.util.HashMap;
import java.util.Map;
import java.util.List;
import java.util.Comparator;
import Enum.RoadDirection;

public class CrossRoad {
    private final Map<RoadDirection,Road> roads = new HashMap<>();

    public CrossRoad(){
        createRoads();
    }

    private void createRoads(){
        for(RoadDirection direction: RoadDirection.values()){
           Road road = new Road(direction);
           roads.put(direction,road);
        }
    }

    public void putVehicleOnValidRoad(Vehicle vehicle){
        Road road = getRoadByDirection(vehicle.getStartRoadDirection());
        road.addVehicle(vehicle);
    }

    public Road getRoadByDirection(RoadDirection direction){
       return this.roads.get(direction);
    }

    public Road getTopPriorityRoad(){
        return getRoadWithLongestQueue();
    }

    private Road getRoadWithLongestQueue(){
    }

//    dodac sortowanie po czasie oczekiwania i rzucanie wyjatku w getRoadWithLongestQueue;
}

package Model;
import java.util.HashMap;
import java.util.Map;
import Enum.RoadDirection;
import java.util.List;
import java.util.ArrayList;



public class CrossRoad {
    private final Map<RoadDirection,Road> roads = new HashMap<>();
    private final RoadQueue roadQueue;
    private final MoveValidator moveValidator = new MoveValidator();

    public CrossRoad(){
        createRoads();
        this.roadQueue = new RoadQueue(getRoads());
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

    private Road getRoadByDirection(RoadDirection direction){
       return this.roads.get(direction);
    }

    private List<Road> getRoads(){
        return new ArrayList<>(this.roads.values());
    }

    public Road getTopPriorityRoad(){
        return this.roadQueue.getRoadWithLongestQueue();
    }

    public void report(){
        for (Road road: roads.values()){
            System.out.println(road.direction+" : " +road.getVehiclesAmount());
        }
        System.out.println("------------------");
    }
}

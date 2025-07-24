package Model;
import java.util.HashMap;
import java.util.Map;

import Enum.Colour;
import Enum.RoadDirection;
import java.util.List;
import java.util.ArrayList;


public class CrossRoad {
    private final Map<RoadDirection,Road> roads = new HashMap<>();
    private final RoadQueue roadQueue;

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
    private List<Road> getRoads(){
        return new ArrayList<>(this.roads.values());
    }

    public List<Road> getRoadsSortedByPriority(){
        return roadQueue.getSortedRoads();
    }

    public void putVehicleOnValidRoad(Vehicle vehicle){
        Road road = getRoadByDirection(vehicle.getStartRoadDirection());
        road.addVehicle(vehicle);
    }

    public void moveVehicles(){
        for (Road road: this.roads.values()){
            if(road.isGreenLight()){
                road.moveVehicle();
            }
        }
    }

    public void report(){
        for (Road road: roads.values()){
            System.out.println(road.getDirection()+" : " +road.getVehiclesAmount());
        }
        System.out.println("------------------");
    }


    private Road getRoadByDirection(RoadDirection direction){
        return this.roads.get(direction);
    }

}

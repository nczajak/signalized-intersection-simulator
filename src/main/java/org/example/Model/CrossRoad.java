package org.example.Model;
import java.util.HashMap;
import java.util.Map;

import org.example.Enum.Colour;
import org.example.Enum.MoveDirection;
import org.example.Enum.RoadDirection;
import org.example.dtos.VehicleDto;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.ArrayList;

@Service
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
        RoadDirection direction = vehicle.getStartRoadDirection();
        Road road = getRoadByDirection(direction);
        road.addVehicle(vehicle);
    }

    private Road getRoadByDirection(RoadDirection direction){
        return this.roads.get(direction);
    }

    public void moveVehicles(){
        for (Road road: this.roads.values()){
            if(road.isGreenLight()){
                road.moveVehicle();
            }
        }
    }


    public List<VehicleDto> getVehiclesDtoFromRoad(RoadDirection direction){
        Road road = getRoadByDirection(direction);
        return road.getVehiclesDto();
    }

    public List<MoveDirection> getCurrentMoves(){
        List<MoveDirection> moves = new ArrayList<>();
        for(Road road: getRoads()){
            if(road.getVehiclesAmount()>0 && road.isGreenLight()){
                moves.add(road.getFirstVehicleDirection());
            }
        }
        return moves;
    }

    public Map<Road, Integer> getVehiclesAmountOnRoads(){
        Map<Road,Integer> statusMap = new HashMap<>();
        for(Road road: getRoads()){
            statusMap.put(road,road.getVehiclesAmount());
        }
        return statusMap;
    }

    public Map<String, String> getLightColours(){
        Map<String,String> colourStatus = new HashMap<>();
        for(Road road: roads.values()){
            colourStatus.put(road.getDirection().name(),road.getTrafficLightColour().name());
        }
        return colourStatus;
    }

    public void report(){
        for (Road road: roads.values()){
            System.out.println(road.getDirection()+" : " +road.getVehiclesAmount());
        }
        System.out.println("------------------");
    }
}

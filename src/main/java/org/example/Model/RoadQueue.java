package org.example.Model;
import java.util.Comparator;
import java.util.List;

public class RoadQueue {
    private final List<Road> roads;

    public RoadQueue(List<Road> roads){
        this.roads = roads;
    }

    private void sort(){
        for(Road road: roads){
            road.updateVehiclesWaitingTime();
        }
        this.roads.sort(Comparator.comparingInt(Road::getPriority).reversed());
    }

    public List<Road> getSortedRoads(){
        this.sort();
        return roads;
    }


}

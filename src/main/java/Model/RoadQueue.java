package Model;
import java.util.Comparator;
import java.util.List;

public class RoadQueue {
    List<Road> roads;

    public RoadQueue(List<Road> roads){
        this.roads = roads;
    }

    private void sort(){
        this.roads.sort(Comparator.comparingInt(Road::getVehiclesAmount).reversed());
    }

    public Road getTopPriorityRoad(){
        return this.roads.getFirst();
    }
}

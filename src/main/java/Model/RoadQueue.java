package Model;
import java.util.Comparator;
import java.util.List;

public class RoadQueue {
    private final List<Road> roads;

    public RoadQueue(List<Road> roads){
        this.roads = roads;
    }

    private void sort(){
        this.roads.sort(Comparator.comparingInt(Road::getVehiclesAmount).reversed());
    }

    public List<Road> getSortedRoads(){
        this.sort();
        return roads;
    }
//
//    public Road getRoadWithLongestQueue(){
//        this.sort();
//        return this.roads.getFirst();
//    }

}

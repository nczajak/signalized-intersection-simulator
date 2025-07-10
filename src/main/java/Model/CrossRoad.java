package Model;
import java.util.ArrayList;
import java.util.List;
import java.util.Comparator;
import Enum.RoadDirection;

public class CrossRoad {
    private List<Road> roads = new ArrayList<>();

    public CrossRoad(){
        this.roads = createRoads();
    }

    private List<Road> createRoads(){
        for(RoadDirection direction: RoadDirection.values()){
           Road road = new Road(direction);
           this.roads.add(road);
        }
        return this.roads;
    }

    public Road getTopPriorityRoad(){
        return getRoadWithLongestQueue();
    }

    private Road getRoadWithLongestQueue(){
        this.roads.sort(Comparator.comparingInt(Road::getVehiclesAmount).reversed());
        return roads.getFirst();
    }

    public void putVehicleOnValidRoad(Vehicle vehicle){
    }
//    dodac sortowanie po czasie oczekiwania i rzucanie wyjatku w getRoadWithLongestQueue;
}

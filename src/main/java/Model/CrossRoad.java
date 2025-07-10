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
           Road road = switch (direction){
               case NORTH -> new NorthRoad();
               case EAST -> new EastRoad();
               case SOUTH -> new SouthRoad();
               case WEST -> new WestRoad();
           };
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

//    dodac sortowanie po czasie oczekiwania
}

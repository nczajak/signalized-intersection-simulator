package Model;

import Enum.Colour;
import Enum.MoveDirection;
import java.util.ArrayList;
import java.util.List;

public class MoveValidator {
    private final CollisionMap map = new CollisionMap();
    private final List<MoveDirection> validDirections = new ArrayList<>();

    public void setLights(CrossRoad crossRoad){
        for(Road road: crossRoad.getRoadsSortedByPriority()){
            if((road.getVehiclesAmount()>0) && isValidDirection(road.getFirstVehicleDirection())){
                road.setTrafficLight(Colour.GREEN);
            }
            else road.setTrafficLight(Colour.RED);
        }
    }

    private boolean isValidDirection(MoveDirection newDirection){
        if(!map.collidesWith(validDirections,newDirection)){
            validDirections.add(newDirection);
            return true;
        }
        return false;
    }
}


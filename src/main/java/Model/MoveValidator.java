package Model;

import Enum.MoveDirection;

import java.util.ArrayList;
import java.util.List;

public class MoveValidator {
    private final CollisionMap map = new CollisionMap();
    private final List<Road> validRoads = new ArrayList<>();


    public boolean isValidDirection(MoveDirection newDirection){
        List<MoveDirection> validDirections = new ArrayList<>();
        for (Road road: validRoads){
            if(road.getVehiclesAmount()>0){
                validDirections.add(road.getFirstVehicleDirection());
            }
        }
        return !map.collidesWith(validDirections,newDirection);
    }



}


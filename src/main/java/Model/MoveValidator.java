package Model;

import Enum.MoveDirection;

import java.util.ArrayList;
import java.util.List;

public class MoveValidator {
    private final CollisionMap map = new CollisionMap();
    private final List<MoveDirection> validDirections = new ArrayList<>();


    public boolean isValidDirection(MoveDirection newDirection){
        if(!map.collidesWith(validDirections,newDirection)){
            validDirections.add(newDirection);
            return true;
        }
        return false;
    }



}


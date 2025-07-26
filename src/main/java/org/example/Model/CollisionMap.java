package org.example.Model;

import java.util.HashMap;
import java.util.Map;
import java.util.List;
import org.example.Enum.MoveDirection;

public class CollisionMap {
    private final Map<MoveDirection,ValidDirections> map = new HashMap<>();

    public CollisionMap(){
        createRules();
    }

    public boolean collidesWith(List<MoveDirection> previousDirections, MoveDirection newDirection){
        for(MoveDirection direction: previousDirections){
            if(!map.get(direction).containsElement(newDirection)){
                return true;
            }
        }
        return false;
    }

    private void createRules(){
        for(MoveDirection direction: MoveDirection.values()){
            map.put(direction, new ValidDirections(direction));
        }
    }

}

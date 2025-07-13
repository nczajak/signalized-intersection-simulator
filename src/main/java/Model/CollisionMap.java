package Model;

import java.util.HashMap;
import java.util.Map;
import Enum.MoveDirection;

public class CollisionMap {
    private final Map<MoveDirection,ValidDirections> map = new HashMap<>();

    public CollisionMap(){
        createRules();
    }

    private void createRules(){
        for(MoveDirection direction: MoveDirection.values()){
            map.put(direction, new ValidDirections(direction));
        }
    }

}

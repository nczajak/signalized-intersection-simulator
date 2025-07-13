package Model;

import java.util.HashMap;
import java.util.Map;
import Enum.MoveDirection;

public class CollisionMap {
    private final Map<MoveDirection,ValidDirections> map;

    public CollisionMap(){
        this.map = new HashMap<>();
        createRules();
    }

    private void createRules(){
        for(MoveDirection direction: MoveDirection.values()){
            map.put(direction, new ValidDirections(direction));
        }
    }

}

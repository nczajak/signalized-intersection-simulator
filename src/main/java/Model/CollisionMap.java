package Model;

import java.util.Map;
import java.util.HashMap;

import Enum.MoveDirection;

public class CollisionMap {
    private final Map<MoveDirection,Boolean> map;
    private final MoveDirection direction;

    public CollisionMap(MoveDirection direction){
        this.direction = direction;
        this.map = new HashMap<>();
    }

    public void createRules(){
        for(MoveDirection moveDirection: MoveDirection.values()){
            createCollisionMap();
        }
    }
    private void createCollisionMap(){
        switch (this.direction){
        }
    }
}

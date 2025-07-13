package Model;

import Enum.MoveDirection;
import java.util.Set;

public class ValidDirections {
    private final Set<MoveDirection> validDirections;

    public ValidDirections(MoveDirection direction) {
        this.validDirections = createCollisionSet(direction);
    }

    private Set<MoveDirection> createCollisionSet(MoveDirection direction){
        return switch (direction){
            case NORTH_EAST -> Set.of(MoveDirection.EAST_NORTH);
            case NORTH_SOUTH -> Set.of(MoveDirection.EAST_NORTH,MoveDirection.SOUTH_EAST,MoveDirection.SOUTH_NORTH);
            case NORTH_WEST -> Set.of(MoveDirection.EAST_NORTH,MoveDirection.SOUTH_EAST,MoveDirection.SOUTH_NORTH,MoveDirection.WEST_NORTH,MoveDirection.WEST_EAST,MoveDirection.WEST_SOUTH);
            case EAST_SOUTH -> Set.of(MoveDirection.SOUTH_EAST);
            case EAST_WEST -> Set.of(MoveDirection.SOUTH_EAST,MoveDirection.WEST_EAST,MoveDirection.WEST_SOUTH);
            case EAST_NORTH -> Set.of(MoveDirection.NORTH_EAST,MoveDirection.NORTH_SOUTH,MoveDirection.NORTH_WEST,MoveDirection.SOUTH_EAST,MoveDirection.WEST_EAST,MoveDirection.WEST_SOUTH);
            case SOUTH_WEST -> Set.of(MoveDirection.WEST_SOUTH);
            case SOUTH_NORTH -> Set.of(MoveDirection.NORTH_SOUTH,MoveDirection.NORTH_WEST,MoveDirection.WEST_SOUTH);
            case SOUTH_EAST -> Set.of(MoveDirection.EAST_NORTH,MoveDirection.NORTH_SOUTH,MoveDirection.NORTH_WEST,MoveDirection.EAST_WEST,MoveDirection.EAST_SOUTH,MoveDirection.WEST_SOUTH);
            case WEST_NORTH -> Set.of(MoveDirection.NORTH_WEST);
            case WEST_EAST -> Set.of(MoveDirection.NORTH_WEST,MoveDirection.EAST_NORTH,MoveDirection.EAST_WEST);
            case WEST_SOUTH -> Set.of(MoveDirection.NORTH_WEST,MoveDirection.EAST_NORTH,MoveDirection.EAST_WEST,MoveDirection.SOUTH_EAST,MoveDirection.SOUTH_NORTH,MoveDirection.SOUTH_WEST);
        };
}

package Enum;

import Exception.SameRoadDirectionException;

public enum MoveDirection {
    NORTH_EAST,
    NORTH_SOUTH,
    NORTH_WEST,
    EAST_SOUTH,
    EAST_WEST,
    EAST_NORTH,
    SOUTH_WEST,
    SOUTH_NORTH,
    SOUTH_EAST,
    WEST_NORTH,
    WEST_EAST,
    WEST_SOUTH;

    public static MoveDirection parse(RoadDirection start, RoadDirection end) {
        String key = start.name() + "_" + end.name();
        try {
            return MoveDirection.valueOf(key);
        } catch (Exception e) {
            throw new SameRoadDirectionException("Invalid direction combination: " + key);
        }
    }

}


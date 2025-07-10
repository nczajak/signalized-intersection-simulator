package Enum;

public enum RoadDirection {
    NORTH,
    EAST,
    SOUTH,
    WEST;

    public static RoadDirection parse(String directionString) {
        try {
            return RoadDirection.valueOf(directionString.trim().toUpperCase());
        } catch (IllegalArgumentException e) {
            throw new IllegalArgumentException("Invalid direction: " + directionString);
        }
    }
}

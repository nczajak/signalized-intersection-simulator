package test;

import Model.Vehicle;
import org.junit.jupiter.api.Test;
import Enum.RoadDirection;
import Enum.MoveDirection;
import Exception.SameRoadDirectionException;

import static org.junit.jupiter.api.Assertions.*;

class VehicleTest {

    @Test
    public void validDirection(){

        assertEquals(MoveDirection.NORTH_EAST, new Vehicle("vehicle1", RoadDirection.NORTH, RoadDirection.EAST).getDirection());
        assertEquals(MoveDirection.NORTH_SOUTH, new Vehicle("vehicle2", RoadDirection.NORTH, RoadDirection.SOUTH).getDirection());
        assertEquals(MoveDirection.NORTH_WEST, new Vehicle("vehicle3", RoadDirection.NORTH, RoadDirection.WEST).getDirection());

        assertEquals(MoveDirection.EAST_NORTH, new Vehicle("vehicle4", RoadDirection.EAST, RoadDirection.NORTH).getDirection());
        assertEquals(MoveDirection.EAST_SOUTH, new Vehicle("vehicle5", RoadDirection.EAST, RoadDirection.SOUTH).getDirection());
        assertEquals(MoveDirection.EAST_WEST, new Vehicle("vehicle6", RoadDirection.EAST, RoadDirection.WEST).getDirection());

        assertEquals(MoveDirection.SOUTH_NORTH, new Vehicle("vehicle7", RoadDirection.SOUTH, RoadDirection.NORTH).getDirection());
        assertEquals(MoveDirection.SOUTH_EAST, new Vehicle("vehicle8", RoadDirection.SOUTH, RoadDirection.EAST).getDirection());
        assertEquals(MoveDirection.SOUTH_WEST, new Vehicle("vehicle9", RoadDirection.SOUTH, RoadDirection.WEST).getDirection());

        assertEquals(MoveDirection.WEST_NORTH, new Vehicle("vehicle10", RoadDirection.WEST, RoadDirection.NORTH).getDirection());
        assertEquals(MoveDirection.WEST_EAST, new Vehicle("vehicle11", RoadDirection.WEST, RoadDirection.EAST).getDirection());
        assertEquals(MoveDirection.WEST_SOUTH, new Vehicle("vehicle12", RoadDirection.WEST, RoadDirection.SOUTH).getDirection());
    }

    @Test
    public void invalidDirection(){
        assertThrows(SameRoadDirectionException.class, () -> {
            new Vehicle("vehicle1", RoadDirection.NORTH, RoadDirection.NORTH);
        });
        assertThrows(SameRoadDirectionException.class, () -> {
            new Vehicle("vehicle2", RoadDirection.EAST, RoadDirection.EAST);
        });
        assertThrows(SameRoadDirectionException.class, () -> {
            new Vehicle("vehicle3", RoadDirection.SOUTH, RoadDirection.SOUTH);
        });
        assertThrows(SameRoadDirectionException.class, () -> {
            new Vehicle("vehicle4", RoadDirection.WEST, RoadDirection.WEST);
        });
    }
}
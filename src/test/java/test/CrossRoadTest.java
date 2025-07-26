package test;

import org.example.Model.CrossRoad;
import org.example.Model.Vehicle;
import org.junit.jupiter.api.Test;
import org.example.Enum.RoadDirection;

import static org.junit.jupiter.api.Assertions.*;

class CrossRoadTest {

    @Test
    public void getRoadsSortedByPriority(){
        CrossRoad crossRoad = new CrossRoad();
        Vehicle vehicle1 = new Vehicle("vehicle1", RoadDirection.NORTH,RoadDirection.SOUTH);
        crossRoad.putVehicleOnValidRoad(vehicle1);

        assertEquals(RoadDirection.NORTH,crossRoad.getRoadsSortedByPriority().getFirst().getDirection());

        Vehicle vehicle2 = new Vehicle("vehicle2", RoadDirection.WEST,RoadDirection.SOUTH);
        crossRoad.putVehicleOnValidRoad(vehicle2);

        assertEquals(RoadDirection.NORTH,crossRoad.getRoadsSortedByPriority().getFirst().getDirection());

        Vehicle vehicle3 = new Vehicle("vehicle3", RoadDirection.WEST,RoadDirection.SOUTH);
        crossRoad.putVehicleOnValidRoad(vehicle3);

        assertEquals(RoadDirection.WEST,crossRoad.getRoadsSortedByPriority().getFirst().getDirection());

        crossRoad.moveVehicles();

        assertEquals(RoadDirection.WEST,crossRoad.getRoadsSortedByPriority().getFirst().getDirection());

    }

}
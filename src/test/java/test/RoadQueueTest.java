package test;

import java.util.ArrayList;
import java.util.List;
import Model.Road;
import Model.RoadQueue;
import Model.Vehicle;
import org.junit.jupiter.api.Test;
import Enum.RoadDirection;

import static org.junit.jupiter.api.Assertions.*;

class RoadQueueTest {

    @Test
    public void validRoadWithLongestQueue(){
        Road road1 = new Road(RoadDirection.NORTH);
        Road road2 = new Road(RoadDirection.EAST);
        Road road3 = new Road(RoadDirection.SOUTH);
        Road road4 = new Road(RoadDirection.WEST);

        List<Road> roads = new ArrayList<>();
        roads.add(road1);
        roads.add(road2);
        roads.add(road3);
        roads.add(road4);

        RoadQueue roadQueue = new RoadQueue(roads);

        assertEquals(road1,roadQueue.getRoadWithLongestQueue());

        Vehicle vehicle1 = new Vehicle("vehicle1",RoadDirection.EAST,RoadDirection.WEST);
        road2.addVehicle(vehicle1);

        assertEquals(road2, roadQueue.getRoadWithLongestQueue());

        Vehicle vehicle2 = new Vehicle("vehicle2",RoadDirection.SOUTH,RoadDirection.WEST);
        Vehicle vehicle3 = new Vehicle("vehicle3",RoadDirection.SOUTH,RoadDirection.WEST);

        road3.addVehicle(vehicle2);
        road3.addVehicle(vehicle3);

        assertEquals(road3,roadQueue.getRoadWithLongestQueue());

        Vehicle vehicle4 = new Vehicle("vehicle4",RoadDirection.EAST,RoadDirection.SOUTH);

        road2.addVehicle(vehicle4);

        assertEquals(road3,roadQueue.getRoadWithLongestQueue());

    }

}
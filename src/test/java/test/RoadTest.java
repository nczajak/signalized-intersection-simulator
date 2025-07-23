package test;

import Model.Road;
import Model.Vehicle;
import org.junit.jupiter.api.Test;
import Enum.RoadDirection;
import Exception.EmptyRoadException;

import static org.junit.jupiter.api.Assertions.*;

class RoadTest {

    @Test
    public void validVehiclesAmount(){
        Road road = new Road(RoadDirection.NORTH);
        Vehicle vehicle1 = new Vehicle("vehicle1",RoadDirection.NORTH,RoadDirection.WEST);
        Vehicle vehicle2 = new Vehicle("vehicle2",RoadDirection.NORTH,RoadDirection.EAST);
        road.addVehicle(vehicle1);
        road.addVehicle(vehicle2);
        assertEquals(2,road.getVehiclesAmount());
        road.moveVehicle();
        assertEquals(1,road.getVehiclesAmount());
        road.moveVehicle();
        assertEquals(0,road.getVehiclesAmount());
    }

    @Test
    public void validVehiclesAmountOnNewRoad(){
        Road road = new Road(RoadDirection.NORTH);
        assertEquals(0,road.getVehiclesAmount());
    }

    @Test
    public void invalidVehiclesAmount(){
        Road road = new Road(RoadDirection.NORTH);
        assertThrows(EmptyRoadException.class, road::moveVehicle);
    }


    @Test
    public void validEmptyRoadPriority(){
        Road road = new Road(RoadDirection.NORTH);

        assertEquals(0,road.getPriority());
    }

    @Test
    public void validRoadPriorityWithSomeVehicles(){
        Road road = new Road(RoadDirection.NORTH);
        Vehicle vehicle1 = new Vehicle("vehicle1",RoadDirection.NORTH,RoadDirection.WEST);

        road.addVehicle(vehicle1);
        road.addVehicle(vehicle1);

        assertEquals(2,road.getPriority());
    }

    @Test
    public void validRoadPriorityWithSomeVehiclesAndWaitingTime(){
        Road road = new Road(RoadDirection.NORTH);
        Vehicle vehicle1 = new Vehicle("vehicle1",RoadDirection.NORTH,RoadDirection.WEST);
        Vehicle vehicle2 = new Vehicle("vehicle2",RoadDirection.NORTH,RoadDirection.WEST);

        road.addVehicle(vehicle1);
        road.addVehicle(vehicle2);

        vehicle1.increaseWaitingTime();

        assertEquals(3,road.getPriority());

        vehicle1.increaseWaitingTime();
        vehicle2.increaseWaitingTime();

        assertEquals(4, road.getPriority());

        road.moveVehicle();

        assertEquals(2,road.getPriority());
    }




}
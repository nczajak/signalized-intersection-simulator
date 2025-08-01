package org.example.controllers;

import org.example.Enum.RoadDirection;
import org.example.Model.CrossRoad;
import org.example.dtos.VehicleDto;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.Map;
import java.util.HashMap;
import java.util.List;

@RestController
@RequestMapping("/road")
public class CrossRoadController {
    private final CrossRoad crossRoad;

    public CrossRoadController(CrossRoad crossRoad) {
        this.crossRoad = crossRoad;
    }

    @GetMapping
    public Map<String, Integer> getRoads(){
        Map<String, Integer> status = new HashMap<>();
        crossRoad.getRoadsSortedByPriority().forEach(road ->
                status.put(road.getDirection().name(), road.getVehiclesAmount())
        );
        return status;
    }

    @GetMapping("/north")
    public List<VehicleDto> getNorthRoadReport(){
        return crossRoad.getVehiclesDtoFromRoad(RoadDirection.NORTH);
    }

    @GetMapping("/south")
    public List<VehicleDto> getSouthRoadReport(){
        return crossRoad.getVehiclesDtoFromRoad(RoadDirection.SOUTH);
    }

    @GetMapping("/east")
    public List<VehicleDto> getEastRoadReport(){
        return crossRoad.getVehiclesDtoFromRoad(RoadDirection.EAST);
    }

    @GetMapping("/west")
    public List<VehicleDto> getWestRoadReport(){
        return crossRoad.getVehiclesDtoFromRoad(RoadDirection.WEST);
    }

}

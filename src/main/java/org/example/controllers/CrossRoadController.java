package org.example.controllers;

import org.example.Enum.Colour;
import org.example.Enum.MoveDirection;
import org.example.Enum.RoadDirection;
import org.example.Model.CrossRoad;
import org.example.Model.Road;
import org.example.dtos.VehicleDto;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/road")
public class CrossRoadController {
    private final CrossRoad crossRoad;

    public CrossRoadController(CrossRoad crossRoad) {
        this.crossRoad = crossRoad;
    }

    @GetMapping
    public Map<String, Integer> getRoads(){
        Map<Road,Integer> statusMap = crossRoad.getVehiclesAmountOnRoads();
        return statusMap.entrySet()
                .stream()
                .collect(Collectors.toMap(
                        entry -> entry.getKey().toString(),
                        Map.Entry::getValue
                ));
    }

    @GetMapping("/lights")
    public Map<String,String> getLights(){
        return crossRoad.getLightColours();
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

    @GetMapping("current-moves")
    public List<String> currentMovesToString() {
        return crossRoad.getCurrentMoves()
                .stream()
                .map(MoveDirection::name)
                .collect(Collectors.toList());
    }
}

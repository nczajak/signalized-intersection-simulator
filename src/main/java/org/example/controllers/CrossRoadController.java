package org.example.controllers;

import org.example.Model.CrossRoad;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.Map;
import java.util.HashMap;

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

}

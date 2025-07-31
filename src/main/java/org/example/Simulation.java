package org.example;

import org.example.Command.ActionStorageService;
import org.example.Command.CommandAction;
import org.example.Model.CrossRoad;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class Simulation {
    private final ActionStorageService storageService;
    private final CrossRoad crossRoad = new CrossRoad();

    public Simulation(ActionStorageService storageService) {
        this.storageService = storageService;
    }

    public void run(List<CommandAction> actions){
        for (CommandAction action: actions){
            storageService.saveAction(action.toString());
            action.applyAction(crossRoad);
            crossRoad.report();
        }
    }
}

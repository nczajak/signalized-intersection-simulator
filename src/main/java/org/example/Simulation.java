package org.example;

import org.example.Command.ActionStorageService;
import org.example.Command.CommandAction;
import org.example.Model.CrossRoad;
import org.springframework.stereotype.Service;

import java.util.List;

import static java.lang.Thread.sleep;

@Service
public class Simulation {

    private final ActionStorageService storageService;
    private final CrossRoad crossRoad;

    public Simulation(ActionStorageService storageService, CrossRoad crossRoad) {
        this.storageService = storageService;
        this.crossRoad = crossRoad;
    }


    public void run(List<CommandAction> actions) throws InterruptedException {
        for (CommandAction action: actions){
            storageService.saveAction(action.toDto());
            action.applyAction(crossRoad);
            crossRoad.report();
            sleep(3000);
        }
    }
}

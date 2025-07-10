
import Command.CommandAction;
import Model.CrossRoad;

import java.util.List;

public class Simulation {
    private final List<CommandAction> actions;
    private final CrossRoad crossRoad;

    public Simulation(List<CommandAction> actions){
        this.actions = actions;
        this.crossRoad = new CrossRoad();
    }
    public void run(){
        for (CommandAction action: actions){
            action.applyAction();
        }
        this.crossRoad.getTopPriorityRoad();
    }
}

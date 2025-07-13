
import Command.CommandAction;
import Model.CrossRoad;

import java.util.List;

public class Simulation {
    private final List<CommandAction> actions;
    private final CrossRoad crossRoad = new CrossRoad();;

    public Simulation(List<CommandAction> actions){
        this.actions = actions;
    }

    public void run(){
        for (CommandAction action: actions){
            action.applyAction(crossRoad);
            crossRoad.report();
        }
    }
}

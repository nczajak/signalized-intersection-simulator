
import Command.CommandAction;
import Model.CrossRoad;

import java.util.List;

public class Simulation {
    private final List<CommandAction> actions;

    public Simulation(List<CommandAction> actions){
        this.actions = actions;
        CrossRoad crossRoad = new CrossRoad();
    }
    public void run(){
        for(CommandAction action: actions){
            action.applyAction();
        }
    }
}

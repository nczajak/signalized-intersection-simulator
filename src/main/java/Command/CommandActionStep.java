package Command;

import Model.CrossRoad;

public class CommandActionStep implements CommandAction {

    @Override
    public void applyAction(CrossRoad crossRoad) {
        System.out.println("step");
    }
}

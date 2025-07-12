package Command;

import Model.CrossRoad;
import Model.Road;

public class CommandActionStep implements CommandAction {

    @Override
    public void applyAction(CrossRoad crossRoad) {
        Road road = crossRoad.getTopPriorityRoad();
        road.moveVehicle();
    }
}

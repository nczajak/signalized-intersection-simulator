package Command;

import Exception.EmptyRoadException;
import Model.CrossRoad;
import Model.Road;

public class CommandActionStep implements CommandAction {

    @Override
    public void applyAction(CrossRoad crossRoad) {
        try {
            crossRoad.setLights();
            crossRoad.moveVehicles();
        }
        catch (EmptyRoadException e){
            System.err.println(e.getMessage());
        }
    }


}

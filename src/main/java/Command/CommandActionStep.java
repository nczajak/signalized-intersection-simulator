package Command;

import Exception.EmptyRoadException;
import Model.CrossRoad;

public class CommandActionStep implements CommandAction {

    @Override
    public void applyAction(CrossRoad crossRoad) {
        try {
            crossRoad.moveVehicles();
        }
        catch (EmptyRoadException e){
            System.err.println(e.getMessage());
        }
    }


}

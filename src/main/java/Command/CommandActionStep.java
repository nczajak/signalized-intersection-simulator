package Command;

import Exception.EmptyRoadException;
import Model.CrossRoad;
import Model.MoveValidator;

public class CommandActionStep implements CommandAction {

    @Override
    public void applyAction(CrossRoad crossRoad) {
        MoveValidator validator = new MoveValidator();
        validator.setLights(crossRoad);

        try {
            crossRoad.moveVehicles();
        }
        catch (EmptyRoadException e){
            System.err.println(e.getMessage());
        }
    }


}

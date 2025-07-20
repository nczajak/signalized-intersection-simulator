package Command;

import Exception.EmptyRoadException;
import Model.CrossRoad;
import Model.MoveValidator;
import Model.Road;

public class CommandActionStep implements CommandAction {

    private final MoveValidator moveValidator = new MoveValidator();

    @Override
    public void applyAction(CrossRoad crossRoad) {
        try {
            moveValidator.setGreenLights();
            crossRoad.moveVehicles();
        }
        catch (EmptyRoadException e){
            System.err.println(e.getMessage());
        }
    }


}

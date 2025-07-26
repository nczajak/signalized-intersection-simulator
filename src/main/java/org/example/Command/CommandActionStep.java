package org.example.Command;

import org.example.Exception.EmptyRoadException;
import org.example.Model.CrossRoad;
import org.example.Model.MoveValidator;

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

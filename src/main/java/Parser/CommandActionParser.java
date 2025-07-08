package Parser;

import Command.Command;
import Command.CommandAction;
import Command.CommandActionAddVehicle;
import Command.CommandActionStep;
import Command.CommandList;
import Exception.InvalidCommandTypeException;

import java.util.ArrayList;
import java.util.List;


public class CommandActionParser {

    public List<CommandAction> commandsParse(CommandList commandList){
        List<CommandAction> actions = new ArrayList<>();
        for (Command command : commandList.getCommands()) {
            try {
                CommandAction action = switch (command.type) {
                    case "addVehicle" -> new CommandActionAddVehicle(command);
                    case "step" -> new CommandActionStep();
                    default -> throw new InvalidCommandTypeException("Invalid command type:");
                };
                actions.add(action);
            }
            catch (Exception e){
                System.err.println(e.getMessage()+" "+command.type);
            }
        }
        return actions;
    }
}

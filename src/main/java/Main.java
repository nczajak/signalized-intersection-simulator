import Model.CommandAction;
import Model.CommandActionAddVehicle;
import Model.CommandActionStep;
import Model.Vehicle;
import com.google.gson.Gson;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import Exception.InvalidCommandTypeException;

public class Main {
    public static void main(String[] args) throws IOException {
        String inputFile = "./resources/input.json";
        String content = new String(Files.readAllBytes(Paths.get(inputFile)));
        Gson gson = new Gson();
        CommandList commandList = gson.fromJson(content, CommandList.class);
        CommandAction action;
        List<CommandAction> actions = new ArrayList<>();
        for (Command command : commandList.commands) {
            System.out.println(command.type);
            try {
                action = switch (command.type) {
                    case "addVehicle" -> {
                        Vehicle vehicle = new Vehicle(command.vehicleId, command.startRoad, command.endRoad);
                        yield new CommandActionAddVehicle(vehicle);
                    }
                    case "step" -> new CommandActionStep();
                    default -> throw new InvalidCommandTypeException("Invalid command type:");
                };
                actions.add(action);
            }
            catch (Exception e){
                System.err.println(e.getMessage()+" "+command.type);
            }
        }
    }
}
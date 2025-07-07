import com.google.gson.Gson;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class Main {
    public static void main(String[] args) throws IOException {
//        String inputFile = args[0];
        String inputFile = "./resources/input.json";
        String content = new String(Files.readAllBytes(Paths.get(inputFile)));

        Gson gson = new Gson();
        CommandList commandList = gson.fromJson(content, CommandList.class);

        for (Command command : commandList.commands) {
            switch (command.type) {
                case "addVehicle":
                    System.out.printf("Add vehicle %s, start road: %s, end road: %s%n",
                            command.vehicleId, command.startRoad, command.endRoad);
                    break;
                case "step":
                    System.out.println("step simulation");
                    break;
                default:
                    System.out.println("unknown type: " + command.type);
            }
        }
    }

}
import Model.*;
import Parser.CommandActionParser;
import Parser.CommandJsonParser;
import java.io.IOException;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        String inputFile = "./resources/input.json";
        CommandJsonParser commandJsonParser = new CommandJsonParser();
        CommandList commandList = commandJsonParser.jsonParse(inputFile);
        CommandActionParser commandActionParser = new CommandActionParser();
        List<CommandAction> actions = commandActionParser.commandsParse(commandList);
        Simulation simulation = new Simulation(actions);
        simulation.run();
    }
}
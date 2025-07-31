package org.example;

import org.example.Command.CommandAction;
import org.example.Command.CommandList;
import org.example.Parser.CommandActionParser;
import org.example.Parser.CommandJsonParser;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.io.IOException;
import java.util.List;

@SpringBootApplication
public class Application {
    public static void main(String[] args) throws IOException {

        var context = SpringApplication.run(Application.class, args);

        String inputFile = "./src/main/resources/input.json";
        CommandJsonParser commandJsonParser = new CommandJsonParser();
        CommandList commandList = commandJsonParser.jsonParse(inputFile);
        CommandActionParser commandActionParser = new CommandActionParser();
        List<CommandAction> actions = commandActionParser.commandsParse(commandList);

        Simulation simulation = context.getBean(Simulation.class);
        simulation.run(actions);
    }
}
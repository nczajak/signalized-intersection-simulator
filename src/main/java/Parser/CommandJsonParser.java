package Parser;

import Command.CommandList;
import com.google.gson.Gson;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class CommandJsonParser {

    public CommandList jsonParse(String inputFile) throws IOException {
        String content = new String(Files.readAllBytes(Paths.get(inputFile)));
        Gson gson = new Gson();
        CommandList commandList = gson.fromJson(content, CommandList.class);
        return commandList;
    }
}

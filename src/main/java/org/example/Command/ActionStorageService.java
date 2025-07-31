package org.example.Command;

import org.example.dtos.CommandActionDto;
import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.List;

@Service
public class ActionStorageService {
    private final List<CommandActionDto> actions = new ArrayList<>();

    public void saveAction(CommandActionDto action) {
        actions.add(action);
    }

    public List<CommandActionDto> getAll() {
        return actions;
    }
}

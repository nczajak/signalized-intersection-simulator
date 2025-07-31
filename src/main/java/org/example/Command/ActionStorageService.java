package org.example.Command;

import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.List;

@Service
public class ActionStorageService {
    private final List<String> actions = new ArrayList<>();

    public void saveAction(String action) {
        actions.add(action);
    }

    public List<String> getAll() {
        return actions;
    }
}

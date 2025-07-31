package org.example.Command;

import org.example.Model.CrossRoad;
import org.example.dtos.CommandActionDto;
import org.springframework.ui.Model;

public interface CommandAction {
    public void applyAction(CrossRoad crossRoad);
    public CommandActionDto toDto();
}
package org.example.controllers;

import org.example.Command.ActionStorageService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

@RestController
@RequestMapping("/actions")
public class ActionController {
    private final ActionStorageService storageService;

    public ActionController(ActionStorageService storageService) {
        this.storageService = storageService;
    }

    @GetMapping
    public List<String> getActions() {
        return storageService.getAll();
    }
}
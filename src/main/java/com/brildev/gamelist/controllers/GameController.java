package com.brildev.gamelist.controllers;

import com.brildev.gamelist.dto.GameMinDto;
import com.brildev.gamelist.entities.Game;
import com.brildev.gamelist.services.GameService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/games")
public class GameController {

    @Autowired
    private GameService gameService;

    @GetMapping
    public List<GameMinDto> findAll (){
    List<GameMinDto> result = gameService.findAll();
    return result;
    }
}

package com.brildev.gamelist.services;

import com.brildev.gamelist.dto.GameMinDto;
import com.brildev.gamelist.entities.Game;
import com.brildev.gamelist.repositories.GameRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class GameService {

    @Autowired
    private GameRepository gameRepository;

    public List<GameMinDto> findAll() {
        List<Game> result = gameRepository.findAll();
        return result.stream().map(x-> new GameMinDto(x)).toList();
    }
}


package com.aprendizadojob.DSList.services;

import com.aprendizadojob.DSList.dto.GameMinDTO;
import com.aprendizadojob.DSList.entities.Game;
import com.aprendizadojob.DSList.repositories.GameRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GameService {
    @Autowired
    private GameRepository gameRepository;

    public List<GameMinDTO> findAll() {
        List<Game> result = gameRepository.findAll();
        return result.stream().map(game -> new GameMinDTO(game)).toList();
    }
}

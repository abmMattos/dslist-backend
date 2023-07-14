package com.andreproect.dslist.services;

import com.andreproect.dslist.entities.Game;
import com.andreproect.dslist.dto.GameMinDTO;
import com.andreproect.dslist.repositories.GameRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GameService {

    @Autowired
    private GameRepository GameRepository;
    public List<GameMinDTO> findAll(){
        List<Game> result = GameRepository.findAll();
        return result.stream().map(x -> new GameMinDTO(x)).toList();
    }
}

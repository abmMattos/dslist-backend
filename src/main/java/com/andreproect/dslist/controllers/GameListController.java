package com.andreproect.dslist.controllers;

import com.andreproect.dslist.dto.GameDTO;
import com.andreproect.dslist.dto.GameListDTO;
import com.andreproect.dslist.dto.GameMinDTO;
import com.andreproect.dslist.services.GameListService;
import com.andreproect.dslist.services.GameService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/lists")
public class GameListController {

    @Autowired
    private GameListService gameListService;

    @GetMapping
    public List<GameListDTO> finddAll(){
        List<GameListDTO> result = gameListService.findAll();
        return result;
    }
}

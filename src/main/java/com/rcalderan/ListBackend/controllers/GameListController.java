package com.rcalderan.ListBackend.controllers;

import com.rcalderan.ListBackend.dto.GameListDTO;
import com.rcalderan.ListBackend.dto.GameMinDTO;
import com.rcalderan.ListBackend.dto.ReplacementDTO;
import com.rcalderan.ListBackend.services.GameListService;
import com.rcalderan.ListBackend.services.GameService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/lists")
public class GameListController {

    @Autowired
    private GameListService gameListService;

    @Autowired
    private GameService gameService;

    @GetMapping
    public List<GameListDTO> findAll(){
        return gameListService.findAll();
    }

    @GetMapping(value = "/{listId}/games")
    public List<GameMinDTO> findByList(@PathVariable Long listId){
        List<GameMinDTO> result = gameService.findByList(listId);
        return result;
    }

    @PostMapping(value = "/{listId}/replacement")
    public void move(@PathVariable Long listId, @RequestBody ReplacementDTO payload){
         gameListService.move(listId, payload.getSourceIndex(), payload.getDestinationIndex());
    }
}

package com.rcalderan.ListBackend.services;

import com.rcalderan.ListBackend.dto.GameDTO;
import com.rcalderan.ListBackend.dto.GameMinDTO;
import com.rcalderan.ListBackend.entities.Game;
import com.rcalderan.ListBackend.projections.GameMinProjection;
import com.rcalderan.ListBackend.repositories.GameRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class GameService {

    @Autowired
    private GameRepository gameRepository;

    @Transactional(readOnly = true)
    public GameDTO findById(Long id){
        //TODO: exceptions like not found must be implemented
        Game result =  gameRepository.findById(id).get();
        return new GameDTO(result);
    }

    @Transactional(readOnly = true)
    public List<Game> findAll(){
        //List<Game> result = gameRepository.findAll();
        return  gameRepository.findAll();
    }

    @Transactional(readOnly = true)
    public List<GameMinDTO> findByList(Long id){
        List<GameMinProjection> result =  gameRepository.searchByList(id);
        return result.stream().map(x -> new GameMinDTO(x) ).toList();
    }
}

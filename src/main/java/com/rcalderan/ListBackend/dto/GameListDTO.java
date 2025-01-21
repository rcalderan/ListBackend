package com.rcalderan.ListBackend.dto;

import com.rcalderan.ListBackend.entities.GameList;

public class GameListDTO {
    private Long id;
    private String name;

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public GameListDTO(){}
    public GameListDTO(GameList entity) {
        id = entity.getId();
        name = entity.getName();
    }

}

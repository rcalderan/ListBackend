package com.rcalderan.ListBackend.dto;

import com.rcalderan.ListBackend.entities.Game;

public class GameMinDTO {

    private Long id;
    private String title;
    private Integer year;
    private String shortDescription;

    public Long getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public Integer getYear() {
        return year;
    }

    public String getShortDescription() {
        return shortDescription;
    }

    public GameMinDTO() {
    }
    public GameMinDTO(Game entity) {
        id = entity.getId();
        title = entity.getTitle();
        year = entity.getYear();
        shortDescription = entity.getShortDescription();
    }
}

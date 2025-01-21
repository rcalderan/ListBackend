package com.rcalderan.ListBackend.entities;

import jakarta.persistence.*;

@Entity
@Table(name = "tb_game_list")
public class GameList {

    @Id@GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public GameList() {
    }
    public GameList(String name, Long id) {
        this.name = name;
        this.id = id;
    }
}

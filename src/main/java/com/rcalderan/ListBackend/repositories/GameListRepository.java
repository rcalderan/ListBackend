package com.rcalderan.ListBackend.repositories;

import com.rcalderan.ListBackend.entities.GameList;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GameListRepository extends JpaRepository<GameList,Long> {
}

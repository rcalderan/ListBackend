package com.rcalderan.ListBackend.repositories;

import com.rcalderan.ListBackend.entities.Game;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GameRepository extends JpaRepository<Game,Long> {
}

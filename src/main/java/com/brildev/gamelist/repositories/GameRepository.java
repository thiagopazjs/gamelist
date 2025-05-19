package com.brildev.gamelist.repositories;

import com.brildev.gamelist.entities.Game;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GameRepository  extends JpaRepository<Game, Long> {
}

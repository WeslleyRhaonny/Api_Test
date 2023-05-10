package com.ezyrhaonny.DsList.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ezyrhaonny.DsList.entities.Game;

public interface GameRepository extends JpaRepository<Game, Long>{

}

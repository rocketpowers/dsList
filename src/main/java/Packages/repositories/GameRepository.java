package Packages.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import Packages.entities.Game;

public interface GameRepository extends JpaRepository<Game, Long>{

}

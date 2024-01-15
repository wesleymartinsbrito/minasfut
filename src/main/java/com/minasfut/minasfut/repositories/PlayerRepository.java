package com.minasfut.minasfut.repositories;

import com.minasfut.minasfut.entities.Player;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PlayerRepository extends JpaRepository<Player, Long>{
}

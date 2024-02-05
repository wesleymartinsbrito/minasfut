package com.minasfut.minasfut.repositories;

import com.minasfut.minasfut.entities.Player;
import com.minasfut.minasfut.projections.PlayerProjection;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface PlayerRepository extends JpaRepository<Player, Long>{
    @Query(nativeQuery = true, value = """
		SELECT tb_player.id, tb_player.name, tb_player.age, tb_player.posicao, tb_player.nacionalidade, tb_player.local_de_nascimento,
		tb_player.altura, tb_player.gols, tb_player.assistencias, tb_game.img_url AS imgUrl,
		FROM tb_player
		INNER JOIN tb_belonging ON tb_player.id = tb_belonging.player_id
		WHERE tb_belonging.team_id = :listId
		ORDER BY tb_belonging.position
			""")
    List<PlayerProjection> searchByList(Long listId);
}

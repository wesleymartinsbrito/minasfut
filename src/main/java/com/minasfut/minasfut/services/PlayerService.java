package com.minasfut.minasfut.services;

import com.minasfut.minasfut.dto.PlayerDTO;
import com.minasfut.minasfut.entities.Player;
import com.minasfut.minasfut.projections.PlayerProjection;
import com.minasfut.minasfut.repositories.PlayerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class PlayerService {

    @Autowired
    public PlayerRepository playerRepository;

    @Transactional(readOnly = true)
    public List<PlayerDTO>findAll(){
        List<Player> result = playerRepository.findAll();
        return result.stream().map(PlayerDTO::new).toList();
    }

    @Transactional(readOnly = true)
    public PlayerDTO findById(Long id){
        Player result = playerRepository.findById(id).get();
        return new PlayerDTO(result);
    }
    @Transactional(readOnly = true)
    public PlayerDTO findByList(Long listId){
        List<PlayerProjection> result = playerRepository.searchByList(listId);
        return (PlayerDTO) result.stream().map(PlayerDTO::new).toList();
    }
}

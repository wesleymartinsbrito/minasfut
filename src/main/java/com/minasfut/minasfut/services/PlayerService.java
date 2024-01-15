package com.minasfut.minasfut.services;

import com.minasfut.minasfut.dto.PlayerDTO;
import com.minasfut.minasfut.entities.Player;
import com.minasfut.minasfut.repositories.PlayerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PlayerService {

    @Autowired
    public PlayerRepository playerRepository;

    public List<PlayerDTO>findAll(){
        List<Player> result = playerRepository.findAll();
        return result.stream().map(PlayerDTO::new).toList();
    }
}

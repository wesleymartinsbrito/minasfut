package com.minasfut.minasfut.controllers;

import com.minasfut.minasfut.dto.PlayerDTO;
import com.minasfut.minasfut.services.PlayerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(name = "/player")
public class PlayerController {

    @Autowired
    public PlayerService playerService;
    @GetMapping(value = "/{id}")
    public PlayerDTO findById(@PathVariable Long id){
        PlayerDTO result = playerService.findById(id);
        return result;
    }
    @GetMapping
    public List<PlayerDTO> findAll(){
        List<PlayerDTO> result = playerService.findAll();
        return result;
    }


}

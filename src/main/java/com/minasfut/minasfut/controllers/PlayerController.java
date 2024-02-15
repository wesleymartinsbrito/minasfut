package com.minasfut.minasfut.controllers;

import com.minasfut.minasfut.dto.PlayerDTO;
import com.minasfut.minasfut.entities.Player;
import com.minasfut.minasfut.services.PlayerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/player")
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

    @PostMapping
    public ResponseEntity<Player> insert(@RequestBody Player entity){
        entity = playerService.insert(entity);
        return ResponseEntity.ok().body(entity);
    }

    @DeleteMapping(value = "/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id){
        playerService.delete(id);
        return ResponseEntity.noContent().build();
    }

    @PutMapping(value = "/{id}")
    public ResponseEntity<Player> update(@PathVariable Long id, @RequestBody Player entity){
        entity = playerService.update(id, entity);
        return ResponseEntity.ok().body(entity);
    }

    @PutMapping(value = "/{id}/age")
    public ResponseEntity<Player> updateAge(@PathVariable Long id, @RequestBody Player entity){
        entity = playerService.updateAge(id, entity);
        return ResponseEntity.ok().body(entity);
    }

    @PutMapping(value = "/{id}/assistencias")
    public ResponseEntity<Player> updateAssistencias(@PathVariable Long id, @RequestBody Player entity){
        entity = playerService.updateAssistencias(id, entity);
        return ResponseEntity.ok().body(entity);
    }

    public ResponseEntity<Player> updateGols(@PathVariable Long id, @RequestBody Player entity){
        entity = playerService.updateGols(id, entity);
        return ResponseEntity.ok().body(entity);
    }
}

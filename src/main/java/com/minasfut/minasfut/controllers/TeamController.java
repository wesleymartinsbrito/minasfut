package com.minasfut.minasfut.controllers;

import com.minasfut.minasfut.dto.PlayerDTO;
import com.minasfut.minasfut.dto.TeamDTO;
import com.minasfut.minasfut.services.PlayerService;
import com.minasfut.minasfut.services.TeamService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/team")
public class TeamController {
    @Autowired
    private TeamService teamService;

    @Autowired
    private PlayerService playerService;

    @GetMapping(value = "/{listId}/players")
    public List<PlayerDTO> findByList(@PathVariable Long listId){
        List<PlayerDTO> result = (List<PlayerDTO>) playerService.findByList(listId);
        return result;
    }
    @GetMapping
    public List<TeamDTO> findAll(){
        List<TeamDTO> result = teamService.findAll();
        return result;
    }
}

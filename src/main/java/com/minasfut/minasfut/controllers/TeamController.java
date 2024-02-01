package com.minasfut.minasfut.controllers;

import com.minasfut.minasfut.dto.TeamDTO;
import com.minasfut.minasfut.services.TeamService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/team")
public class TeamController {
    @Autowired
    private TeamService teamService;

    public List<TeamDTO> findAll(){
        List<TeamDTO> result = teamService.findAll();
        return result;
    }
}

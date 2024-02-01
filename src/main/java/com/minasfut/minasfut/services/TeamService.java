package com.minasfut.minasfut.services;

import com.minasfut.minasfut.dto.TeamDTO;
import com.minasfut.minasfut.entities.Team;
import com.minasfut.minasfut.repositories.TeamRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TeamService {
    @Autowired
    private TeamRepository teamRepository;

    public List<TeamDTO> findAll(){
        List<Team> result = teamRepository.findAll();
        return result.stream().map(TeamDTO::new).toList();
    }
}

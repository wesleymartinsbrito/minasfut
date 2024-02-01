package com.minasfut.minasfut.dto;

import com.minasfut.minasfut.entities.Team;

public class TeamDTO {

    private Long id;
    private String name;

    public TeamDTO(){

    }
    public TeamDTO(Team entity){
        this.id = entity.getId();
        this.name = entity.getName();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

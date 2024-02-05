package com.minasfut.minasfut.dto;

import com.minasfut.minasfut.entities.Player;
import com.minasfut.minasfut.projections.PlayerProjection;

public class PlayerDTO {

    private Long id;
    private String name;
    private String posicao;
    private Integer age;
    private Integer gols;
    private Integer assistencias;

    public PlayerDTO(){

    }

    public PlayerDTO(Player entity) {
        this.id = entity.getId();
        this.name = entity.getName();
        this.posicao = entity.getPosicao();
        this.age = entity.getAge();
        this.gols = entity.getGols();
        this.assistencias = entity.getAssistencias();
    }

    public PlayerDTO(PlayerProjection playerProjection) {
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getPosicao() {
        return posicao;
    }

    public Integer getAge() {
        return age;
    }

    public Integer getGols() {
        return gols;
    }

    public Integer getAssistencias() {
        return assistencias;
    }
}

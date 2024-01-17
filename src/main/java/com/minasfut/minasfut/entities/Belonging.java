package com.minasfut.minasfut.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "tb_belonging")
public class Belonging {
    private Integer position;

    private BelongingPK id = new BelongingPK();

    public Belonging(){

    }

    public Belonging(Player player, Team team, Integer position) {
        this.position = position;
    }

    public Integer getPosition() {
        return position;
    }

    public void setPosition(Integer position) {
        this.position = position;
    }
}

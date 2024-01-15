package com.minasfut.minasfut.entities;

import jakarta.persistence.*;

import java.util.Objects;

@Entity
@Table(name = "tb_player")
public class Player {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private Integer age;
    private String posicao;
    private String nacionalidade;
    private String local_de_nascimento;
    private Double altura;
    private Integer gols;
    private Integer assistencias;
    private String img_url;

    public Player(){

    }

    public Player(Long id, String name, Integer age, String posicao, String nacionalidade, String local_de_nascimento, Double altura, Integer gols, Integer assistencias, String img_url) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.posicao = posicao;
        this.nacionalidade = nacionalidade;
        this.local_de_nascimento = local_de_nascimento;
        this.altura = altura;
        this.gols = gols;
        this.assistencias = assistencias;
        this.img_url = img_url;
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

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getPosicao() {
        return posicao;
    }

    public void setPosicao(String posicao) {
        this.posicao = posicao;
    }

    public String getNacionalidade() {
        return nacionalidade;
    }

    public void setNacionalidade(String nacionalidade) {
        this.nacionalidade = nacionalidade;
    }

    public String getLocalDeNascimento() {
        return local_de_nascimento;
    }

    public void setLocalDeNascimento(String local_de_nascimento) {
        this.local_de_nascimento = local_de_nascimento;
    }

    public Double getAltura() {
        return altura;
    }

    public void setAltura(Double altura) {
        this.altura = altura;
    }

    public Integer getGols() {
        return gols;
    }

    public void setGols(Integer gols) {
        this.gols = gols;
    }

    public Integer getAssistencias() {
        return assistencias;
    }

    public void setAssistencias(Integer assistencias) {
        this.assistencias = assistencias;
    }

    public String getImgUrl() {
        return img_url;
    }

    public void setImgUrl(String img_url) {
        this.img_url = img_url;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Player player = (Player) o;
        return Objects.equals(id, player.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}

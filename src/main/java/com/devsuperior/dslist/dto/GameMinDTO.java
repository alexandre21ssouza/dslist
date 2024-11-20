package com.devsuperior.dslist.dto;


import com.devsuperior.dslist.entities.Game;

public class GameMinDTO {

    private Long id;
    private String title;
    private Integer year;
    private String shortDescription;

    public GameMinDTO() {

    }

    //Está criando neste construtor um objeto a partir dos dados da Entidade Game
    public GameMinDTO(Game entity) {
        id = entity.getId();
        title = entity.getTitle();
        year = entity.getYear();
        shortDescription = entity.getShortDescription();
    }

    /*Neste construtor GameMinDTO precisamos SOMENTE dos GETTERS (sem os SETTERS) pelo
     fato do uso deste modelo de construtor acima, está Settando direto na variável da
     entidade, por isso a necessidade de gerar somente os GETTERS.*/

    public Long getId() {
        return id;
    }

    public String getShortDescription() {
        return shortDescription;
    }

    public Integer getYear() {
        return year;
    }

    public String getTitle() {
        return title;
    }
}
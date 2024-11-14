package com.devsuperior.dslist.entities;

import jakarta.persistence.*;

import java.util.Objects;

@Entity //indica que o objeto é uma entidade
@Table(name = "tb_game") // Nomeia a tabela
public class Game {

    @Id //Config. o id para ser chave primaryKey
    @GeneratedValue(strategy = GenerationType.IDENTITY) // Para que o id seja auto incrementado
    private Long id;
    private String title;

    /* O termo year é uma palavra reservada no SQL, por isso devemos renomear ela
    para evitar erros futuros no banco de dados. OBS: podermos renomear as tabelas
    desta maneira abaixo caso seja necessário, senão ela fica salva com o nome do
    atributo original */
    @Column(name = "game_year")
    private Integer year;
    private String genre;
    private String platforms;
    private Double score;
    private String imgUrl;

    /* Esta anotação acima do shortDescription e longDescription, com esta config.
    estar relaconada com a quantidade de carcteres da descrição do atributo, pois
    sem esta config. ela aceita por padrão no banco de dados, apenas 255 caracteres,
    sendo assim, pouco para uma descrição longa e também curta do atributo. Usando o
     "TEXT" essa capacidade aumenta, assim satisfazendo a necessidade do projeto.
     */
    @Column(columnDefinition = "TEXT")
    private String shortDescription;

    @Column(columnDefinition = "TEXT")
    private String longDescription;

    public Game(){

    }

    public Game(Long id, String title, Integer year, String genre, String platforms, Double score,
                String imgUrl, String shortDescription, String longDescription) {
        this.id = id;
        this.title = title;
        this.year = year;
        this.genre = genre;
        this.platforms = platforms;
        this.score = score;
        this.imgUrl = imgUrl;
        this.shortDescription = shortDescription;
        this.longDescription = longDescription;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Integer getYear() {
        return year;
    }

    public void setYear(Integer year) {
        this.year = year;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getPlatforms() {
        return platforms;
    }

    public void setPlatform(String platform) {
        this.platforms = platforms;
    }

    public Double getScore() {
        return score;
    }

    public void setScore(Double score) {
        this.score = score;
    }

    public String getImgUrl() {
        return imgUrl;
    }

    public void setImgUrl(String imgUrl) {
        this.imgUrl = imgUrl;
    }

    public String getShortDescription() {
        return shortDescription;
    }

    public void setShortDescription(String shortDescription) {
        this.shortDescription = shortDescription;
    }

    public String getLongDescription() {
        return longDescription;
    }

    public void setLongDescription(String longDescription) {
        this.longDescription = longDescription;
    }

    /* O método Equals e hashCode são usados para comaparar um objeto com o outro,
     se são iguais ou não, no caso, um game com o outro dentro de uma lista.
    */

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Game game = (Game) o;
        return Objects.equals(id, game.id);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }


}

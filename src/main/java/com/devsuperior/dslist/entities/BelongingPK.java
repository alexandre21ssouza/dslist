package com.devsuperior.dslist.entities;

import jakarta.persistence.Embeddable;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

import java.util.Objects;

@Embeddable //Encapsulando 2 atributos em somente uma classe
public class BelongingPK {

    //mapeamento da tabela
    @ManyToOne // muitos para um
    @JoinColumn(name = "game_id") // Id game
    private Game game;

    @ManyToOne // muitos para um
    @JoinColumn(name = "list_id")//
    private GameList list;

    public BelongingPK(){

    }

    public BelongingPK(Game game, GameList list) {
        this.game = game;
        this.list = list;
    }

    public Game getGame() {
        return game;
    }

    public void setGame(Game game) {
        this.game = game;
    }

    public GameList getList() {
        return list;
    }

    public void setList(GameList list) {
        this.list = list;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        BelongingPK belongingPK = (BelongingPK) o;
        return Objects.equals(game, belongingPK.game) && Objects.equals(list, belongingPK.list);
    }

    @Override
    public int hashCode() {
        return Objects.hash(game, list);
    }
}

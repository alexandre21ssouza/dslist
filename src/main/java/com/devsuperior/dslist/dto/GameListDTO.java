package com.devsuperior.dslist.dto;

import com.devsuperior.dslist.entities.GameList;

public class GameListDTO {

    private Long id;
    private String name;

    public GameListDTO(){

    }

    public GameListDTO(GameList entity) {
        /*O construtor pode ser escrito desta forma ou ser usado como está escrito no
         construtor da classe GameDTO QUE ESTÁ usando O BeanUtil(MAIS USADO QUANDO
         TEM MUITOS ATRIBUTOS NA CLASSE, AGILIZA MAIS O TEMPO GASTO) por isso neste
         caso de poucos atributos, não é tão necessário.(Neste modelo o SETTERS estão
        sendo passados diretamente na variável, por isso só geramos os GETTERS.*/
       id = entity.getId();
        name = entity.getName();
    }

    //Getters

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }
}

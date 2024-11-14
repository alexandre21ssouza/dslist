package com.devsuperior.dslist.services;

import com.devsuperior.dslist.dto.GameMinDTO;
import com.devsuperior.dslist.entities.Game;
import com.devsuperior.dslist.repositories.GameRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


/*Registro de componentes, usando anotações. @Component ou @Service, para facilitar o
 gerenciamento do Spring
 */

//Serviço retorna(devolve) um DTO neste caso em forma de lista, neste método.
@Service
public class GameService {


    /*Está injetando uma instância do GameRepository no GameService, um ponto de acesso
    nesta classe, para acessar o banco de dados, usando a anotação @Autowared.
     Injeção de dependências(Um componente que chama outro componente dentro de outro)

     */
    @Autowired
    private GameRepository gameRepository;

    public List<GameMinDTO> findAll(){
        List<Game> result = gameRepository.findAll();
        /*Transforma uma lista de Game, em GameMinDto, através do(stream().map()
        usando o .toList() para transformar em uma lista novamente, retornando uma
         instância dto.
        */
        List<GameMinDTO> dto = result.stream().map(x -> new GameMinDTO(x)).toList();
    return dto;
    //ou retorne direto assim: return result.stream().map(x -> new GameMinDTO(x)).toList();

    }
}

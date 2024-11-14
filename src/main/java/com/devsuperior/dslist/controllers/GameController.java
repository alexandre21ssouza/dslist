package com.devsuperior.dslist.controllers;



import com.devsuperior.dslist.dto.GameMinDTO;
import com.devsuperior.dslist.entities.Game;
import com.devsuperior.dslist.services.GameService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

/*
O controlador é a porta de entrada das requisições do Front-end, para a ação nas demais
camadas do projeto: Front-end <--> jSON (requisição HTTP/REST) <--> Controller <-->
(Dto) <--> Service <--> (Entities/ORM) <--> Repository. A resposta é o caminho inverso!
 */

@RestController
@RequestMapping(value = "/games") //recurso(caminho) https://meusistema.com/games
public class GameController {

    //Injeção de dependência da instância service(@Autowired)
    @Autowired
    private GameService gameService;

    @GetMapping //Verbo HTTP GET
    public List<GameMinDTO> findAll(){
        List<GameMinDTO> result = gameService.findAll();
        return result;
    }
}

package com.devsuperior.dslist.services;

import com.devsuperior.dslist.dto.GameListDTO;
import com.devsuperior.dslist.entities.GameList;
import com.devsuperior.dslist.repositories.GameListRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class GameListService {

    @Autowired //(injetando GameListRepository)
    private GameListRepository gameListRepository;

    @Transactional(readOnly = true)
    public List<GameListDTO> findAll(){
        //Uma GameList recebe uma gameListRepository, vindo da consulta do banco de dados
        List<GameList> result = gameListRepository.findAll();
        /*Convertendo uma GameList que veio do banco de dados em uma GameListDTO
        (x) é cada objeto da GameList que é transformado em um novo obj GameListDTO
         e retorna uma lista(to.List)*/
        return result.stream().map(x -> new GameListDTO(x)).toList();
    }
}

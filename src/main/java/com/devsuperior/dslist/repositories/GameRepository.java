package com.devsuperior.dslist.repositories;

import com.devsuperior.dslist.entities.Game;
import org.springframework.data.jpa.repository.JpaRepository;


/*Vai fazer a comunicação, a consulta com o banco de dados, camada de acesso aos dados,
herdando(extends) da classe JpaRepository<nomeDaEntidade, tipoDoId>
Devolve uma entidade.
*/
public interface GameRepository extends JpaRepository<Game, Long> {

}

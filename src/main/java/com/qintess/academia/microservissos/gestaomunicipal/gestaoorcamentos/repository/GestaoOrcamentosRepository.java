package com.qintess.academia.microservissos.gestaomunicipal.gestaoorcamentos.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.qintess.academia.microservissos.gestaomunicipal.gestaoorcamentos.entity.Budget;

public interface GestaoOrcamentosRepository extends JpaRepository<Budget, Long>  {

}

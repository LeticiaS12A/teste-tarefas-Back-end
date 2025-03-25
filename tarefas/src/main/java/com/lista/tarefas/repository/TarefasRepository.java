package com.lista.tarefas.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.lista.tarefas.entity.Tarefas;

@Repository
public interface TarefasRepository extends JpaRepository<Tarefas, Long> {

}

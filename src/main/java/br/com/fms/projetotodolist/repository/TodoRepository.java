package br.com.fms.projetotodolist.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.fms.projetotodolist.entity.Todo;

public interface TodoRepository extends JpaRepository<Todo, Long> {

}

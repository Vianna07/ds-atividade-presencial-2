package br.com.vianna.task.manager.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.vianna.task.manager.models.Categoria;

@Repository
public interface CategoriaRepository extends JpaRepository<Categoria, Long> {}

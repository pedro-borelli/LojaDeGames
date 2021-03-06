package org.MinhaLojadeGames.MinhaLojadeGames.repository;

import java.util.List;

import org.MinhaLojadeGames.MinhaLojadeGames.model.Categoria;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CategoriaRepository extends JpaRepository<Categoria, Long>{
	public List<Categoria> findAllByNomeCategoriaContainingIgnoreCase(String nomeCategoria);

}

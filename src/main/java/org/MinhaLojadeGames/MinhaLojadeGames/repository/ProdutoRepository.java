package org.MinhaLojadeGames.MinhaLojadeGames.repository;

import java.util.List;

import org.MinhaLojadeGames.MinhaLojadeGames.model.Produto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProdutoRepository extends JpaRepository<Produto, Long> {

	public List<Produto> findAllByNomeProdutoContainingIgnoreCase(String nomeProduto);
	
}

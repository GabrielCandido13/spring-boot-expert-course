package io.github.gabrielcandido13.produtosapi.repository;

import io.github.gabrielcandido13.produtosapi.model.Produto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProdutoRepository extends JpaRepository<Produto, String> {
}

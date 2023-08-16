package br.com.cardapio.repository;

import br.com.cardapio.entidades.Foods;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FoodsRepository extends JpaRepository<Foods, Long> {
}

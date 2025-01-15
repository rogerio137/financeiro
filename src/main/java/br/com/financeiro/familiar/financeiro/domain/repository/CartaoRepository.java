package br.com.financeiro.familiar.financeiro.domain.repository;


import br.com.financeiro.familiar.financeiro.domain.entity.Cartao;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface CartaoRepository extends JpaRepository<Cartao, UUID> {
}

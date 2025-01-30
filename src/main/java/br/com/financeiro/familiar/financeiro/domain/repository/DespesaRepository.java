package br.com.financeiro.familiar.financeiro.domain.repository;

import br.com.financeiro.familiar.financeiro.domain.entity.Despesa;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface DespesaRepository extends JpaRepository<Despesa, UUID> {
}

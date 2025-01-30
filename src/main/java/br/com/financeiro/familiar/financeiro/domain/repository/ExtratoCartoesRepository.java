package br.com.financeiro.familiar.financeiro.domain.repository;

import br.com.financeiro.familiar.financeiro.domain.entity.ExtratoCartoes;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface ExtratoCartoesRepository extends JpaRepository<ExtratoCartoes, UUID> {
}

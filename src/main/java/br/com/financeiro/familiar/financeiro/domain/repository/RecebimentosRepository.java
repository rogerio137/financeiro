package br.com.financeiro.familiar.financeiro.domain.repository;

import br.com.financeiro.familiar.financeiro.domain.entity.Recebimentos;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface RecebimentosRepository extends JpaRepository<Recebimentos, UUID> {
}

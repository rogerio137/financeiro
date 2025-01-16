package br.com.financeiro.familiar.financeiro.domain.service;

import br.com.financeiro.familiar.financeiro.domain.entity.Despesa;
import br.com.financeiro.familiar.financeiro.domain.entity.dto.DespesaDTO;

public interface DespesaService {

    Despesa salvar(DespesaDTO despesaDTO);
}

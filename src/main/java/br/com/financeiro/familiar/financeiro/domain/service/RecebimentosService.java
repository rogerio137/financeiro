package br.com.financeiro.familiar.financeiro.domain.service;

import br.com.financeiro.familiar.financeiro.domain.entity.Recebimentos;
import br.com.financeiro.familiar.financeiro.domain.entity.dto.RecebimentosDTO;

public interface RecebimentosService {

    Recebimentos salvar(RecebimentosDTO recebimentosDTO);
}

package br.com.financeiro.familiar.financeiro.domain.service.impl;

import br.com.financeiro.familiar.financeiro.domain.entity.Recebimentos;
import br.com.financeiro.familiar.financeiro.domain.entity.dto.RecebimentosDTO;
import br.com.financeiro.familiar.financeiro.domain.repository.RecebimentosRepository;
import br.com.financeiro.familiar.financeiro.domain.service.RecebimentosService;

public class RecebimentoServiceImpl implements RecebimentosService {

    private RecebimentosRepository repository;

    @Override
    public Recebimentos salvar(RecebimentosDTO recebimentosDTO) {
        Recebimentos recebimentos = new Recebimentos(recebimentosDTO.getValor(), recebimentosDTO.getTipoRecebimento(),
                recebimentosDTO.getDescricao(), recebimentosDTO.getDataRecebimento());
        repository.save(recebimentos);
        return recebimentos;
    }
}

package br.com.financeiro.familiar.financeiro.domain.service.impl;

import br.com.financeiro.familiar.financeiro.domain.entity.Despesa;
import br.com.financeiro.familiar.financeiro.domain.entity.dto.DespesaDTO;
import br.com.financeiro.familiar.financeiro.domain.repository.DespesaRepository;
import br.com.financeiro.familiar.financeiro.domain.service.DespesaService;

public class DespesaServiceImpl implements DespesaService {
    private DespesaRepository repository;
    @Override
    public Despesa salvar(DespesaDTO despesaDTO) {
        Despesa despesa = new Despesa(despesaDTO.getData(), despesaDTO.getDescricao(), despesaDTO.getMesReferencia());
        repository.save(despesa);
        return despesa;
    }
}

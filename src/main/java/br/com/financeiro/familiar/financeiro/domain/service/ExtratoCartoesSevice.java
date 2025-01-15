package br.com.financeiro.familiar.financeiro.domain.service;


import br.com.financeiro.familiar.financeiro.domain.entity.ExtratoCartoes;
import br.com.financeiro.familiar.financeiro.domain.entity.dto.ExtratoCartoesDTO;

public interface ExtratoCartoesSevice {

    ExtratoCartoes salvar(ExtratoCartoesDTO extratoCartoesDTO);
}

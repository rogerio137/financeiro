package br.com.financeiro.familiar.financeiro.domain.service;


import br.com.financeiro.familiar.financeiro.domain.entity.Cartao;
import br.com.financeiro.familiar.financeiro.domain.entity.dto.CartaoDTO;

public interface CartaoService {

    Cartao salvar(CartaoDTO cartaoDTO);
}

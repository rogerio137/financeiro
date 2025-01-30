package br.com.financeiro.familiar.financeiro.domain.service.impl;


import br.com.financeiro.familiar.financeiro.domain.entity.ExtratoCartoes;
import br.com.financeiro.familiar.financeiro.domain.entity.dto.ExtratoCartoesDTO;
import br.com.financeiro.familiar.financeiro.domain.repository.ExtratoCartoesRepository;
import br.com.financeiro.familiar.financeiro.domain.service.ExtratoCartoesSevice;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;


@Service
@RequiredArgsConstructor
public class ExtratoCartoesImpl implements ExtratoCartoesSevice {

    private final ExtratoCartoesRepository repository;
    @Override
    public ExtratoCartoes salvar(ExtratoCartoesDTO extratoCartoesDTO) {
        ExtratoCartoes extratoCartoes = new ExtratoCartoes( extratoCartoesDTO.getDataEntrada(),
                                                            extratoCartoesDTO.getEstabelecimento(),
                                                            extratoCartoesDTO.getCartao(),
                                                            extratoCartoesDTO.getValorLancamento());

        repository.save(extratoCartoes);

        return extratoCartoes;
    }
}

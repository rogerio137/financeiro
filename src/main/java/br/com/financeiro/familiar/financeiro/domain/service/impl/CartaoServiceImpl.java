package br.com.financeiro.familiar.financeiro.domain.service.impl;


import br.com.financeiro.familiar.financeiro.domain.entity.Cartao;
import br.com.financeiro.familiar.financeiro.domain.entity.dto.CartaoDTO;
import br.com.financeiro.familiar.financeiro.domain.repository.CartaoRepository;
import br.com.financeiro.familiar.financeiro.domain.service.CartaoService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class CartaoServiceImpl implements CartaoService {


    private final CartaoRepository repository;


    @Override
    public Cartao salvar(CartaoDTO cartaoDTO) {
        Cartao cartao = new Cartao(cartaoDTO.getBandeira(), cartaoDTO.getBanco(), cartaoDTO.getFechamento(),
                cartaoDTO.getVencimento(), cartaoDTO.getDescricao(), cartaoDTO.getLimite());

        repository.save(cartao);
        return cartao;
    }
}

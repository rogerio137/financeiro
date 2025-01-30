package br.com.financeiro.familiar.financeiro.domain.service;

import br.com.financeiro.familiar.financeiro.domain.entity.Cartao;
import br.com.financeiro.familiar.financeiro.domain.entity.dto.CartaoDTO;
import br.com.financeiro.familiar.financeiro.domain.enums.Banco;
import br.com.financeiro.familiar.financeiro.domain.enums.Bandeira;
import br.com.financeiro.familiar.financeiro.domain.repository.CartaoRepository;
import br.com.financeiro.familiar.financeiro.domain.service.impl.CartaoServiceImpl;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
public class CartaoServiceTest {

    @Mock
    private CartaoRepository cartaoRepository;

    @InjectMocks
    private CartaoServiceImpl cartaoService;

    private Cartao cartao;

    private CartaoDTO cartaoDTO;

    @BeforeEach
    void setUp(){
        cartao = new Cartao(Bandeira.VISA, Banco.NUBANK, "Dia 8", "Dia 15", "Teste de cartao", new BigDecimal(10000.00));
        cartaoDTO = new CartaoDTO(cartao.getBandeira(), cartao.getBanco(), cartao.getFechamento(), cartao.getVencimento(), cartao.getDescricao(), cartao.getLimite());
    }


    @Test
    void teste_DeveSalvarCartao() {
        when(cartaoRepository.save(cartao)).thenReturn(cartao);
        Cartao resultado = cartaoService.salvar(cartaoDTO);
        assertNotNull(resultado);
        assertEquals("Teste de cartao", resultado.getDescricao());
        verify(cartaoRepository, times(1)).save(cartao);
    }
}

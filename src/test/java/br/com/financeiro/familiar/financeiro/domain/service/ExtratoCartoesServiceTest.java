package br.com.financeiro.familiar.financeiro.domain.service;

import br.com.financeiro.familiar.financeiro.domain.entity.Cartao;
import br.com.financeiro.familiar.financeiro.domain.entity.ExtratoCartoes;
import br.com.financeiro.familiar.financeiro.domain.entity.dto.ExtratoCartoesDTO;
import br.com.financeiro.familiar.financeiro.domain.repository.ExtratoCartoesRepository;
import br.com.financeiro.familiar.financeiro.domain.service.impl.ExtratoCartoesImpl;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.UUID;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
public class ExtratoCartoesServiceTest {

    @Mock
    private ExtratoCartoesRepository extratoCartoesRepository;

    @InjectMocks
    private ExtratoCartoesImpl extratoCartoesService;

    private ExtratoCartoes extratoCartoes;

    private ExtratoCartoesDTO extratoCartoesDTO;



    @BeforeEach
    void setUp(){
        UUID uuid = UUID.randomUUID();
        Cartao cartao = new Cartao(uuid);
        extratoCartoes = new ExtratoCartoes(LocalDate.now(),"Teste de estabelecimento", cartao, new BigDecimal(10.00));
        extratoCartoesDTO = new ExtratoCartoesDTO(extratoCartoes.getDataEntrada(), extratoCartoes.getEstabelecimento(), extratoCartoes.getCartao(), extratoCartoes.getValorLancamento());

    }


    @Test
    void teste_DeveSalvarExtrato() {
        when(extratoCartoesRepository.save(extratoCartoes)).thenReturn(extratoCartoes);
        ExtratoCartoes resultado = extratoCartoesService.salvar(extratoCartoesDTO);
        assertNotNull(resultado);
        assertEquals("Teste de estabelecimento", resultado.getEstabelecimento());
        verify(extratoCartoesRepository, times(1)).save(extratoCartoes);
    }
}

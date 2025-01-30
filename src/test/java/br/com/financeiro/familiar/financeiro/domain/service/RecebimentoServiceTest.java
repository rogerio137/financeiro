package br.com.financeiro.familiar.financeiro.domain.service;

import br.com.financeiro.familiar.financeiro.domain.entity.Recebimentos;
import br.com.financeiro.familiar.financeiro.domain.entity.dto.RecebimentosDTO;
import br.com.financeiro.familiar.financeiro.domain.enums.TipoRecebimento;
import br.com.financeiro.familiar.financeiro.domain.repository.RecebimentosRepository;
import br.com.financeiro.familiar.financeiro.domain.service.impl.RecebimentoServiceImpl;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.math.BigDecimal;
import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.mockito.Mockito.*;


@ExtendWith(MockitoExtension.class)
public class RecebimentoServiceTest {

    @Mock
    private RecebimentosRepository recebimentosRepository;

    @InjectMocks
    private RecebimentoServiceImpl recebimentoService;

    private Recebimentos recebimentos;

    private RecebimentosDTO recebimentosDTO;

    @BeforeEach
    void setUp(){
        recebimentos = new Recebimentos(new BigDecimal(2000.00), TipoRecebimento.SALARIO, "Pagamento", LocalDate.now());
        recebimentosDTO = new RecebimentosDTO(recebimentos.getValor(), recebimentos.getTipoRecebimento(), recebimentos.getDescricao(), recebimentos.getDataRecebimento());
    }

    @Test
    void teste_DeveSalvarRecebimentos() {
        when(recebimentosRepository.save(recebimentos)).thenReturn(recebimentos);
        Recebimentos resultado = recebimentoService.salvar(recebimentosDTO);
        assertNotNull(resultado);
        assertEquals("Pagamento", resultado.getDescricao());
        verify(recebimentosRepository, times(1)).save(recebimentos);
    }
}

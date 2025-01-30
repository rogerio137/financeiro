package br.com.financeiro.familiar.financeiro.domain.service;

import br.com.financeiro.familiar.financeiro.domain.entity.Despesa;
import br.com.financeiro.familiar.financeiro.domain.entity.dto.DespesaDTO;
import br.com.financeiro.familiar.financeiro.domain.repository.DespesaRepository;
import br.com.financeiro.familiar.financeiro.domain.service.impl.DespesaServiceImpl;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
public class DespesasServiceTest {

    @Mock
    private DespesaRepository despesaRepository;

    @InjectMocks
    private DespesaServiceImpl despesaService;

    private Despesa despesa;

    private DespesaDTO despesaDTO;


    @BeforeEach
    void setUp(){
        despesa = new Despesa(LocalDate.now(), "Teste de despesas","janeiro");
        despesaDTO = new DespesaDTO(despesa.getData(), despesa.getDescricao(), despesa.getMesReferencia());
    }

    @Test
    void teste_DeveSalvarDespesas() {
        when(despesaRepository.save(despesa)).thenReturn(despesa);
        Despesa resultado = despesaService.salvar(despesaDTO);
        assertNotNull(resultado);
        assertEquals("Teste de despesas", resultado.getDescricao());
        verify(despesaRepository, times(1)).save(despesa);
    }
}

package br.com.financeiro.familiar.financeiro.domain.entity.dto;


import br.com.financeiro.familiar.financeiro.domain.entity.Cartao;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.UUID;

@Data
@NoArgsConstructor
public class ExtratoCartoesDTO {

    private UUID uuid;

    private LocalDate dataEntrada;
    private String estabelecimento;

    private Cartao cartao;

    private BigDecimal valorLancamento;

    public ExtratoCartoesDTO(LocalDate dataEntrada, String estabelecimento, Cartao cartao, BigDecimal valorLancamento) {
        this.dataEntrada = dataEntrada;
        this.estabelecimento = estabelecimento;
        this.cartao = cartao;
        this.valorLancamento = valorLancamento;
    }
}

package br.com.financeiro.familiar.financeiro.domain.entity.dto;

import br.com.financeiro.familiar.financeiro.domain.enums.TipoRecebimento;
import lombok.Data;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.UUID;

@Data
public class RecebimentosDTO {

    private UUID uuid;
    private BigDecimal valor;
    private TipoRecebimento tipoRecebimento;
    private String descricao;
    private LocalDate dataRecebimento;

    public RecebimentosDTO(BigDecimal valor, TipoRecebimento tipoRecebimento, String descricao, LocalDate dataRecebimento) {
        this.valor = valor;
        this.tipoRecebimento = tipoRecebimento;
        this.descricao = descricao;
        this.dataRecebimento = dataRecebimento;
    }
}

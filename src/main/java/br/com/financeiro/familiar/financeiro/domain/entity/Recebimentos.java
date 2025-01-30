package br.com.financeiro.familiar.financeiro.domain.entity;


import br.com.financeiro.familiar.financeiro.domain.enums.TipoRecebimento;
import jakarta.persistence.*;
import lombok.Data;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.UUID;

@Entity(name = "recebimento")
@Table(name = "recebimento")
@Data
public class Recebimentos {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID uuid;

    private BigDecimal valor;

    @Enumerated(EnumType.STRING)
    private TipoRecebimento tipoRecebimento;

    private String descricao;

    private LocalDate dataRecebimento;

    public Recebimentos(BigDecimal valor, TipoRecebimento tipoRecebimento, String descricao, LocalDate dataRecebimento) {
        this.valor = valor;
        this.tipoRecebimento = tipoRecebimento;
        this.descricao = descricao;
        this.dataRecebimento = dataRecebimento;
    }
}

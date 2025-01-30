package br.com.financeiro.familiar.financeiro.domain.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.UUID;

@Data
@Entity
@Table(name = "extrato_cartao")
public class ExtratoCartoes {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID uuid;

    @Column(name = "data-entrada")
    private LocalDate dataEntrada;
    private String estabelecimento;

    @ManyToOne
    @JoinColumn(name = "cartao_uuid")
    private Cartao cartao;

    @Column(name = "valor-lancamento")
    private BigDecimal valorLancamento;

    public ExtratoCartoes(LocalDate dataEntrada, String estabelecimento, Cartao cartao, BigDecimal valorLancamento) {
        this.dataEntrada = dataEntrada;
        this.estabelecimento = estabelecimento;
        this.cartao = cartao;
        this.valorLancamento = valorLancamento;
    }
}

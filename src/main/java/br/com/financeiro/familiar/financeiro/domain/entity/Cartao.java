package br.com.financeiro.familiar.financeiro.domain.entity;

import br.com.financeiro.familiar.financeiro.domain.enums.Banco;
import br.com.financeiro.familiar.financeiro.domain.enums.Bandeira;
import jakarta.persistence.*;
import lombok.Data;

import java.math.BigDecimal;
import java.util.UUID;

@Entity(name = "cartao")
@Table(name = "cartao")
@Data
public class Cartao {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID uuid;

    @Enumerated(EnumType.STRING)
    private Bandeira bandeira;

    @Enumerated(EnumType.STRING)
    private Banco banco;
    private String fechamento;
    private String vencimento;
    private String descricao;
    private BigDecimal limite;

    public Cartao(Bandeira bandeira, Banco banco, String fechamento, String vencimento, String descricao, BigDecimal limite) {
        this.bandeira = bandeira;
        this.banco = banco;
        this.fechamento = fechamento;
        this.vencimento = vencimento;
        this.descricao = descricao;
        this.limite = limite;
    }

    public Cartao(UUID uuid) {
        this.uuid = uuid;
    }
}

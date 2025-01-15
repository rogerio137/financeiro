package br.com.financeiro.familiar.financeiro.domain.entity.dto;


import br.com.financeiro.familiar.financeiro.domain.enums.Banco;
import br.com.financeiro.familiar.financeiro.domain.enums.Bandeira;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.util.UUID;

@Data
@NoArgsConstructor
public class CartaoDTO {

    private UUID uuid;
    private Bandeira bandeira;
    private Banco banco;
    private String fechamento;
    private String vencimento;
    private String descricao;
    private BigDecimal limite;

    public CartaoDTO(Bandeira bandeira, Banco banco, String fechamentom, String vencimento, String descricao, BigDecimal limite){
        this.bandeira = bandeira;
        this.banco = banco;
        this.fechamento = fechamentom;
        this.vencimento = vencimento;
        this.descricao = descricao;
        this.limite = limite;
    }
}

package br.com.financeiro.familiar.financeiro.domain.entity.dto;

import lombok.Data;

import java.time.LocalDate;
import java.util.UUID;

@Data
public class DespesaDTO {

    private UUID uuid;

    private LocalDate data;
    private String descricao;
    private String mesReferencia;

    public DespesaDTO(LocalDate data, String descricao, String mesReferencia) {
        this.data = data;
        this.descricao = descricao;
        this.mesReferencia = mesReferencia;
    }
}

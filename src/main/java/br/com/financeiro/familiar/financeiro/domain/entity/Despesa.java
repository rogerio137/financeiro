package br.com.financeiro.familiar.financeiro.domain.entity;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.util.UUID;

@Entity(name = "despesa")
@Table(name = "despesa")
@NoArgsConstructor
@Data
public class Despesa {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID uuid;

    private LocalDate data;
    private String descricao;
    private String mesReferencia;

    public Despesa(LocalDate data, String descricao, String mesReferencia) {
        this.data = data;
        this.descricao = descricao;
        this.mesReferencia = mesReferencia;
    }
}

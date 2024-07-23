package br.com.financeiro.familiar.financeiro.domain.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.List;
import java.util.UUID;

@Entity
@Table(name = "usuario")
@Data
@AllArgsConstructor
public class Usuario {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;

    private String usuario;

    private String senha;

    @ManyToMany
    private List<Role> roles;
}

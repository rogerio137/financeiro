package br.com.financeiro.familiar.financeiro.domain.entity.dto;

import br.com.financeiro.familiar.financeiro.domain.enums.UsuarioRole;

public record RegisterDTO(String usuario, String senha, UsuarioRole role) {
}

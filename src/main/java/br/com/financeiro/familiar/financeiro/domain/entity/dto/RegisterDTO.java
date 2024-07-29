package br.com.financeiro.familiar.financeiro.domain.entity.dto;

import br.com.financeiro.familiar.financeiro.domain.enums.UserRole;

public record RegisterDTO(String login, String password, UserRole role) {
}

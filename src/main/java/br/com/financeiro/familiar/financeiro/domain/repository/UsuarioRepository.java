package br.com.financeiro.familiar.financeiro.domain.repository;

import br.com.financeiro.familiar.financeiro.domain.entity.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.security.core.userdetails.UserDetails;

public interface UsuarioRepository extends JpaRepository<Usuario, String> {
    UserDetails findByUsuario(String Usuario);
}

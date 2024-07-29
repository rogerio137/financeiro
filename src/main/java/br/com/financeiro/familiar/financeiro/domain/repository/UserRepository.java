package br.com.financeiro.familiar.financeiro.domain.repository;


import br.com.financeiro.familiar.financeiro.domain.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.security.core.userdetails.UserDetails;

public interface UserRepository extends JpaRepository<User, String> {
    UserDetails findByLogin(String login);
}
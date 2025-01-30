package br.com.financeiro.familiar.financeiro.domain.controller;

import br.com.financeiro.familiar.financeiro.domain.entity.Cartao;
import br.com.financeiro.familiar.financeiro.domain.entity.dto.CartaoDTO;
import br.com.financeiro.familiar.financeiro.domain.service.impl.CartaoServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/api/cartao")
public class CartaoController {

    @Autowired
    private CartaoServiceImpl cartaoService;

    public CartaoController(CartaoServiceImpl cartaoService){
        this.cartaoService = cartaoService;
    }

    @PostMapping("/salvar")
    public ResponseEntity<Cartao> salvar(@RequestBody CartaoDTO cartaoDTO){
        cartaoService.salvar(cartaoDTO);
        return ResponseEntity.ok().build();
    }

}

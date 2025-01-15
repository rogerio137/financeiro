package br.com.financeiro.familiar.financeiro.domain.controller;



import br.com.financeiro.familiar.financeiro.domain.entity.ExtratoCartoes;
import br.com.financeiro.familiar.financeiro.domain.entity.dto.ExtratoCartoesDTO;
import br.com.financeiro.familiar.financeiro.domain.service.impl.ExtratoCartoesImpl;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/extrato")
public class ExtratoCartaoController {

    private ExtratoCartoesImpl extratoCartoes;

    public ExtratoCartaoController(ExtratoCartoesImpl extratoCartoes){
        this.extratoCartoes = extratoCartoes;
    }


    @PostMapping("/salvar")
    public ResponseEntity<ExtratoCartoes> salvar(@RequestBody ExtratoCartoesDTO extratoCartoesDTO){
        extratoCartoes.salvar(extratoCartoesDTO);
        return ResponseEntity.ok().build();
    }
}

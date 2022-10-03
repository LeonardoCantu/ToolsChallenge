package com.leonardo.toolsChallenge.controller;

import com.leonardo.toolsChallenge.entity.Transacao;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(IFormaPagamentoController.PATH)
public interface IFormaPagamentoController {
    public static String PATH = "/forma-pagamento";


}

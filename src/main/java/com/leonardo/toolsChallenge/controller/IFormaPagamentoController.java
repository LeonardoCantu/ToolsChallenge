package com.leonardo.toolsChallenge.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(IFormaPagamentoController.PATH)
public interface IFormaPagamentoController {
    public static String PATH = "/forma-pagamento";


}

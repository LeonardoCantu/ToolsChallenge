package com.leonardo.toolsChallenge.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(ITransacaoController.PATH)
public interface IDescricaoController {

    public static String PATH = "/descricao";
}

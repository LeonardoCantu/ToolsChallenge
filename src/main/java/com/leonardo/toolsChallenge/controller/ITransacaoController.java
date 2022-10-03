package com.leonardo.toolsChallenge.controller;

import com.leonardo.toolsChallenge.entity.Transacao;
import com.leonardo.toolsChallenge.pattern.constants.OperationParam;
import com.leonardo.toolsChallenge.pattern.constants.OperationPath;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
@RestController
@RequestMapping(ITransacaoController.PATH)
public interface ITransacaoController {
    public static String PATH = "/transacao";



}

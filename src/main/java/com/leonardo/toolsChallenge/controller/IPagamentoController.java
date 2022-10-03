package com.leonardo.toolsChallenge.controller;

import com.leonardo.toolsChallenge.entity.Pagamento;
import com.leonardo.toolsChallenge.entity.Transacao;
import com.leonardo.toolsChallenge.pattern.constants.OperationParam;
import com.leonardo.toolsChallenge.pattern.constants.OperationPath;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
@RestController
@RequestMapping(IPagamentoController.PATH)
public interface IPagamentoController {

    public static String PATH = "/pagamento";

    @PostMapping
    @CacheEvict
    @ResponseStatus(HttpStatus.CREATED)
    void incluir(@RequestBody Pagamento pagamento);

    @PutMapping(OperationPath.ID + "/pagamento")
    @CacheEvict
    @ResponseStatus(HttpStatus.OK)
    Pagamento pagamento(@RequestBody Pagamento pagamento, @PathVariable(OperationParam.ID) Integer idTransacao);

}

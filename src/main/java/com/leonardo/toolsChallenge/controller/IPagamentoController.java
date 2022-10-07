package com.leonardo.toolsChallenge.controller;

import com.leonardo.toolsChallenge.model.Pagamento;
import com.leonardo.toolsChallenge.pattern.constants.OperationParam;
import com.leonardo.toolsChallenge.pattern.constants.OperationPath;
import jdk.nashorn.internal.objects.annotations.Getter;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping(IPagamentoController.PATH)
public interface IPagamentoController {

    public static String PATH = "/pagamento";

    @PostMapping
    @CacheEvict
    @ResponseStatus(HttpStatus.CREATED)
    Pagamento incluir(@RequestBody Pagamento pagamento);

    @PutMapping(OperationPath.ID + "/estornar")
    @CacheEvict
    @ResponseStatus(HttpStatus.OK)
    Pagamento estornar(@PathVariable(OperationParam.ID) Long idPagamento);

    @GetMapping(OperationPath.ID)
    @CacheEvict
    @ResponseStatus(HttpStatus.OK)
    Pagamento buscarPorId(@PathVariable("id") Long idPagamento);

    @GetMapping
    @CacheEvict
    @ResponseStatus(HttpStatus.OK)
    List<Pagamento> buscarTodos();

}

package com.leonardo.toolsChallenge.controller.impl;

import com.leonardo.toolsChallenge.controller.IPagamentoController;
import com.leonardo.toolsChallenge.entity.Pagamento;
import com.leonardo.toolsChallenge.service.IPagamentoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PagamentoController implements IPagamentoController {

    @Autowired
    private IPagamentoService pagamentoService;

    @Override
    public void incluir(Pagamento pagamento) {
        System.out.println("teste");
    }

    @Override
    public Pagamento pagamento(Pagamento pagamento, Integer idPagamento) {
        return pagamentoService.pagamento(pagamento);
    }
}

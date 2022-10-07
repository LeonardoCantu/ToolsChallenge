package com.leonardo.toolsChallenge.controller.impl;

import com.leonardo.toolsChallenge.controller.IPagamentoController;
import com.leonardo.toolsChallenge.model.Pagamento;
import com.leonardo.toolsChallenge.service.IPagamentoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class PagamentoController implements IPagamentoController {

    @Autowired
    private IPagamentoService pagamentoService;

    @Override
    public Pagamento incluir(Pagamento pagamento) {
        return pagamentoService.incluir(pagamento);
    }

    @Override
    public Pagamento estornar( Long idPagamento) {
        return pagamentoService.estornar(idPagamento);
    }

    @Override
    public Pagamento buscarPorId(Long idPagamento) {
        return pagamentoService.buscarPorId(idPagamento);
    }

    @Override
    public List<Pagamento> buscarTodos() {
        return pagamentoService.buscarTodos();
    }
}

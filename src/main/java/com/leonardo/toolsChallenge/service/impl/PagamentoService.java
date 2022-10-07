package com.leonardo.toolsChallenge.service.impl;

import com.leonardo.toolsChallenge.model.Pagamento;
import com.leonardo.toolsChallenge.repository.IPagamentoRepository;
import com.leonardo.toolsChallenge.service.GenericService;
import com.leonardo.toolsChallenge.service.IPagamentoService;
import com.leonardo.toolsChallenge.validator.PagamentoValidator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PagamentoService extends GenericService<Pagamento, Long, IPagamentoRepository> implements IPagamentoService {

    @Autowired
    TransacaoService transacaoService;
    @Autowired
    IPagamentoRepository pagamentoRepository;

    PagamentoValidator pagamentoValidator = new PagamentoValidator();


    @Override
    public Pagamento buscarPorId(Long idPagamento) {
        return findById(idPagamento);
    }

    @Override
    public List<Pagamento> buscarTodos() {
        return pagamentoRepository.findAll();
    }

    @Override
    public Pagamento estornar(Long idPagamento) {
        Pagamento pagamento = findById(idPagamento);

        estorarTrasacao(pagamento);

        return pagamento;
    }

    private void estorarTrasacao(Pagamento pagamento) {
        transacaoService.estornar(pagamento.getTransacao());
    }

    @Override
    public Pagamento incluir(Pagamento pagamento) {
        pagamentoValidator.validarCamposRequeridos(pagamento);

        incluirTransacao(pagamento);

        return pagamentoRepository.save(pagamento);
    }

    private void incluirTransacao(Pagamento pagamento) {
        transacaoService.incluir(pagamento);
    }


}

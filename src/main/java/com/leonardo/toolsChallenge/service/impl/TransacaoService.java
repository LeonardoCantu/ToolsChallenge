package com.leonardo.toolsChallenge.service.impl;

import com.leonardo.toolsChallenge.model.Pagamento;
import com.leonardo.toolsChallenge.model.Transacao;
import com.leonardo.toolsChallenge.repository.ITransacaoRepository;
import com.leonardo.toolsChallenge.service.ITransacaoService;
import com.leonardo.toolsChallenge.validator.TransacaoValidator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TransacaoService implements ITransacaoService {

    @Autowired
    DescricaoService descricaoService;

    @Autowired
    FormaPagamentoService formaPagamentoService;
    @Autowired
    ITransacaoRepository transacaoRepository;
    TransacaoValidator transacaoValidator = new TransacaoValidator();

    @Override
    public Transacao incluir(Transacao transacao) {
        incluirTransacao(transacao);
        return transacaoRepository.save(transacao);
    }

    @Override
    public void incluir(Pagamento pagamento) {
        incluirTransacao(pagamento.getTransacao());

    }

    private void incluirTransacao(Transacao transacao) {
        transacaoValidator.validarCamposRequeridos(transacao);
        incluirDescricao(transacao);
        incluirPagamento(transacao);
    }

    private void incluirDescricao(Transacao transacao) {
        descricaoService.incluir(transacao);
    }

    private void incluirPagamento(Transacao transacao) {
        formaPagamentoService.incluir(transacao);
    }

    @Override
    public void estornar(Transacao transacao) {
        descricaoService.cancelar(transacao.getDescricao());
    }
}

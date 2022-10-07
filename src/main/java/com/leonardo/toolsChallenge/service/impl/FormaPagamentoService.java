package com.leonardo.toolsChallenge.service.impl;

import com.leonardo.toolsChallenge.model.FormaPagamento;
import com.leonardo.toolsChallenge.model.Transacao;
import com.leonardo.toolsChallenge.repository.IFormaPagamentoRepository;
import com.leonardo.toolsChallenge.service.IFormaPagamentoService;
import com.leonardo.toolsChallenge.validator.FormaPagamentoValidator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.xml.ws.soap.Addressing;

@Service
public class FormaPagamentoService implements IFormaPagamentoService {

    @Autowired
    IFormaPagamentoRepository formaPagamentoRepository;

    FormaPagamentoValidator formaPagamentoValidator = new FormaPagamentoValidator();

    @Override
    public FormaPagamento incluir(FormaPagamento formaPagamento) {
        incluirFormaPagamento(formaPagamento);
        return formaPagamentoRepository.save(formaPagamento);
    }

    @Override
    public void incluir(Transacao transacao) {
        incluirFormaPagamento(transacao.getFormaPagamento());
    }

    private void incluirFormaPagamento(FormaPagamento formaPagamento) {
        formaPagamentoValidator.validarCamposRequeridos(formaPagamento);
    }

}

package com.leonardo.toolsChallenge.service;

import com.leonardo.toolsChallenge.model.FormaPagamento;
import com.leonardo.toolsChallenge.model.Transacao;
import org.springframework.stereotype.Service;

@Service
public interface IFormaPagamentoService {

    FormaPagamento incluir(FormaPagamento transacao);
    void incluir(Transacao transacao);


}

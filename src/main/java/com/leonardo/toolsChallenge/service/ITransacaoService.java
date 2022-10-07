package com.leonardo.toolsChallenge.service;

import com.leonardo.toolsChallenge.model.Pagamento;
import com.leonardo.toolsChallenge.model.Transacao;
import org.springframework.stereotype.Service;

@Service
public interface ITransacaoService {

    Transacao incluir(Transacao transacao);
    void incluir(Pagamento pagamento);

    void estornar(Transacao transacao);
}

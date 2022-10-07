package com.leonardo.toolsChallenge.service;

import com.leonardo.toolsChallenge.model.Descricao;
import com.leonardo.toolsChallenge.model.Transacao;
import org.springframework.stereotype.Service;

@Service
public interface IDescricaoService {
    Descricao incluir(Descricao descricao);
    void incluir(Transacao transacao);

    void cancelar(Descricao descricao);

}

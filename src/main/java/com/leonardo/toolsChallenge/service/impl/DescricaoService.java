package com.leonardo.toolsChallenge.service.impl;

import com.leonardo.toolsChallenge.enums.EnumStatusTransacao;
import com.leonardo.toolsChallenge.model.Descricao;
import com.leonardo.toolsChallenge.model.Transacao;
import com.leonardo.toolsChallenge.repository.IDescricaoRepository;
import com.leonardo.toolsChallenge.service.IDescricaoService;
import com.leonardo.toolsChallenge.validator.DescricaoValidator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DescricaoService implements IDescricaoService {

    DescricaoValidator descricaoValidator = new DescricaoValidator();

    @Autowired
    IDescricaoRepository descricaoRepository;

    @Override
    public Descricao incluir(Descricao descricao) {
        incluirDescricao(descricao);
        return descricaoRepository.save(descricao);
    }

    @Override
    public void incluir(Transacao transacao) {
        incluirDescricao(transacao.getDescricao());
    }

    private void incluirDescricao(Descricao descricao) {
        descricaoValidator.validarCamposRequeridos(descricao);

    }

    @Override
    public void cancelar(Descricao descricao) {
        descricaoValidator.validarPagamentoPodeSerEstorando(descricao);

        descricao.setStatus(EnumStatusTransacao.CANCELADO);

        descricaoRepository.save(descricao);
    }
}

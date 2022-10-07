package com.leonardo.toolsChallenge.service;

import com.leonardo.toolsChallenge.model.Pagamento;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface IPagamentoService {

    Pagamento estornar(Long idPagamento);

    Pagamento incluir(Pagamento pagamento);

    Pagamento buscarPorId(Long idPagamento);

    List<Pagamento> buscarTodos();

}

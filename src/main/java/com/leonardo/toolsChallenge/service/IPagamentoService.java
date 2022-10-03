package com.leonardo.toolsChallenge.service;

import com.leonardo.toolsChallenge.entity.Pagamento;
import org.springframework.stereotype.Service;

@Service
public interface IPagamentoService {

    Pagamento pagamento(Pagamento pagamento);

}

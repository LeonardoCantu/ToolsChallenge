package com.leonardo.toolsChallenge.repository;

import com.leonardo.toolsChallenge.entity.FormaPagamento;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IFormaPagamentoRepository extends JpaRepository<FormaPagamento, Long> {
}

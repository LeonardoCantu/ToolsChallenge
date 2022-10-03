package com.leonardo.toolsChallenge.repository;

import com.leonardo.toolsChallenge.entity.Pagamento;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IPagamentoRepository extends JpaRepository<Pagamento, Long> {
}

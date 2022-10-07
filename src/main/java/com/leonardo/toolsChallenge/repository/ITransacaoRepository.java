package com.leonardo.toolsChallenge.repository;

import com.leonardo.toolsChallenge.model.Transacao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ITransacaoRepository extends JpaRepository<Transacao, Long> {
}

package com.leonardo.toolsChallenge.repository;

import com.leonardo.toolsChallenge.entity.Descricao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IDescricaoRepository extends JpaRepository<Descricao, Long> {
}

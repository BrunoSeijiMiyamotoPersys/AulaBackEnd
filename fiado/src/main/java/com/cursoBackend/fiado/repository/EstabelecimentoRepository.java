package com.cursoBackend.fiado.repository;

import com.cursoBackend.fiado.domain.Estabelecimento;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface EstabelecimentoRepository extends JpaRepository<Estabelecimento, UUID> {

}

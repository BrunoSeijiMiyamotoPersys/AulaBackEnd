package com.cursoBackend.fiado.repository;

import com.cursoBackend.fiado.domain.CompraFiada;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface CompraFiadaRepository extends JpaRepository<CompraFiada, UUID> {
}

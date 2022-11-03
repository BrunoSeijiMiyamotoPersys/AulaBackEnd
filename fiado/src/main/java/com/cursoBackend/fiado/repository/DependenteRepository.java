package com.cursoBackend.fiado.repository;

import com.cursoBackend.fiado.domain.Dependente;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface DependenteRepository extends JpaRepository<Dependente, UUID> {
}

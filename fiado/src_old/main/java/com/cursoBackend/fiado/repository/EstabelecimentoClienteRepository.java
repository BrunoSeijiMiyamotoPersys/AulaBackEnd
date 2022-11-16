package com.cursoBackend.fiado.repository;

import com.cursoBackend.fiado.domain.Estabelecimento;
import com.cursoBackend.fiado.domain.EstabelecimentoCliente;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;


public interface EstabelecimentoClienteRepository extends JpaRepository<EstabelecimentoCliente, UUID> {

	
  
}

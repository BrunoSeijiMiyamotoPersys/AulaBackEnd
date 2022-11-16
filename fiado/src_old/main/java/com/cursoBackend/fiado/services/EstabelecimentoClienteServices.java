package com.cursoBackend.fiado.services;

import com.cursoBackend.fiado.domain.Cliente;
import com.cursoBackend.fiado.domain.Estabelecimento;
import com.cursoBackend.fiado.domain.EstabelecimentoCliente;
import com.cursoBackend.fiado.dto.EstabelecimentoDto;
import com.cursoBackend.fiado.repository.EstabelecimentoClienteRepository;
import com.cursoBackend.fiado.repository.EstabelecimentoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EstabelecimentoClienteServices {
	
	
	@Autowired
	private EstabelecimentoClienteRepository estabelecimentoClienteRepository;

	
	public EstabelecimentoCliente save(Cliente cliente, Estabelecimento estabelecimento) {
		EstabelecimentoCliente ec = new EstabelecimentoCliente();
		ec.setCliente(cliente);
		ec.setEstabelecimento(estabelecimento);
		
		return estabelecimentoClienteRepository.save(ec);
	}

}

package com.cursoBackend.fiado.controller;


import com.cursoBackend.fiado.domain.Cliente;
import com.cursoBackend.fiado.domain.Estabelecimento;
import com.cursoBackend.fiado.domain.EstabelecimentoCliente;
import com.cursoBackend.fiado.services.ClienteServices;
import com.cursoBackend.fiado.services.EstabelecimentoClienteServices;
import com.cursoBackend.fiado.services.EstabelecimentoServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;
import java.util.UUID;


@RestController
@RequestMapping(path = "api/estabelecimentocliente")
public class EstabelecimentoClienteController {
	
	@Autowired
	private EstabelecimentoClienteServices estabelecimentoClienteServices;
	@Autowired
	private EstabelecimentoServices estabelecimentoServices;
	@Autowired
	private ClienteServices clienteServices;
	
	@PostMapping(path = "api/estabelecimento/create")
	public ResponseEntity<Object> create(
						@RequestParam UUID estabelecimentoID,
						@RequestParam UUID clientID) {
		Optional<Cliente> optionalCliente = clienteServices.findById(clientID);
		Optional<Estabelecimento> optionalEstabelecimento = estabelecimentoServices.findById(estabelecimentoID);

		if (!optionalCliente.isPresent()) {
			return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Cliente não existe na base de dados");
		}

		if (!optionalEstabelecimento.isPresent()) {
			return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Estabelecimento não existe na base de dados");
		}

		return ResponseEntity.status(HttpStatus.OK).body("");
	}

//	@DeleteMapping(path = "{estabelecimentoId}/cliente/{clienteId}")
//	public ResponseEntity<Object> deleteCliente(
//			@RequestParam UUID estabelecimentoId,
//			@RequestParam UUID clientId) {
//		Optional<EstabelecimentoCliente> optionalEC = estabelecimentoClienteServices.findByEstabelecimentoAndCliente(estabelecimentoID, clienteID);
//
//		if (!optionalEC.isPresent()) {
//			return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Cliente não existe na base de dados");
//		}
//		//estabelecimentoClienteServices
//		return ResponseEntity.status(HttpStatus.OK).body("");
//	}

}

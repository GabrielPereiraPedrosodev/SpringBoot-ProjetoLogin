package com.gabriel.br.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.gabriel.br.entities.Usuario;
import com.gabriel.br.service.LoguinService;

@RestController
@RequestMapping("/login")
public class LoginController {
	
	private LoguinService loginservice;
	
	@PostMapping
	public ResponseEntity<String> login (@RequestBody Usuario usuario){
	boolean isValid = loginservice.validarLogin(usuario);
	if(isValid) {
		return ResponseEntity.ok("Login bem sucedido");
	}else {
		return ResponseEntity.status(401).body("credenciais invalidas");
	 }
	
	}

}

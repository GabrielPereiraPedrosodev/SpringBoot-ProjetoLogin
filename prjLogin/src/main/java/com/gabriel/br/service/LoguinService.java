package com.gabriel.br.service;

import org.springframework.stereotype.Service;

import com.gabriel.br.entities.Usuario;
@Service
public class LoguinService {
	
	public boolean validarLogin(Usuario usuario) {
		return "admin".equals(usuario.getUsername()) && "1234".equals(usuario.getPassword());
	}

}

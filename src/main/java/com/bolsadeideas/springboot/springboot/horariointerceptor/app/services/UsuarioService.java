package com.bolsadeideas.springboot.springboot.horariointerceptor.app.services;

import com.bolsadeideas.springboot.springboot.horariointerceptor.app.models.domain.Usuario;

import java.util.List;

public interface UsuarioService {
	public List<Usuario> listar();

	public Usuario obtenerPorId(Integer id);

}



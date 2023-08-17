package com.bolsadeideas.springboot.springboot.horariointerceptor.app.services;

import com.bolsadeideas.springboot.springboot.horariointerceptor.app.models.domain.Usuario;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UsuarioServiceImpl implements UsuarioService {

	private List<Usuario> lista;

	public UsuarioServiceImpl() {
		this.lista = new ArrayList<>();
		this.lista.add(new Usuario(1, "Andrés", "Gúzman"));
		this.lista.add(new Usuario(2, "Pablo", "Millán"));
		this.lista.add(new Usuario(3, "Sergio", "Hernández"));
		this.lista.add(new Usuario(4, "Adrián", "Doblas"));
		this.lista.add(new Usuario(5, "Paco", "Robles"));
		this.lista.add(new Usuario(6, "Esteban", "Gascón"));
	}

	@Override public List<Usuario> listar() {
		return this.lista;
	}

	@Override public Usuario obtenerPorId(Integer id) {
		Usuario resultado = null;
		for (Usuario u : this.lista) {
			if (u.getId().equals(id)) {
				resultado = u;
				break;
			}
		}
		return resultado;
	}
}

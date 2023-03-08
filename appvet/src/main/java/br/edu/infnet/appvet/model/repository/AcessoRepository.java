package br.edu.infnet.appvet.model.repository;

import br.edu.infnet.appvet.model.domain.Usuario;

public class AcessoRepository {

	public static Usuario autenticar(Usuario usuario) {
		
		if(usuario.getEmail().equalsIgnoreCase(usuario.getSenha())) {
			return new Usuario("Administrador", usuario.getEmail(), usuario.getSenha());
		}
		return null;
	}
}

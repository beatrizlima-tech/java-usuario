package entities;

import java.util.UUID;

import enums.ClassificacaoUsuario;

/*
 * Entidade responsável por representar um usuário no sistema.
 */

public class Usuario {

	// Definição da classe usuário

	private UUID id;
	private String login;
	private String senha;
	private ClassificacaoUsuario classificacaoUsuario;

	public UUID getId() {
		return id;
	}

	public String getLogin() {
		return login;
	}

	public String getSenha() {
		return senha;
	}

	public void setId(UUID id) {
		this.id = id;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public ClassificacaoUsuario getClassificacaoUsuario() {
		return classificacaoUsuario;
	}

	public void setClassificacaoUsuario(ClassificacaoUsuario classificacaoUsuario) {
		this.classificacaoUsuario = classificacaoUsuario;
	}

	
	
}

package main;

import controllers.UsuarioController;

/*
 * Classe principal da aplicação
 * Responsável por iniciar o sistema chamado o controller
 */
public class Main {

	
	public static void main(String[] args) {
		
		// Criando um objeto (instância) da classe UsuarioController
		var usuarioController = new UsuarioController();
		
		// Chamando o método responsável por cadastrar o usuário
		usuarioController.cadastrarUsuario();
		
		
				
		
	}
}

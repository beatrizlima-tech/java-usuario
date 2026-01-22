package controllers;

import java.util.UUID;

import javax.swing.JOptionPane;

import entities.PessoaFisica;
import entities.PessoaJuridica;
import entities.Usuario;
import repositories.UsuarioRepository;

// Centraliza as ações de cadastro relacionadas ao usuário.

public class UsuarioController {

	// Método principal que gerencia o fluxo de cadastro do usuário.
	public void cadastrarUsuario() {
		
		// Criação do objeto (instância) do usuário
		var usuario = new Usuario();
		
		usuario.setId(UUID.randomUUID());
		
		usuario.setLogin(
						JOptionPane.showInputDialog
					("Informe o login:")
				);
		usuario.setSenha(
						JOptionPane.showInputDialog
					("Informe a senha:")
				);
		
		var usuarioRepository = new UsuarioRepository();
		usuarioRepository.exportarUsuarioXML(usuario);
		
		var classificacao = JOptionPane.showInputDialog("""
				Informe a classificação do usuário:
				(1) Operador
				(2) Administrador
				""");
		
		switch (classificacao) {
		case "1":
			cadastrarOperador();
			break;

		case "2":
			cadastrarAdministrador();
			break;

		default:
			System.out.println("TIPO DE USUÁRIO INVÁLIDO");
			return;
		}

	} 
	
	 // Define o fluxo de cadastro para o perfil do operador.
	public void cadastrarOperador() {
		// Etapa responsável por identificar o tipo de pessoa do usuário
		tipo();
	}
	
	// Define o fluxo de cadastro para o perfil administrador.
	public void cadastrarAdministrador() {
		// Etapa responsável por identificar o tipo de pessoa do usuário
		tipo();
	}
	
	public void tipo() {
		var tipo = JOptionPane.showInputDialog("""
				Informe o tipo de usuário
				(1) Pessoa Física
				(2) Pessoa Jurídica
				""");

		switch (tipo) {
		case "1":
			cadastrarPessoaFisica();
			break;

		case "2":
			cadastrarPessoaJuridica();
			break;

		default:
			System.out.println("TIPO DE USUÁRIO INVÁLIDO");
			return;
		}

	} 

	// Coleta e salva os dados específicos de pessoa física
	public void cadastrarPessoaFisica() {
		
		
		try {
			var pessoaFisica = new PessoaFisica();

			pessoaFisica.setNome(
					JOptionPane.showInputDialog("Informe o nome do usuário:")
			);

			pessoaFisica.setCpf(
					JOptionPane.showInputDialog("Infome o cpf:")
			);

			var usuarioRepository = new UsuarioRepository();
			usuarioRepository.exportarPessoaFisicaXML(pessoaFisica);

		} catch (Exception e) {
			System.out.println("ERRO AO CADASTRAR PESSOA FÍSICA!");
		}
	}

	// Coleta e salva os dados específicios de pessoa jurídica
	public void cadastrarPessoaJuridica() {

		try {
			var pessoaJuridica = new PessoaJuridica();

			pessoaJuridica.setRazaoSocial(
					JOptionPane.showInputDialog("Informe a razão social:")
			);

			pessoaJuridica.setCnpj(
					JOptionPane.showInputDialog("Informe o cnpj:")
			);

			var usuarioRepository = new UsuarioRepository();
			usuarioRepository.exportarPessoaJuridicaXML(pessoaJuridica);

		} catch (Exception e) {
			System.out.println("ERRO AO CADASTRAR PESSOA JURÍDICA");
		}
	}
}

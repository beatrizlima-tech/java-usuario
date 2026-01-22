package repositories;

import entities.PessoaFisica;
import entities.PessoaJuridica;
import entities.Usuario;

public class UsuarioRepository {

	/*
	 * Método para exportar os dados do usuário
	 * para um arquivo de extensão
	 * .XML
	 */

	public void exportarUsuarioXML(Usuario usuario) {
		
		try {
			
			// Criando um arquivo na máquina local 
			
			var printWriter = new java.io.PrintWriter
					("c:\\temp\\usuario_"
							+ usuario.getId() + ".xml");
			
			// Criando o conteúdo do arquivo XML
			
			printWriter.write("<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n");
			
			printWriter.write("<usuario>\n");
			printWriter.write("   <id>" + usuario.getId() + "</id>\n");
			printWriter.write("   <login>" + usuario.getLogin() + "</login>\n");
			printWriter.write("   <senha>" + usuario.getSenha() + "</senha>\n");
			
			printWriter.write("</usuario>");
			
			// Fechando o arquivo
			printWriter.close();
			
			System.out.println("\nUSUÁRIO CADASTRADO COM SUCESSO!");
		}
		
		catch (Exception e) {
			System.out.println("\nERRO AO EXPORTAR DADOS DO USUÁRIO!");
		}
	}
	
	public void exportarPessoaFisicaXML(PessoaFisica pessoaFisica) {
		
		try {
			
			// Criando um arquivo na máquina local 
			
			var printWriter = new java.io.PrintWriter
					("c:\\temp\\PessoaFisica_"
							+ pessoaFisica.getId() + ".xml");
			
			// Criando o conteúdo do arquivo XML
			
			printWriter.write("<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n");
			
			printWriter.write("<pessoafisica>\n");
			printWriter.write("   <nome>" + pessoaFisica.getNome() + "</nome>\n");
			printWriter.write("   <cpf>" + pessoaFisica.getCpf() + "</cpf>\n");
			
			printWriter.write("</pessoaFisica>");
			
			// Fechando o arquivo
			printWriter.close();
			
			System.out.println("\nUSUÁRIO CADASTRADO COM SUCESSO!");
		}
		
		catch (Exception e) {
			System.out.println("\nERRO AO EXPORTAR DADOS DO USUÁRIO!");
		}
	}
	
	
	public void exportarPessoaJuridicaXML(PessoaJuridica pessoaJuridica) {
		
		try {
			
			// Criando um arquivo na máquina local 
			
			var printWriter = new java.io.PrintWriter
					("c:\\temp\\pessoaJuridica_"
							+ pessoaJuridica.getId() + ".xml");
			
			// Criando o conteúdo do arquivo XML
			
			printWriter.write("<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n");
			
			printWriter.write("<pessoajuridica>\n");
			printWriter.write("   <razaoSocial>" + pessoaJuridica.getRazaoSocial() + "</razaoSocial>\n");
			printWriter.write("   <cnpj>" + pessoaJuridica.getCnpj() + "</cnpj>\n");
			
			printWriter.write("</pessoaJuridica>");
			
			// Fechando o arquivo
			printWriter.close();
			
			System.out.println("\nUSUÁRIO CADASTRADO COM SUCESSO!");
		}
		
		catch (Exception e) {
			System.out.println("\nERRO AO EXPORTAR DADOS DO USUÁRIO!");
		}
	}
	
	
}

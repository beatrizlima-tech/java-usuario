package entities;

/*
 * PessoaFisica herda do usuário para retutiliar os
 * dados comundo a todos os usuários.
 * Relação herança: PessoaFisica É-UM Usuario.
 */

public class PessoaFisica extends Usuario {

	private String nome;
	private String cpf;

	public String getNome() {
		return nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

}

package entities;

/*
 * PessoaJuridica herda do usuário para retutiliar os
 * dados comundo a todos os usuários.
 * Relação herança: PessoaJuridica É-UM Usuario.
 */

public class PessoaJuridica extends Usuario {

	private String razaoSocial;
	private String cnpj;
	public String getRazaoSocial() {
		return razaoSocial;
	}
	public String getCnpj() {
		return cnpj;
	}
	public void setRazaoSocial(String razaoSocial) {
		this.razaoSocial = razaoSocial;
	}
	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}
	
	
	
}

package br.com.poo.entidades;

public class Usuario {

	private String nomePessoa;
	private String nomeUsuario;
	private String senha;
	private String email;
	private int telefone;

	public String getNomePessoa() {
		return nomePessoa;
	}

	public void setNomePessoa(String nomePessoa) {
		this.nomePessoa = nomePessoa;
	}

	public String getNomeUsuario() {
		return nomeUsuario;
	}

	public void setNomeUsuario(String nomeUsuario) {
		this.nomeUsuario = nomeUsuario;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getTelefone() {
		return telefone;
	}

	public void setTelefone(int telefone) {
		this.telefone = telefone;
	}
	
	public void exibeUsuario() {
		System.out.println("***DADOS DO USUÁRIO***\n");
		System.out.println("Nome: " + this.nomePessoa);
		System.out.println("E-mail: " + this.email);
		System.out.println("Telefone: " + this.telefone);
	}
	
}

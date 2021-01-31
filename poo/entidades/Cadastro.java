package br.com.poo.entidades;

import java.util.ArrayList; 

import br.com.poo.absclass.DadosUsuario;

public class Cadastro extends DadosUsuario {

	ArrayList<Usuario> lista = new ArrayList<>(); 
	
	@Override
	public void addUsuario(Usuario usuario) {
		
		lista.add(usuario);
		
	}

	@Override
	public void exibeParaGerente(Usuario usuario) {
		
		for(Usuario u: lista) {
			
			System.out.println("Nome de usuário: " + u.getNomeUsuario());
			System.out.println("Nome commpleto: " + u.getNomePessoa());
			System.out.println("Telefone: " + u.getTelefone());
			
		}
	}
	
	
	public int retornaTamanho() {
		
		return lista.size();
	}

	
}

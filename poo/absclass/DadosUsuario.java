package br.com.poo.absclass;

import br.com.poo.entidades.Usuario;

public abstract class DadosUsuario {
	
	public abstract void addUsuario(Usuario usuario);
	public abstract void exibeParaGerente(Usuario usuario);
	public abstract int retornaTamanho();
	
}

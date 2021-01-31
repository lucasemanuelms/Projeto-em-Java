package br.com.poo.menus;


public class Resumo{

	public MenuEsportes menuEsportes;
	public MenuAmbiente menuAmbiente;
	public MenuData menuHorario;
	
	public Resumo() {
		menuEsportes = new MenuEsportes();
		menuAmbiente = new MenuAmbiente();
		menuHorario = new MenuData();
	}
	
	public void exibirResumo() {
		System.out.println();
		System.out.println("***RESUMO DOS DADOS***\n");
		menuEsportes.exibirDEsportes();
		menuAmbiente.exibirDAmbiente();
		menuHorario.exibirDHorario();
	}
	
}

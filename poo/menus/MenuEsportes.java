package br.com.poo.menus;

public class MenuEsportes {

	private int modalidade;
	
	public void exibirEsportes() {
		System.out.println();
		System.out.println("***Selec�o de Modalidade***\n");
		System.out.println("[1] Basquete");
		System.out.println("[2] Futsal");
		System.out.println("[3] Handball");
		System.out.println("[4] V�lei");
		System.out.printf("\nDigite o n�mero da modalidade: ");
	}
	
	public void setModalidade(int modalidade) {
		this.modalidade = modalidade;
	}
	
	public int getModalidade() {
		return modalidade;
	}
	
	public void exibirDEsportes() {
		
		switch(modalidade) {
		case 1:
			System.out.println("O esporte selecionado �: " + "Basquete");break;
		case 2:
			System.out.println("O esporte selecionado �: " + "Futsal");break;
		case 3:
			System.out.println("O esporte selecionado �: " + "Handball");break;
		case 4:
			System.out.println("O esporte selecionado �: " + "V�lei");break;
		default:
			System.out.println("Op��o de esporte inv�lida!");break;
		}
		
	}
	
}

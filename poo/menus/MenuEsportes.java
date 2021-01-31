package br.com.poo.menus;

public class MenuEsportes {

	private int modalidade;
	
	public void exibirEsportes() {
		System.out.println();
		System.out.println("***Selecão de Modalidade***\n");
		System.out.println("[1] Basquete");
		System.out.println("[2] Futsal");
		System.out.println("[3] Handball");
		System.out.println("[4] Vôlei");
		System.out.printf("\nDigite o número da modalidade: ");
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
			System.out.println("O esporte selecionado é: " + "Basquete");break;
		case 2:
			System.out.println("O esporte selecionado é: " + "Futsal");break;
		case 3:
			System.out.println("O esporte selecionado é: " + "Handball");break;
		case 4:
			System.out.println("O esporte selecionado é: " + "Vôlei");break;
		default:
			System.out.println("Opção de esporte inválida!");break;
		}
		
	}
	
}

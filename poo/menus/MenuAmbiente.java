package br.com.poo.menus;

public class MenuAmbiente {

	private int quadra;
	
	public void exibirAmbientes() {
		System.out.println();
		System.out.println("***Selec�o da Quadra***\n");
		System.out.println("[1] Quadra 1");
		System.out.println("[2] Quadra 2");
		System.out.println("[3] Quadra 3");
		System.out.println("[4] Quadra 4");
		System.out.printf("\nDigite o n�mero da quadra: ");
	}

	public void setQuadra(int quadra) {
		this.quadra = quadra;
	}
	
	public int getQuadra() {
		return quadra;
	}

	public void exibirDAmbiente() {
		switch(quadra) {
		case 1:
			System.out.println("A quadra selecionada �: " + "Quadra 1");break;
		case 2:
			System.out.println("A quadra selecionada �: " + "Quadra 2");break;
		case 3:
			System.out.println("A quadra selecionada �: " + "Quadra 3");break;
		case 4:
			System.out.println("A quadra selecionada �: " + "Quadra 4");break;
		default:
			System.out.println("Op��o de quadra inv�lida!");break;
		}
		
	}
	
}

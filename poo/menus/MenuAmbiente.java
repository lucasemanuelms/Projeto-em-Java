package br.com.poo.menus;

public class MenuAmbiente {

	private int quadra;
	
	public void exibirAmbientes() {
		System.out.println();
		System.out.println("***Selecão da Quadra***\n");
		System.out.println("[1] Quadra 1");
		System.out.println("[2] Quadra 2");
		System.out.println("[3] Quadra 3");
		System.out.println("[4] Quadra 4");
		System.out.printf("\nDigite o número da quadra: ");
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
			System.out.println("A quadra selecionada é: " + "Quadra 1");break;
		case 2:
			System.out.println("A quadra selecionada é: " + "Quadra 2");break;
		case 3:
			System.out.println("A quadra selecionada é: " + "Quadra 3");break;
		case 4:
			System.out.println("A quadra selecionada é: " + "Quadra 4");break;
		default:
			System.out.println("Opção de quadra inválida!");break;
		}
		
	}
	
}

package br.com.poo.entidades;

public class ApresentacaoInicial {
	
	public void exibir() {
		System.out.println("#### SpotSpace ####");
		System.out.println();
		System.out.println("O SportSpace é um sistema de locação de ambientes para a prática de esportes.\n"
				+ "Tem como objetivo facilitar a organização da locação do espaço, definição de horários, seleção de modalidades etc.");
		System.out.println("\nDigite 1 para cadastro ou 2 para gerente: ");
		
	}
	
	private int op;
	
	public int getOp() {
		return op;
	}

	public void setOp(int op) {
		this.op = op;
	}
	
}

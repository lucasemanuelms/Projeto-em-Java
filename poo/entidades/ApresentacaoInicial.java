package br.com.poo.entidades;

public class ApresentacaoInicial {
	
	public void exibir() {
		System.out.println("#### SpotSpace ####");
		System.out.println();
		System.out.println("O SportSpace � um sistema de loca��o de ambientes para a pr�tica de esportes.\n"
				+ "Tem como objetivo facilitar a organiza��o da loca��o do espa�o, defini��o de hor�rios, sele��o de modalidades etc.");
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

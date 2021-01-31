package br.com.poo.menus;

public class MenuData {

	private String dia;
	private String horario;
	
	public void exibirDia() {
		System.out.println();
		System.out.println("***Data desejada***\n");
		System.out.printf("Digite o dia: ");
	}
	
	public void setDia(String dia) {
		this.dia = dia;
	}
	
	public String getDia() {
		return dia;
	}
	
	public void exibirHorario() {
		System.out.println();
		System.out.printf("Digite o horário: ");
	}
	
	public void setHorario(String horario) {
		this.horario = horario;
	}
	
	public String getHorario() {
		return horario;
	}
	
	public void exibirDHorario() {
		System.out.println("O dia escolhido é: " + this.dia);
		System.out.println("O horario escolhido é: " + this.horario);
	}
}

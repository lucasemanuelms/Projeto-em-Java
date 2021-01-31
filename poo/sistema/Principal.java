package br.com.poo.sistema;

import java.util.Scanner;

import br.com.poo.entidades.ApresentacaoInicial;
import br.com.poo.entidades.Cadastro;
import br.com.poo.entidades.Usuario;
import br.com.poo.menus.MenuAmbiente;
import br.com.poo.menus.MenuEsportes;
import br.com.poo.menus.MenuData;
import br.com.poo.menus.Resumo;

public class Principal {

	public static void main(String[] args) {
		
		Cadastro cadastro = new Cadastro();
		Resumo resumo = new Resumo();
		Usuario usuario = new Usuario();
		
		Scanner entrada = new Scanner(System.in);
		
		ApresentacaoInicial ap = new ApresentacaoInicial();
		ap.exibir();
		System.out.printf("\nDigite: ");
		ap.setOp(entrada.nextInt());
		
		if(ap.getOp()==1) {
			System.out.println("\n***CADASTRO***\nDigite seus dados\n");
			System.out.printf("Digite seu nome completo: ");
			usuario.setNomePessoa(entrada.next());
			System.out.printf("Digite o nome de usuário: ");
			usuario.setNomeUsuario(entrada.next());
			System.out.printf("Digite a senha: ");
			usuario.setSenha(entrada.next());
			System.out.printf("Digite o e-mail: ");
			usuario.setEmail(entrada.next());
			System.out.printf("Digite o numero de telefone: ");
			usuario.setTelefone(entrada.nextInt());
			cadastro.addUsuario(usuario);
			System.out.println();
			
			int op2;	
			System.out.println("Deseja continuar locação agora?\nDigite 1 (sim) / 2 (não): ");
			op2 = entrada.nextInt();
			
			if(op2 == 1) {
				MenuEsportes esporte = new MenuEsportes();
				esporte.exibirEsportes();
				resumo.menuEsportes.setModalidade(entrada.nextInt());
				
				MenuAmbiente ambiente = new MenuAmbiente();
				ambiente.exibirAmbientes();
				resumo.menuAmbiente.setQuadra(entrada.nextInt());
				
				MenuData horario = new MenuData();
				horario.exibirDia();
				resumo.menuHorario.setDia(entrada.next());
				horario.exibirHorario();
				resumo.menuHorario.setHorario(entrada.next());
				System.out.println();
				
				System.out.println("-------------------------------------\n");
				usuario.exibeUsuario();		
				resumo.exibirResumo();
			}else if(op2 == 2) {
				System.out.println("Cadastro concluído!");
			}else {
				System.out.println("Opção inválida!");
			}
			
		}else{
			
			if(cadastro.retornaTamanho()==0) {
				System.out.println("\nNENHUM USUÁRIO CADASTRADO!");
			}else {
				System.out.println("***GERENTE***");
				cadastro.exibeParaGerente(usuario);
			}
			
		}
	
		System.out.println();
		
		if(cadastro.retornaTamanho()!=0) {
			System.out.println("Deseja entrar como gerente?\nDigite 1 (sim) / 2 (não)\n");
			
			int op3;
			op3 = entrada.nextInt();
			
			if(op3==1) {
				System.out.println("***GERENTE***\n");
				System.out.println("### Histórico de Cadastro ###\n");
				cadastro.exibeParaGerente(usuario);
			}else if(op3==2) {
				System.out.println("Fim de programa!");
			}else {
				System.out.println("Opção inválida!");
			}
		}
		
		entrada.close();
		
	}

}

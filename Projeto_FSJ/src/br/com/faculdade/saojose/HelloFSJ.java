package br.com.faculdade.saojose;

import java.util.Scanner;

public class HelloFSJ {

	private static String OPCAO_CONTINUAR_PROGRAMA = "";

	@SuppressWarnings("resource")
	public static void main(String[] args) {

		String aluno = "";

		do {
			
			hello(aluno);

			System.out.println("Deseja continuar (s/n) ? \n");

			Scanner operacao = new Scanner(System.in);
			OPCAO_CONTINUAR_PROGRAMA = operacao.next();

		} while ("s".equalsIgnoreCase(OPCAO_CONTINUAR_PROGRAMA));

		fimPrograma();
	}

	@SuppressWarnings("resource")
	private static void hello(String aluno) {

		Scanner nomeUsuario = new Scanner(System.in);
		
		System.out.print("Digite seu nome:");
		aluno = nomeUsuario.next();

		System.out.println("\n" + aluno + ", Hello São José! \n");
	}

	public static void fimPrograma() {
		System.out.println("******** FIM DO PROGRAMA ********");
	}
}
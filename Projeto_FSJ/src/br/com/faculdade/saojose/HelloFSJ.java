package br.com.faculdade.saojose;

import java.util.Scanner;

public class HelloFSJ {

	private static String OPTION_CONTINUE_PROGRAM = "";

	@SuppressWarnings("resource")
	public static void main(String[] args) {

		String student = "";

		do {
			
			printHello(student);

			System.out.println("Wish continue (s/n) ? \n");

			Scanner operation = new Scanner(System.in);
			OPTION_CONTINUE_PROGRAM = operation.next();

		} while ("s".equalsIgnoreCase(OPTION_CONTINUE_PROGRAM));

		endProgram();
	}

	@SuppressWarnings("resource")
	private static void printHello(String aluno) {

		Scanner nomeUsuario = new Scanner(System.in);
		
		System.out.print("Enter your name:");
		aluno = nomeUsuario.next();

		System.out.println("\nHello " + aluno + "!!!\n");
	}

	public static void endProgram() {
		System.out.println("******** END OF PROGRAM ********");
	}
}
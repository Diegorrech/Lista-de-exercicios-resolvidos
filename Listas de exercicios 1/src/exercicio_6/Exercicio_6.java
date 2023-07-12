package exercicio_6;

import java.util.Scanner;

public class Exercicio_6 {

	public static void main(String[] args) {

		/*
		 * Faça um Programa que verifique se uma letra digitada é "F" ou "M". Conforme a
		 * letra escrever: F - Feminino, M - Masculino, Sexo Inválido.
		 */

		Scanner input = new Scanner(System.in);

		System.out.println(" digite para verificar se é feminino ou masculino :");
		System.out.println(" F - FEMININO  M - MASCULINO :");

		String letra = input.next();

		if (letra.equalsIgnoreCase("m")) {
			System.out.println(" A LETRA DIGITADA FOI M - MASCULINO :  " + letra);
		} else if (letra.equalsIgnoreCase("F")) {
			System.out.println(" A LETRA DIGITADA FOI  F - FEMININO : " + letra);
		} else {
			System.out.println(" LETRA INVÁLIDA");
		}

	}

}

package exercicio_5;

import java.util.Scanner;

public class Exercicio_5 {

	public static void main(String[] args) {

		/*
		 * Faça um Programa que peça um valor e mostre na tela se o valor é positivo ou
		 * negativo
		 */

		Scanner input = new Scanner(System.in);

		System.out.println(" digite qualquer numero : ");
		float number = input.nextFloat();

		if (number < 0) {
			System.out.println(String.format(" o numero digitado é menor que zero, numero é negativo :%.4f " , number));
		} else if (number == 0) {
			System.out.println(" o numero é zero : " + number);
		} else {
			System.out.println(" o numero digitado é maior que zero, numero é positivo: " + number);
		}

	}

}

package exercicio_4;

import java.util.Scanner;

public class Exercicio_4 {

	public static void main(String[] args) {

		// Faça um Programa que peça dois números e imprima o maior deles.

		Scanner input = new Scanner(System.in);

		System.out.println(" digite o primeiro numero inteiro : ");
		int n1 = input.nextInt();

		System.out.println(" digite o segundo  numero inteiro : ");
		int n2 = input.nextInt();

		if (n1 > n2) {
			System.out.println(" o numero maior é o : " + n1);
		} else {
			System.out.println(" o numero maior é o : " + n2);
		}

	}

}

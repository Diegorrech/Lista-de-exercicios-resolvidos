package exercicio_1;

import java.util.Scanner;

public class Exercicio_1 {

	public static void main(String[] args) {

		/* Faça um Programa que peça as 4 notas bimestrais e mostre a média. */

		Scanner input = new Scanner(System.in);

		System.out.println(" digite a primeira nota");
		double n1 = input.nextDouble();

		System.out.println(" digite a segunda  nota");
		double n2 = input.nextDouble();

		System.out.println(" digite a terceira  nota");
		double n3 = input.nextDouble();

		System.out.println(" digite a quarta nota");
		double n4 = input.nextDouble();

		double resultado = (n1 + n2 + n3 + n4) / 4;

		System.out.println(" a média das notas é de : " + resultado);

	}

}

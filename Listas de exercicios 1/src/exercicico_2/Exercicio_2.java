package exercicico_2;

import java.util.Scanner;

public class Exercicio_2 {

	public static void main(String[] args) {

		/* Faça um Programa que converta metros para centímetros. */

		Scanner input = new Scanner(System.in);

		System.out.println(" digite o valor que você queira que seja convertido em metros para centímetros : ");
		double metros = input.nextDouble();

		double centimetros = metros / 0.01;

		System.out.println(" o valor convertido em centí metros é de : " + centimetros + " centímetros");

	}

}

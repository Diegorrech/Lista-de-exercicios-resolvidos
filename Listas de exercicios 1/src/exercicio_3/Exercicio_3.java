package exercicio_3;

import java.util.Scanner;

public class Exercicio_3 {

	public static void main(String[] args) {

		/*
		 * Faça um Programa que pergunte quanto você ganha por hora e o número de horas
		 * trabalhadas no mês. Calcule e mostre o total do seu salário no referido mês.
		 */

		Scanner input = new Scanner(System.in);

		System.out.println("digite o valor que você ganha por hora:  ");
		float valorHora = input.nextFloat();

		System.out.println("digite o numero de horas trabalhas no mês: ");
		float horaTrab = input.nextFloat();

		float salario = valorHora * horaTrab;

		System.out.println(String.format(" seu salario é de %.2f", salario) + " reais ");

	}

}

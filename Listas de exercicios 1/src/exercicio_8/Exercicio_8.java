package exercicio_8;

import java.util.Scanner;

public class Exercicio_8 {

	public static void main(String[] args) {
		
		/* Faça um programa para a leitura de duas notas parciais de um aluno.
		 
		O programa deve calcular a média alcançada por aluno e apresentar:
		
		o A mensagem "Aprovado", se a média alcançada for maior ou
		
		igual a sete;
		
		o A mensagem "Reprovado", se a média for menor do que sete;
		
		o A mensagem "Aprovado com Distinção", se a média for igual a
		dez.
		
	*/
		
		Scanner input = new Scanner (System.in);
		
		System.out.println(" digite a primeira nota do aluno : ");
		double nota1 = input.nextDouble();
		
		System.out.println(" digite a segunda  nota do aluno : ");
		double nota2 = input.nextDouble();
		
		double media = (nota1 + nota2 ) / 2 ;
		
		
		if (media == 10 ) { 
			System.out.println(String.format(" a media é de : " + media + " o aluno está aprovado  com distinção "));
		}else if (media >= 7 ) {
			System.out.println(String.format(" a média é de : %0.2F" , media + "o aluno esta aprovado"));
		}else {
			System.out.println(" a media é menor que 7 , então o aluno está reprovado, sua média foi de :" + media);
		}
		
		
		
	}

}

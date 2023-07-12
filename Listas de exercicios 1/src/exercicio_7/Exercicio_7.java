package exercicio_7;

import java.util.Scanner;

public class Exercicio_7 {

	public static void main(String[] args) {
		
		
		/*Faça um Programa que verifique se uma letra digitada é vogal ou
		consoante.*/
		
		
		Scanner input = new Scanner(System.in);
		
		System.out.print(" digite uma letra: ");
		
		String letra = input.next();
		
		switch(letra) {
		case "a":
		case "e":
		case "i":
		case "o":
		case "u":
		case "A":
		case "E":
		case "I":
		case "O":
		case "U":System.out.println(" A LETRA DIGITADA É VOGAL : " + letra );
		break ;
		default :System.out.println(" A LETRA DIGITADA É CONSOANTE : " + letra );
		break ;
			
		}
		

	}

}

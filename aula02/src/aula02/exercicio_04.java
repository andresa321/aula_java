package aula02;

import java.util.Scanner;

public class exercicio_04 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("digite a letra: ");
		char letra = input.next().charAt(0);
		
		if (letra == 'F'){
			System.out.print("Feminino");
		}
		else if (letra == 'M'){
			System.out.print("Masculino");
		}
		else {
			System.out.print("letra invalida");
		}

	}

}

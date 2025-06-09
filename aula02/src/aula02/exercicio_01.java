package aula02;

import java.util.Scanner;

public class exercicio_01 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("digite o primeiro numero: ");
		int num1 = input.nextInt();

		System.out.print("digite o segundo numero: ");
		int num2 = input.nextInt();
		
		System.out.print("digite o terceiro numero: ");
		int num3 = input.nextInt();
		
		if (num1 > num2 && num1 > num3) {
			System.out.println("O primeiro numero é o maior");
		} else if (num2 > num1 && num2 > num3) {
			System.out.println("O segundo numero é o maior");
		} else {System.out.println("O terceiro numero é o maior");
		}
	}

}

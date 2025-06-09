package aula02;

import java.util.Scanner;

public class exercicio_03 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("digite o primeiro numero: ");
		double num1 = input.nextDouble();
		
		System.out.print("digite o primeiro numero: ");
		double num2 = input.nextDouble();
		
		double media = (num1 + num2) / 2;
		System.out.print(media);
	}

}

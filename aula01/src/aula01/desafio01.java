package aula01;

import java.util.Scanner;

public class desafio01 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.print("digite um numero inteiro: ");
		double num = entrada.nextDouble();
		
		if (num>0){
			System.out.println("Positivo");
		}else
			System.out.println("Negativo");
		}
	}

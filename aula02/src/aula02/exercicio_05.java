package aula02;

import java.util.Scanner;

public class exercicio_05 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int contador = 0;
		System.out.print("digite a primeira pergunta: ");
		char resp1 = input.next().charAt(0);
		if (resp1 == 'S'){
			contador ++;	
		}
		System.out.print("digite a primeira pergunta: ");
		char resp2 = input.next().charAt(0);
		if (resp2 == 'S'){
			contador ++;	
		}
		System.out.print("digite a primeira pergunta: ");
		char resp3 = input.next().charAt(0);
		if (resp3 == 'S'){
			contador ++;	
		}
		System.out.print("digite a primeira pergunta: ");
		char resp4 = input.next().charAt(0);
		if (resp4 == 'S'){
			contador ++;	
		}
		System.out.print("digite a primeira pergunta: ");
		char resp5 = input.next().charAt(0);
		if (resp5 == 'S'){
			contador ++;	
		}
		
		if (contador == 2) {
			System.out.print("suspeita");
		}
		else if (contador == 3 && contador == 4) {
			System.out.print("cumplice");	
		}
		else if (contador == 5) {
			System.out.print("assassino");
		}
		else{
			System.out.print("inocente");
		}

	}

}

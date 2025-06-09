package aula02;

import java.util.Scanner;

public class exercicio_02 {

	public static void main(String[] args) {
		int domingo = 1;
		int segunda = 2;
		int terça = 3;
		int quarta = 4;
		int quinta = 5;
		int sexta = 6;
		int sabado = 7;
		Scanner input = new Scanner(System.in);
		System.out.print("digite o primeiro numero: ");
		int num = input.nextInt();
		
		if (num == 1){
			System.out.print("hoje é domingo");
		}else if (num == 2){
			System.out.print("hoje é segunda-feira");
		}
		else if (num == 3){
			System.out.print("hoje é terça-feira");
		}
		else if (num == 4){
			System.out.print("hoje é quarta-feira");
		}
		else if (num == 5){
			System.out.print("hoje é quinta-feira");
		}
		else if (num == 6){
			System.out.print("hoje é sexta-feira");
		}
		else if (num == 7){
			System.out.print("hoje é sábado");
		}
        else{
        	System.out.print("valor invalido");
        }

	}

}

package lista2;

import java.util.Scanner;

public class exercicio2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("Insira um número de 1 a 7: ");
		int x = sc.nextInt();
		sc.nextLine();
		String dia;

		switch (x) {
		case 1:
			dia = "Domingo";
			break;
		case 2:
			dia = "Segunda-feira";
			break;
		case 3:
			dia = "Terça-feira";
			break;
		case 4:
			dia = "Quarta-feira";
			break;
		case 5:
			dia = "Quinta-feira";
			break;
		case 6:
			dia = "Sexta-feira";
			break;
		case 7:
			dia = "Sábado";
			break;
		default:
			dia = "Número inválido.";
		}

		if (x > 7) {
			System.out.print(dia);
		} else {
			System.out.print("O dia da semana é: " + dia);
		}
		sc.close();
	}
}

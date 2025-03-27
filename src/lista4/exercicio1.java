package lista4;

import java.util.Scanner;

public class exercicio1 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		char opcao;
		double celsius, fahrenheit;

		do {
			System.out.println("Digite a temperatura em Celsius: ");
			celsius = sc.nextDouble();
			sc.nextLine();
			fahrenheit = (celsius * 1.8) + 32;
			System.out.printf("Equivalente em Fahrenheit: %.1f%n", fahrenheit);
			System.out.println("Deseja inserir outro valor? (S/N)");
			opcao = sc.next().charAt(0);

		} while (opcao == 's' || opcao == 'S');

		sc.close();
	}
}

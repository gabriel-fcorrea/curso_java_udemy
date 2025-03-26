package lista2;

import java.util.Scanner;

public class exercicio5 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int senha = 2002;

		System.out.print("Senha:");
		int x = sc.nextInt();

		while (x != senha) {
			System.out.println("Senha Inválida, tente novamente.");
			x = sc.nextInt();
		}

		System.out.println("Acesso Permitido.");

		sc.close();
	}
}

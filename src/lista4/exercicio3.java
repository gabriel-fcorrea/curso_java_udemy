package lista4;

import java.util.Scanner;

public class exercicio3 {

	public static void main(String[] args) {

		System.out.println("Digite 3 números abaixo.");
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();

		if (a > b && a > c) {
			System.out.println("O maior número é " + a);
		} else if (b > a && b > c) {
			System.out.println("O maior número é " + b);
		} else if (c > a && c > b) {
			System.out.println("O maior número é " + c);
		} else
			System.out.println("Há números são iguais.");

		sc.close();
	}

}

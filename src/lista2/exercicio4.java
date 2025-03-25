package lista2;

import java.util.Scanner;

public class exercicio4 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int a = 1;
		int b = 0;

		while (a != 0) {
			System.out.print("Digite um número: ");
			a = sc.nextInt();
			b += a;

		}

		System.out.print(b);
		sc.close();

	}
}

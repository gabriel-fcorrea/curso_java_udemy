package lista3;

import java.util.Scanner;

public class exercicio6 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();

		for (int i = 0; i < n; i++) {

			int x = sc.nextInt();
			int y = sc.nextInt();

			if (y == 0) {
				System.out.println("Divisão impossível.");
			} else {
				double div = (double) x / y;
				System.out.printf("Resultado: %.2f", div);
			}

		}

		sc.close();
	}

}

package lista3;

import java.util.Scanner;

public class exercicio9 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		for (int i = 1; i <= n; i++) {

			double quad = Math.pow(i, 2.0);
			double cubo = Math.pow(i, 3.0);
			System.out.printf("%d %.0f %.0f%n", i, quad, cubo);

		}

		sc.close();
	}

}

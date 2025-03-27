package lista3;

import java.util.Scanner;

public class exercicio4 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		double media = 0.0;

		for (int i = 0; i < n; i++) {
			double x = sc.nextDouble();
			media = media + x;
		}

		double total = media / n;
		System.out.printf("Média: %.2f", total);

		sc.close();
	}

}

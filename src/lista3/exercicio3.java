package lista3;

import java.util.Scanner;

public class exercicio3 {

	public static void main(String[] agrs) {

		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int in = 0;
		int out = 0;

		for (int i = 0; i < n; i++) {
			int x = sc.nextInt();
			if (10 <= x && x <= 20) {
				in = in + 1;
			} else {
				out = out + 1;

			}
		}
		System.out.println(in + "out");

		System.out.println(out + "in");

		sc.close();

	}
}

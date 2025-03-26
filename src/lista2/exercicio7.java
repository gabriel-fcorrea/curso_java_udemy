package lista2;

import java.util.Scanner;

public class exercicio7 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		String a, b, c, d;

		a = "Álcool";
		b = "Gasolina";
		c = "Diesel";
		d = "Sair";

		int A = 0;
		int B = 0;
		int C = 0;

		System.out.printf("Selecione entre as opções: \n1.%s \n2.%s \n3.%s \n4.%s%n", a, b, c, d);
		int x = sc.nextInt();
		sc.nextLine();

		while (x != 4) {
			if (x == 1) {
				A += 1;
				System.out.printf("Muito obrigado! \nTotal de votos:\n%s: %d%n", a, A);
				System.out.printf("%s: %d%n", b, B);
				System.out.printf("%s: %d%n", c, C);
			} else if (x == 2) {
				B += 1;
				System.out.printf("Muito obrigado! \nTotal de votos:\n%s: %d%n", a, A);
				System.out.printf("%s: %d%n", b, B);
				System.out.printf("%s: %d%n", c, C);
			} else if (x == 3) {
				C += 1;
				System.out.printf("Muito obrigado! \nTotal de votos:\n%s: %d%n", a, A);
				System.out.printf("%s: %d%n", b, B);
				System.out.printf("%s: %d%n", c, C);
			}

			System.out.print("-----------------------------\n");
			System.out.printf("Selecione entre as opções: \n1.%s \n2.%s \n3.%s \n4.%s%n", a, b, c, d);
			x = sc.nextInt();

		}

		System.out.print("Saindo...");

		sc.close();
	}
}

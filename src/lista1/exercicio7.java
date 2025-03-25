package lista1;
import java.util.Scanner;

public class exercicio7 {

	public static void main(String[] agrs) {

		Scanner sc = new Scanner(System.in);

		int cod1, numPecas1, cod2, numPecas2;
		double valUnit1, valUnit2, total;

		System.out.print("Código: ");
		cod1 = sc.nextInt();
		sc.nextLine();
		System.out.print("Número de Peças: ");
		numPecas1 = sc.nextInt();
		sc.nextLine();
		System.out.print("Valor Unitário: ");
		valUnit1 = sc.nextDouble();
		sc.nextLine();

		System.out.print("Código: ");
		cod2 = sc.nextInt();
		sc.nextLine();
		System.out.print("Número de Peças: ");
		numPecas2 = sc.nextInt();
		sc.nextLine();
		System.out.print("Valor Unitário: ");
		valUnit2 = sc.nextDouble();
		sc.nextLine();

		total = (numPecas1 * valUnit1) + (numPecas2 * valUnit2);

		System.out.printf("O valor total é de R$ %.2f", total);

		sc.close();
	}

}

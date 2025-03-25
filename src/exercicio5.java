import java.util.Scanner;

public class exercicio5 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int A, B, C, D, resultado;

		System.out.println("Digite 4 números abaixo: ");
		A = sc.nextInt();
		sc.nextLine();
		B = sc.nextInt();
		sc.nextLine();
		C = sc.nextInt();
		sc.nextLine();
		D = sc.nextInt();
		sc.nextLine();

		resultado = A * B - C * D;

		System.out.printf(
				"O a diferença do produto do primeiro par de números com o segundo par de números corresponde a %d.",
				resultado);
	}
}

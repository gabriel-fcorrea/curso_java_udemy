import java.util.Scanner;

public class exercicio8 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		float A, B, C;
		double pi, area;
		pi = 3.14159;

		System.out.println("Digite o valor de A com uma casa decimal: ");
		A = sc.nextFloat();
		sc.nextLine();
		System.out.println("Digite o valor de B com uma casa decimal: ");
		B = sc.nextFloat();
		sc.nextLine();
		System.out.println("Digite o valor de C com uma casa decimal: ");
		C = sc.nextFloat();
		sc.nextLine();

		area = (double) (A * C) / 2;
		System.out.printf("TRIÂNGULO: %.3f%n", area);

		double potencia = Math.pow(C, 2.0);
		area = (double) potencia * pi;
		System.out.printf("CÍRCULO: %.3f%n", area);

		area = (double) (A + B) * C / 2;
		System.out.printf("TRAPÉZIO: %.3f%n", area);

		area = (double) B * B;
		System.out.printf("QUADRADO: %.3f%n", area);

		area = (double) A * B;
		System.out.printf("RETÂNGULO: %.3f%n", area);

		sc.close();
	}

}

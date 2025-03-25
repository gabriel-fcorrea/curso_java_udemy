import java.util.Scanner;

public class exercicio4 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		double area, pi, raio, potencia;
		pi = 3.14159;

		System.out.println("Digite o valor do raio: ");
		raio = sc.nextDouble();

		potencia = Math.pow(raio, 2.0);
		area = pi * potencia;

		System.out.printf("O valor da área corresponde a %.4f", area);

		sc.close();

	}
}

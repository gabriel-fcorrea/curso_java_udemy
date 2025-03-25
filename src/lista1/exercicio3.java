package lista1;
import java.util.Scanner;

public class exercicio3 {

	public static void main(String[] args) {

		int a, b, resultado;
		Scanner sc = new Scanner(System.in);

		System.out.println("Digite um valor inteiro: ");
		a = sc.nextInt();

		System.out.println("Digite outro valor inteiro: ");
		b = sc.nextInt();

		resultado = a + b;
		System.out.printf("A soma dos valores corresponde a %d.", resultado);

		sc.close();
	}

}

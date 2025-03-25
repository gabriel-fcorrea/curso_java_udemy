package lista1;
import java.util.Scanner;

public class exercicio6 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int id, horas;
		double valor, salario;

		System.out.println(
				"Digite abaixo o número de registro, a quantidade de horas trabalhadas e o valor ganho por hora:");
		id = sc.nextInt();
		sc.nextLine();
		horas = sc.nextInt();
		sc.nextLine();
		valor = sc.nextDouble();

		salario = (double) valor * horas;

		System.out.printf("NUMBER: %d%nSALARY: U$ %.2f.", id, salario);

		sc.close();
	}
}

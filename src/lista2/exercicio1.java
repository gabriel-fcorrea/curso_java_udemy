package lista2;

import java.util.Scanner;

// EXEMPLO DE OPERADOR DE ATRIBUIÇÃO CUMULATIVA

// NESTE EXEMPLO, A CONTA DE TELEFONE COBRA 2 REAIS DE VALOR EXCEDENTE A 100 MINUTOS.
// CASO NÃO ULTRAPASSE OS 100 MINUTOS, O VALOR FIXO É DE 50 REAIS.

public class exercicio1 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int minutos = sc.nextInt();
		double conta = 50.0;

		if (minutos > 100) {
			conta += (minutos - 100) * 2.0;
			// é o mesmo que dizer que: conta = conta + (minutos - 100) * 2.0
		}

		System.out.printf("Valor da conta = R$ %.2f%n", conta);

		sc.close();

	}
}

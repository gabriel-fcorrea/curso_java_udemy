package lista2;

import java.util.Scanner;

public class exercicio6 {

	public static void main(String[] args) {

		System.out.println("Insira abaixo duas coordenadas (diferentes de zero) para descobrir o quadrante.");
		Scanner sc = new Scanner(System.in);
		System.out.print("Coordanada de X: ");
		int x = sc.nextInt();
		System.out.print("Coordanada de Y: ");
		int y = sc.nextInt();

		while (x != 0 && y != 0) {

			if (x > 0 && y > 0) {
				System.out.println("Primeiro Quadrante.");
				break;
			} else if (x > 0 && y < 0) {
				System.out.println("Quarto Quadrante.");
				break;
			} else if (x < 0 && y < 0) {
				System.out.println("Terceiro Quadrante.");
				break;
			} else {
				System.out.println("Segundo Quadrante.");
				break;
			}
		}

		sc.close();
	}
}

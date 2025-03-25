package lista2;

//EXPRESSÃO CONDICIONAL TERNÁRIA

public class exercicio3 {

	public static void main(String[] args) {

		double preco = 34.5;
		// o valor é validado na própria atribuição do valor:
		// (condição) ? se : senão
		double desconto = (preco < 20.0) ? preco * 0.1 : preco * 0.05;

		System.out.print(desconto);

	}
}

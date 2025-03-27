package lista4;

public class exercicio2 {

	public static void main(String[] args) {

		String texto = "abcde ABCDE     ";

		String t1 = texto.toLowerCase();
		String t2 = texto.toUpperCase();
		String t3 = texto.trim();
		String t4 = texto.substring(2);
		String t5 = texto.substring(2, 9);
		String t6 = texto.replace('a', 'X');
		String t7 = texto.replace("abc", "X");
		int i = texto.indexOf("bc");
		int j = texto.lastIndexOf("bc");

		System.out.println("Texto: " + texto);
		System.out.println("toLowerCase: " + t1);
		System.out.println("toUpperCase: " + t2);
		System.out.println("trim: " + t3);
		System.out.println("substring: " + t4);
		System.out.println("substring: " + t5);
		System.out.println("replace: " + t6);
		System.out.println("replace: " + t7);
		System.out.println("indexOf: " + i);
		System.out.println("lastIndexOf: " + j);

		String texto2 = "três palavras diferentes";

		String[] vect = texto2.split(" ");

		System.out.println(vect[0]);
		System.out.println(vect[1]);
		System.out.println(vect[2]);

	}

}

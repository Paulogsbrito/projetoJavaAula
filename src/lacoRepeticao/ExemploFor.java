package lacoRepeticao;

import java.util.Scanner;

public class ExemploFor {

	public static void main(String[] args) {

		String nome;
		int contador;
		Scanner leia = new Scanner(System.in);

		for (contador = 1; contador < 5; contador++) {

			// Maneira comum de utilização //do for
			// System.out.println("Digite o 1º nome: ");
			// nome = leia.nextLine();
			// System.out.println("O 1º nome é: " + nome);

			// utilizaçãp do contador com 1 á 4 utilizando da concatenação
			System.out.println("\nDigite o " + contador + "º nome: ");
			nome = leia.nextLine();
			System.out.println("\nO " + contador + " º nome é: " + nome);

		}

	}

}

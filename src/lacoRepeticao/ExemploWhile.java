package lacoRepeticao;

import java.util.Scanner;

public class ExemploWhile {

	public static void main(String[] args) {

		int numero1, numero2, resultado;
		String continua = "";
		Scanner leia = new Scanner(System.in);

		// o valor de continua é igual a N
		// Sim, é n
		// ! True => false

		while (!continua.equalsIgnoreCase("n")) { // IgnoreCase = UpperCase = maius LowerCase = minus (ignora maiusculo
													// e minusculo)

			System.out.println("Digite primeiro valor: ");
			numero1 = leia.nextInt();

			System.out.println("Digite segundo valor: ");
			numero2 = leia.nextInt();

			resultado = numero1 + numero2;

			System.out.println("O resultado da soma é: " + resultado);

			System.out.println("Deseja continuar? (Sim/Não)");
			continua = leia.next();

		}

	}

}

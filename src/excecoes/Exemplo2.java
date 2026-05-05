package excecoes;

import java.util.Scanner;

public class Exemplo2 {

	static Scanner ler = new Scanner(System.in);

	public static void main(String[] args) {

		int idade;

		try {

			System.out.println("\nDigite a idade: ");
			idade = ler.nextInt();

			validarIdade(idade);

		} catch (ArithmeticException e) {
			System.out.println("Exceção: " + e.getMessage());
		}
		System.out.println("Rodou até aqui...");
	}

	public static void validarIdade(int idade) {

		if (idade < 18) {
			throw new ArithmeticException("Apessoa não pode dirigir!!");
		} else {
			System.out.println("A pessoa pode Dirigir!!!");
		}
	}

}

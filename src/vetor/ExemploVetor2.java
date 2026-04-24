package vetor;

import java.util.Scanner;

public class ExemploVetor2 {

	public static void main(String[] args) {

		// criando um vetor vazio com 3 posições
		int vetorNumeros[] = new int[3];

		Scanner leia = new Scanner(System.in);

		// vetorNumero[0] = quero que ele acesse a "casa" 0


		// Popular/Adicionar itens ao vetor vazio
		for (int indice = 0; indice < 3; indice++) {
			System.out.println("Digite um número: ");
			vetorNumeros[indice] = leia.nextInt();
			
		}

		// mostrar itens do vetor
		for (int indice = 0; indice < 3; indice++) {
			System.out.println((indice + 1) + "º elemento: " + vetorNumeros[indice]);

		}

	}
}

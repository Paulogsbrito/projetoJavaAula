package excecoes;

public class Exemplo3 {

	public static void main(String[] args) throws ExcecaoSimples {

		String nomes[] = { "João", "Maria", "Pedro", "Manuela" };

		try {
			for (int i = 0; i < 5; i++) {
				System.out.println(nomes[i]);
			}
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("\nExceção: ");
			System.out.println("\nPosição Invalida!");
		}

		System.out.println("Teste");

		throw new ExcecaoSimples("Exceção Simples!!!");

	}

}

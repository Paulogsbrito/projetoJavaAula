package lacoCondicional;

import java.util.Scanner;

public class ExemploSwitchCase {

	public static void main(String[] args) {
		
		int opcao;
		Scanner leia = new Scanner(System.in);
		
		System.out.println("# ## ### #### #########   Menu   ########## #### ### ## #");
		System.out.println("\n--Digite 1 para ver Indicação de um Livro--");
		System.out.println("--Digite 2 para ver ler uma Frase Motivacional--");
		System.out.println("--Digite 3 para receber uma Indicação de música--");
		opcao = leia.nextInt();
		
		switch (opcao) {
		case 1:
			System.out.println("Livro: Assim falava Zaratustra");
			break;
			
		case 2:	
			System.out.println("Frase Motivavional: Persistencia e Disciplina é a Chave do Sucesso!!!");
			break;
		
		case 3:	
			System.out.println("Musica: Charlie Brown JR  - Provedor");
			break;
			
			default:
				System.out.println("Opção Invalida, escolha números de 1 á 3");
		}

	}

}

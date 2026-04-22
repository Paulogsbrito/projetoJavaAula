package lacoCondicional;

import java.util.Scanner;

public class ExemploElse {

	public static void main(String[] args) {
		
		float nota1, nota2, media;
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Por gentileza digite a primeira nota: ");
		nota1 = leia.nextFloat();
		
		System.out.println("Por gentileza digite a segunda nota: ");
		nota2 = leia.nextFloat();
		
		media = (nota1 + nota2) / 2;
		
		if(media >= 6) {
			System.out.println("Parabéns, você foi aprovado na Generation!!!");
		}else {
			System.out.println("Infelizmente você foi reprovado, boa sorte na próxima tentativa!");
		}

	}

}

package entradaSaida;

import java.util.Scanner;

public class AulaOperadores {
	
	public static void main(String[] args) {
		
		// Variaveis
		float celsius, fahrenheit;
		Scanner leia = new Scanner(System.in);
		
		
		// Entrada de Dados
		System.out.println("Por gentileza insira a temperatura em graus Celsius: ");
		celsius = leia.nextFloat();
		
		
		// Processamento de Dados (Os valores em questão é um algoritmo pronto não tem relação com o java)
		fahrenheit = celsius * 1.8f + 32;
		
		
		// Saída de Dados 
		System.out.println("A temperatura em Fahrenheit é: " + fahrenheit);
		
		
	}

}

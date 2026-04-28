package metodos;

import metodoExterno.MetodoExterno;

public class ExemploMetodos {

	public static void main(String[] args) {
		
		int resultado = somar(22,50);
		
		System.out.println("O primeiro resultado: " + resultado);
		
		mensagem();
		
		saudacao("Bom dia, rapaziada!!!");
		
		//import realizado de outra classe
		MetodoExterno.info();

	}		

	public static int somar (int num1, int num2) {
		
		return num1 + num2; 
	}
	
	public static void mensagem( ) {
		System.out.println("Esse método não tem retorno(void)");
	}
	
	public static void saudacao(String msg) {
		System.out.println(msg);
		
	}

}

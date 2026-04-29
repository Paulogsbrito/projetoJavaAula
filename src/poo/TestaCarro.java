package poo;

public class TestaCarro {

	public static void main(String[] args) {
		
		// Instanciamento | Instanciar um Objeto
		Carro c1 = new Carro ("Chevrolet", "Corsa", 4, 4, 1.0); // c1 é um objeto
		Carro c2 = new Carro ("Volkswagen", "Gol Gti", 4, 2, 1.8);
		 
		c1.setMarca("Chevrolet");
		c1.setModelo("Corsa"); 
		c1.setRodas(4);
		c1.setPortas(2);
		c1.setMotor(1.0);
		
			
		c1.locomover();	
		System.out.println("Modelo: " + c1.getModelo());
		System.out.println("Marca: " + c1.getmarca());
		System.out.println("Quantidade Portas: " + c1.getPortas());
		System.out.println("Quantidade Rodas: " + c1.getRodas());
		System.out.println("Motorização: " + c1.getMotor());
		
		
		System.out.println(c1.parar());
	
	    
		c2.locomover();
		System.out.println("Modelo " + c2.getModelo());
		System.out.println("Marca: " + c2.getmarca());
		System.out.println("Quantidade Portas:" + c2.getPortas());
		System.out.println("Quantidade Rodas: " + c2.getRodas());
		System.out.println("Motorização: " + c2.getMotor());
		
		
		System.out.println(c2.parar());
	}
	
	

	}

	
	
	


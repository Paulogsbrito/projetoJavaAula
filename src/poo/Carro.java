package poo;

// A classe é apenas um molde
public class Carro {
	
	// Atributos
	
	private String marca;
	private String modelo;
	private int rodas;
	private int portas;
	private double motor;
	
	
	// Método construtor
	
	public Carro( String marca, String modelo, int rodas, int portas, double motor) {
		
		this.marca = marca; // This -> Classe 
		this.modelo = modelo; // 
		this.portas = portas;
		this.rodas = rodas;
		this.motor = motor;
	}
	
	
// Metodos Especiais / Acesso - (Get/Set)
	public String getmarca( ) {
		return marca;
	}
	
	public void setMarca(String marca) {
		this.marca = marca; // (This) essa Classe -> o This é apenas uma referencia ele não armazena valor
		// Carro.marca = parametro marca
	}
		
	
	public String getModelo() {
		return modelo;
	}
	
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	
	public int getRodas() {
		return rodas;
	}

	public void setRodas(int rodas) {
		this.rodas = rodas;
	}


	public int getPortas() {
		return portas;
	}

	public void setPortas(int portas) {
		this.portas = portas;
	}


	public double getMotor() {
		return motor;
	}

	public void setMotor(double motor) {
		this.motor = motor;
	}

	
	// Métodos	
	public void locomover() {
		System.out.println("Estou me Locomovendo...\n");
	}
	
	public String parar() {
		return "\nEstou parando\n";
	}
	

}

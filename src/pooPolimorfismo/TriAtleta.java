package pooPolimorfismo;


public class TriAtleta extends Pessoa implements ICiclista, ICorredor, INadador {
	
	int competicoes;
    
	//Metodos construtores
	public TriAtleta(String nome, int idade, int competicoes) {
		super(nome, idade);// pessoa (nome, idade)
		this.competicoes = competicoes;
	}
	
	public TriAtleta(String nome, int idade) {
		super(nome, idade);
	}
	
	
	public int getCompeticoes() {
		return competicoes;
	}

	public void setCompeticoes(int competicoes) {
		this.competicoes = competicoes;
	}
	
	
	public void competicoesConcluidas() {
		System.out.println("Competições concluidas: " + this.competicoes);
	}
	
	// Polimorfismo de Sobrecarga (Sobrecarga de Método)
	public void competicoesConcluidas(int numero) {
		System.out.println("Competições Concluidas: " + numero);
	}
	
	//Polimorfismo de Sobrescrita (Sobrescrita de Método) 
	public void visualizar() {
		super.visualizar();
	}
	
	//Métodos Im´plementados das Interfaces
	public void pedalar( ) {
		 System.out.println("Estou pedalando...");
	}
	
	@Override // Anotação = Etiqueta para os Dados/Informação
	public String aquecer() {
		return "Estou Aquecendo";
	}
	
	@Override
	public void correr() {
		System.out.println("Correndo...");
	}
		
	@Override
	public void nadar(int distancia) {
		System.out.println("Vou Nadar " + distancia + "KM.");
	}
    
	
}

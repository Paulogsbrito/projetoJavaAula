package pooHeranca;

public class Estudante extends Pessoa { //Classe derivada/ Filha
	
	// Atributos da classe

    private String matricula;
    private String curso;
    
    
 // método construtor
	public Estudante(String nome, int idade, String email, String matricula, String curso) {
		super(nome, idade, email); // super --> Classe Mãe // Método construtor da Classe Mãe
		// Herança da Classe Pessoa(nome, idade, email)
		this.matricula = matricula;
		this.curso = curso;
	}
	
	//Getters e Setters -> Metodos de acesso
	public String getMatricula() {
		return matricula;
	}
	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}
	public String getCurso() {
		return curso;
	}
	public void setCurso(String curso) {
		this.curso = curso;
	}

}

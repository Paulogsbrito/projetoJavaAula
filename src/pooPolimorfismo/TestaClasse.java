package pooPolimorfismo;

public class TestaClasse {
	
	public static void main(String[] args) {
		
		//Pessoa p = new Pessoa("Maria", 18); // Classe Abstrata não herda
		//p.visualizar();// Classe Abstrata não herda
		
		
		TriAtleta t = new TriAtleta("Eliane", 26, 400);
		TriAtleta t2 = new TriAtleta("João", 30, 12);
		//TriAtleta t3 = new TriAtleta("Jéssica", 22);
		
		
		//t2.competicoesConcluidas();
		//t2.competicoesConcluidas(8);
		
		
		
		//t.setNome("Queren");
		//System.out.println(t.getNome());
		
		
		t.visualizar();
		t2.visualizar();
		
	}

}

package Heranca;

public class Animal {
	
	private String nome = new String();
	private int idade;
	private String som = new String();
	
	public Animal() {
		this.nome = "nenhum";
		this.idade = 0;
		this.som = "nenhum";
	}
	
	public void mostrarDados() {
		System.out.println("Animl: " + getNome());
		System.out.println("Idade: " + getIdade());
		System.out.println("som: " + getSom());
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public String getSom() {
		return som;
	}

	public void setSom(String som) {
		this.som = som;
	}
}

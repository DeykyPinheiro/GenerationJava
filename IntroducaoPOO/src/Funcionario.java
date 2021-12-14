
public class Funcionario {
	
	private String cadastro = new String();
	private String nome = new String();
	private int	idade;
	public String getCadastro() {
		return cadastro;
	}
	public void setCadastro(String cadastro) {
		this.cadastro = cadastro;
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
	
	public Funcionario() {
		this.cadastro = "Desfault";
		this.nome = "Desfault";
		this.idade = 0;
	}
	
	public void showData() {
		System.out.println("Cadatro: " + this.cadastro);
		System.out.println("Nome: " + this.nome);
		System.out.println("Idade: " + this.idade);
	}

}

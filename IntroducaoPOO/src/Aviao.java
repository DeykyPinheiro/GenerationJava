/*
 * Crie uma classe avião e apresente os atributos e métodos referentes
 * esta classe, em seguida crie um objeto avião, defina as instancias deste
 * objeto e apresente as informações deste objeto no console.
*/
public class Aviao {
	
	private int	idVoo;
	private String	nomeDoCapitao;
	private int quantidadeTotalPassageiros;
	private int	quantidadeOciosaPasageiros;
	
	public int getIdVoo() {
		return idVoo;
	}
	public void setIdVoo(int idVoo) {
		this.idVoo = idVoo;
	}
	public int getQuantidadeTotalPassageiros() {
		return quantidadeTotalPassageiros;
	}
	public void setQuantidadeTotalPassageiros(int quantidadeTotalPassageiros) {
		this.quantidadeTotalPassageiros = quantidadeTotalPassageiros;
	}
	public int getQuantidadeOciosaPasageiros() {
		return quantidadeOciosaPasageiros;
	}
	public void setQuantidadeOciosaPasageiros(int quantidadeOciosaPasageiros) {
		this.quantidadeOciosaPasageiros = quantidadeOciosaPasageiros;
	}
	public String getNomeDoCapitao() {
		return nomeDoCapitao;
	}
	public void setNomeDoCapitao(String nomeDoCapitao) {
		this.nomeDoCapitao = nomeDoCapitao;
	}
	public Aviao() {
		this.idVoo = 0000;
		this.nomeDoCapitao = "Default";
		this.quantidadeTotalPassageiros = 300;
		this.quantidadeOciosaPasageiros = 12;
	}
	
	public void showDatas() {
		System.out.print("\nId Do Voo: " + this.idVoo);
		System.out.print("\nNome Do Capitao: " + this.nomeDoCapitao);
		System.out.print("\nQuantidade Total De Passageiros: " + this.quantidadeTotalPassageiros);
		System.out.print("\nQuatidade Ociosa De Passageiros: " + this.quantidadeOciosaPasageiros);
	}
	
	
}

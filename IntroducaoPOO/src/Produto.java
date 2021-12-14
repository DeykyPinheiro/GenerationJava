
public class Produto {
	
	private String produto = new String();
	private int quantidade;
	private double preco;
	
	public String getProduto() {
		return produto;
	}
	public void setProduto(String produto) {
		this.produto = produto;
	}
	public int getQuantidade() {
		return quantidade;
	}
	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}
	public double getPreco() {
		return preco;
	}
	public void setPreco(double preco) {
		this.preco = preco;
	}
	
	public Produto() {
		this.produto = "Default";
		this.preco = 0;
		this.quantidade = 0;
	}
	
	public void showProduct() {
		System.out.println("Produto: " + this.produto);
		System.out.println("Quantidade: " + this.quantidade);
		System.out.println("Preco: " + this.preco);
	}
	
	
}

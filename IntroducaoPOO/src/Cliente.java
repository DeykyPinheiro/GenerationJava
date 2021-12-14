
public class Cliente {
	
	private int	cadastro;
	private int	codigo;
	private String	produto = new String();
	
	public int getCadastro() {
		return cadastro;
	}
	public void setCadastro(int cadastro) {
		this.cadastro = cadastro;
	}
	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	public String getProduto() {
		return produto;
	}
	public void setProduto(String produto) {
		this.produto = produto;
	}
	
	public void show() {
		System.out.print("\nCadastro: " + this.cadastro);
		System.out.print("\nCodigo: " + this.codigo);
		System.out.print("\nProduto: " + this.produto);
	}
	
	public Cliente(){
		this.cadastro = 0;
		this.codigo = 10;
		this.produto = "none";
	}
	
	
}

/*
 * Crie uma classe produto eletr�nico e apresente os atributos e m�todos
 * referentes esta classe, em seguida crie um objeto produto eletr�nico,
 * defina as instancias deste objeto e apresente as informa��es deste objeto
 * no console.*/
public class ClasseExecucao3 {

	public static void main(String[] args) {
		
		//default
		Produto produto = new Produto();
		produto.showProduct();
		System.out.println();
		
		
		//valores alterados
		produto.setProduto("SmarthPhone");
		produto.setPreco(10000);
		produto.setQuantidade(3);
		produto.showProduct();
	}
}

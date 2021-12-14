/*
 * Crie uma classe cliente e apresente os atributos e métodos referentes
 * esta classe, em seguida crie um objeto cliente, defina as instancias deste
 * objeto e apresente as informações deste objeto no console.
*/
public class ClasseExecucao1 {
	
	public static void main(String[] args) {
		Cliente cliente = new Cliente();
		
		//valor padrao do meu construtor
		cliente.show();
		System.out.println();
		
		cliente.setCadastro(5);
		cliente.setCodigo(123);;
		cliente.setProduto("sabonete");
		cliente.show();
	}

}

/*
 * Crie uma classe funcion�rio e apresente os atributos e m�todos
 * referentes esta classe, em seguida crie um objeto funcion�rio, defina as
 * instancias deste objeto e apresente as informa��es deste objeto no
 * console.*/
public class ClasseExecucao4 {
	
	public static void main(String[] args) {
		
		Funcionario funcionario = new Funcionario();
		funcionario.showData();
		System.out.println();
		
		funcionario.setCadastro("02312");
		funcionario.setNome("Larissa");
		funcionario.setIdade(28);
		funcionario.showData();
	}
}
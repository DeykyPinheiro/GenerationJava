/*
 * Crie uma classe funcionário e apresente os atributos e métodos
 * referentes esta classe, em seguida crie um objeto funcionário, defina as
 * instancias deste objeto e apresente as informações deste objeto no
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
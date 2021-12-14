/*
 * Crie uma classe conta bancaria e apresente os atributos e métodos
 * referentes esta classe, em seguida crie um objeto conta bancaria, defina
 * as instancias deste objeto e apresente as informações deste objeto no
 * console.
*/
public class ClasseExecucao6 {
	
	public static void main(String[] args) {
		
//		valores padroes
		ContaBancaria conta = new ContaBancaria();
		conta.showData();
		System.out.println();
		
//		valores alterados
		conta.setNomeCliente("Jose Silva");
		conta.setDeposito(300);
		conta.setDeposito(50);
		conta.setSaque(20);
		conta.showData();		
		
	}

}

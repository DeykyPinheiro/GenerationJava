/*
 * Crie uma classe patinete e apresente os atributos e métodos referentes
 * esta classe, em seguida crie um objeto patinete, defina as instancias deste
 * objeto e apresente as informações deste objeto no console.*/
public class ClasseExecucao5 {
	
	public static void main(String[] args) {
		
		//dados padrao
		Patinete meuPatinete = new Patinete();
		meuPatinete.showData();
		System.out.println();
		
		//mudanca de dados no mesmo obj
		meuPatinete.setDono("eu");
		meuPatinete.setCor("Verde Claro");
		meuPatinete.showData();
	}
}

package Heranca;

public class MainAnimais {
	
	public static void main(String[] args) {
		
		Cachorro cachorro = new Cachorro();
		Cavalo cavalo = new Cavalo();
		Preguica preguica = new Preguica();
		
		
//		Dados Padroes
		cachorro.mostrarDados();
		cachorro.locomocao();
		System.out.println();
		
		cavalo.mostrarDados();
		cachorro.locomocao();
		System.out.println();
		
		preguica.mostrarDados();
		preguica.locomocao();
		System.out.println();
	}
}

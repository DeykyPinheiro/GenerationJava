package Heranca;

public class MainAnimais {
	
	public static void main(String[] args) {
		
		Cachorro cachorro = new Cachorro();
		Cavalo cavalo = new Cavalo();
		Preguica preguica = new Preguica();
		
		
//		Dados Padroes
		cachorro.mostrarDados();
		cachorro.locomocao();
		cachorro.getSom();
		System.out.println();
		
		cavalo.mostrarDados();
		cavalo.locomocao();
		cavalo.getSom();
		System.out.println();
		
		preguica.mostrarDados();
		preguica.locomocao();
		preguica.getSom();
		System.out.println();
	}
}

package Heranca;

public class Preguica extends Animal{
	
	private String correr = new String();

	public String getCorrer() {
		return correr;
	}

	public void setCorrer(String correr) {
		this.correr = correr;
	}
	
	public Preguica() {
		this.correr = "Subir Arvore";
	}
	
	public void locomocao() {
		
		System.out.println("locomocao: " + getCorrer());
		
	}
	

}

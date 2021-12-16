package Heranca;

public class Preguica extends Animal{
	
	private String correr = new String();

	public String getCorrer() {
		return correr;
	}
	
	@Override
	public String getSom() {
		String som = "Som de preguica";
		return (som);
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

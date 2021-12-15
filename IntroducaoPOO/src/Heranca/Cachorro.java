package Heranca;

public class Cachorro extends Animal{
	
	private String correr = new String();

	public String getCorrer() {
		return correr;
	}

	public void setCorrer(String correr) {
		this.correr = correr;
	}
	
	public Cachorro() {
		this.correr = "correr";
	}
	
	public void locomocao() {
		
		System.out.println("locomocao: " + getCorrer());
		
	}
	

}

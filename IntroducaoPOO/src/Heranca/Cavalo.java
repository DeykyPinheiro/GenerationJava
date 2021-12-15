package Heranca;

public class Cavalo extends Animal{
	
	private String correr = new String();

	public String getCorrer() {
		return correr;
	}

	public void setCorrer(String correr) {
		this.correr = correr;
	}
	
	public Cavalo() {
		this.correr = "correr";
	}
	
	public void locomocao() {
		
		System.out.println("locomocao: " + getCorrer());
		
	}
	

}

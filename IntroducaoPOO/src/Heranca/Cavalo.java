package Heranca;

public class Cavalo extends Animal{
	
	private String correr = new String();

	public String getCorrer() {
		return correr;
	}
	
	@Override
	public String getSom() {
		String som = "onomatopeia cavalo";
		return (som);
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

package Heranca;

public class Cachorro extends Animal{
	
	private String correr = new String();

	public String getCorrer() {
		return correr;
	}
	
	@Override
	public String getSom() {
		String som = "onomatopeia de cachorro";
		return (som);
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

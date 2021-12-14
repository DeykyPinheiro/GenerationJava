
public class Patinete {
	
	private String cor = new String();
	private String dono = new String();
	public String getCor() {
		return cor;
	}
	public void setCor(String cor) {
		this.cor = cor;
	}
	public String getDono() {
		return dono;
	}
	public void setDono(String dono) {
		this.dono = dono;
	}
	
	public Patinete() {
		this.cor = "none";
		this.dono = "Default";
	}
	
	public void showData() {
		System.out.println("dono: " + this.dono);
		System.out.println("cor: " + this.cor	);
	}
	
	
}

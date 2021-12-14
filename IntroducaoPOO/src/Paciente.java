
public class Paciente {
	
	private String paciente = new String();
	private String doenca = new String();
	
	public String getPaciente() {
		return paciente;
	}
	public void setPaciente(String paciente) {
		this.paciente = paciente;
	}
	public String getDoenca() {
		return doenca;
	}
	public void setDoenca(String doenca) {
		this.doenca = doenca;
	}
	
	public Paciente() {
		this.doenca = "NAN";
		this.paciente = "NAN";
	}
	
	public void status() {
		System.out.println("Paciente: " + getPaciente());
		System.out.println("Doenca: " + getDoenca());
	}
	
	
}

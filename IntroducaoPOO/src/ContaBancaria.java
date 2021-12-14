
public class ContaBancaria {
	
	private String nomeCliente = new String();
	private int	deposito;
	private int	saque;
	private int saldo;
	
	public ContaBancaria() {
		this.nomeCliente = "None";
		this.saque = 0;
		this.deposito = 0;
		this.saldo = this.deposito - this.saque;
	}
	 
	public int getSaldo() {
		return (saldo);
	}
	public int getSaque() {
		return (this.deposito - this.saque);
	}
	public void setSaque(int saque) {
		this.saque += saque;
	}
	public int getDeposito() {
		return deposito;
	}
	public void setDeposito(int deposito) {
		this.deposito += deposito;
	}
	
	public String getNomeCliente() {
		return nomeCliente;
	}
	public void setNomeCliente(String nomeCliente) {
		this.nomeCliente = nomeCliente;
	}
	
	
	public void showData()
	{
		System.out.println("Ola, " + getNomeCliente());
		System.out.println("Saque: " + getSaque());
		System.out.println("Deposito: " + getDeposito());
		System.out.println("Saldo: " + getSaldo());
		
	}
	
}

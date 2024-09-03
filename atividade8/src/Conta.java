public class Conta implements Comparable<Conta>{
	private int numero;
	private String titular;
	private float limCredito;
	private float saldo;
	
	public Conta(String titular, int numero, float limCredito, float saldo) {
		this.setTitular(titular);
		this.setNumero(numero);
		this.setLimCredito(limCredito);
		this.setSaldo(saldo);
		
	}
	
	
	
	
	
	
	
	
	
	public int getNumero() {
		return numero;
	}
	
	public void setNumero(int numero) {
		this.numero = numero;
	}
	public String getTitular() {
		return titular;
	}
	public void setTitular(String titular) {
		this.titular = titular;
	}
	public float getLimCredito() {
		return limCredito;
	}
	public void setLimCredito(float limCredito) {
		this.limCredito = limCredito;
	}
	public float getSaldo() {
		return saldo;
	}
	public void setSaldo(float saldo) {
		this.saldo = saldo;
	}

	@Override
	public int compareTo(Conta o) {
		if(this.numero>o.numero) {
			return 1;
		}
		if(this.numero<o.numero) {
			return -1;
		}
		return 0;
		
	}

	@Override
	public String toString() {
		return "Conta [numero=" + numero + ", titular=" + titular + ", limCredito=" + limCredito + ", saldo=" + saldo
				+ "]";
	}
	
	
	
	
	
	
	
}

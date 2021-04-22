package main;

public class Conta {

	private double saldo;
	private int agencia;
	private int numero;
	private Cliente titular;
	private static int total;
	
	public Conta(int agencia, int numero, Cliente titular) {
		Conta.total++;
		if( agencia > 0 && numero >= 0  && titular != null) {
			this.agencia = agencia;
			this.numero = numero;
			this.titular = titular;
		}
	}
	
	public boolean saca(double valor) {
		if(valor <= this.saldo) {
			this.saldo -= valor;
			return true;
		}
		
		return false;
	}
	
	public boolean transfere(double valor, Conta destinatario) {
		if(valor <= this.saldo) {
			this.saldo -= valor;
			destinatario.saldo += valor;
			return true;
		}
		
		return false;

	}
	
	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public int getAgencia() {
		return agencia;
	}

//	public void setAgencia(int agencia) {
//		if(agencia >= 0)
//			this.agencia = agencia;
//	}

	public int getNumero() {
		return numero;
	}

//	public void setNumero(int numero) {
//		if(numero >= 0)
//			this.numero = numero;
//	}

	public Cliente getTitular() {
		return titular;
	}

	public void setTitular(Cliente titular) {
		this.titular = titular;
	}

	public void deposita(double valor) {
		this.saldo += valor;
	}
	
	public static int getTotal() {
		return Conta.total;
	}
	
}

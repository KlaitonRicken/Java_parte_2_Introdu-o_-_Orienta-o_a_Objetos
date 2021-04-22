package main;

public class Conta {

	double saldo;
	int agencia;
	int numero;
	Cliente titular;
	
	public void deposita(double valor) {
		this.saldo += valor;
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
	
}

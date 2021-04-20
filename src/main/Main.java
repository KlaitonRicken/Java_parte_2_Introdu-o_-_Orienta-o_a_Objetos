package main;

public class Main {

	public static void main(String[] args) {
		
		Conta conta = new Conta();
		conta.saldo = 200;
		
		System.out.println(conta.saldo + " R$");
		
		conta.saldo += 100;
		
		System.out.println(conta.saldo + " R$");
		
		Conta conta2 = new Conta();
		
		conta2.saldo = 100;
		
		System.out.println(conta2.saldo + " R$");
		
	}

}

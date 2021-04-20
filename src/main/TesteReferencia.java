package main;

public class TesteReferencia {

public static void main(String[] args) {
		
		Conta conta = new Conta();
		conta.saldo = 200;
		
		System.out.println(conta.saldo + " R$");
		
		Conta conta2 = conta;
		
		System.out.println(conta2.saldo + " R$");
	}
	
}

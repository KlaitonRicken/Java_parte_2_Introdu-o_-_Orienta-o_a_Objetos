package main;

public class Main {

	public static void main(String[] args) {
		
		testandoReferencia();
		
		
	}
	
	public static void testandoReferencia() {
		Conta conta = new Conta();
		conta.saldo = 200;
		
		System.out.println(conta.saldo + " R$");
		
		conta.saldo += 100;
		
		System.out.println(conta.saldo + " R$");
		
		Conta conta2 = new Conta();
		
		conta2.saldo = 100;
		
		System.out.println(conta2.saldo + " R$");
		
		Conta conta3 = new Conta();
		conta.saldo = 200;
		
		System.out.println(conta.saldo + " R$");
		
		Conta conta4 = conta;
		
		System.out.println(conta3.saldo + " R$");
		System.out.println(conta4.saldo + " R$");
		
		conta.deposita(200);
		
		System.out.println(conta.saldo + " R$");
		
		boolean confirmaSaque = conta.saca(150);
		
		System.out.println(confirmaSaque);
		System.out.println(conta.saldo + " R$");
		
		boolean confirmaTransferencia = conta.transfere(150, conta2);
		
		System.out.println(confirmaTransferencia);
		System.out.println(conta.saldo + " R$");
		System.out.println(conta2.saldo + " R$");
		
		Cliente cliente = new Cliente();
		cliente.nome = "Klaiton Ricken";
		cliente.cpf = 38457204;
		cliente.profissao = "dev";
		
		conta.titular = cliente;
		
		System.out.println("Titular: " + conta.titular.nome);
		System.out.println("CPF: " + conta.titular.cpf);
		System.out.println("Profissão: " + conta.titular.profissao);
	}
	
}

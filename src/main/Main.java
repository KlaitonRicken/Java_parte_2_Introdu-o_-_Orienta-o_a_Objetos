package main;

public class Main {

	public static void main(String[] args) {
		criaContas();
		System.out.println("\nTotal conta: " + Conta.getTotal());	
	}
	
	public static void criaContas() {
		//Criando Cliente
		Cliente cliente = new Cliente();
		cliente.setNome("Klaiton Ricken");
		cliente.setCpf(38457204);
		cliente.setProfissao("dev");
		
		//Criando Conta
		Conta conta = new Conta(43,3456,cliente);
		conta.setSaldo(200);
		
		System.out.println(conta.getSaldo() + " R$");
		
		conta.setSaldo(100);
		
		System.out.println(conta.getSaldo() + " R$");
		
		Conta conta2 = new Conta(25,53,cliente);
		
		conta2.setSaldo(300);
		
		System.out.println(conta2.getSaldo() + " R$");
		
		Conta conta3 = new Conta(25,5333,cliente);
		conta.setSaldo(100);;
		
		System.out.println(conta.getSaldo()  + " R$");
		
		Conta conta4 = conta;
		
		System.out.println(conta3.getSaldo()  + " R$");
		System.out.println(conta4.getSaldo()  + " R$");
		
		conta.deposita(200);
		
		System.out.println(conta.getSaldo()  + " R$");
		System.out.println(conta.saca(150));
		System.out.println(conta.getSaldo()  + " R$");
		System.out.println(conta.transfere(150, conta2));
		System.out.println(conta.getSaldo()  + " R$");
		System.out.println(conta2.getSaldo()  + " R$");
		System.out.println("Titular: " + conta.getTitular().getNome());
		System.out.println("CPF: " + conta.getTitular().getCpf());
		System.out.println("Profissão: " + conta.getTitular().getProfissao());
	}
	
}

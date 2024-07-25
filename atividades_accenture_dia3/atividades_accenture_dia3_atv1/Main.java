package atividades_accenture_dia3_atv1;

public class Main {
	public static void main(String[] args) {
		Cliente cliente1 = new Cliente("Pedro", 1234567801, "Joao");
		Cliente cliente2 = new Cliente("Jose", 1098765432, "Maria");
		ContaCorrente conta1 = new ContaCorrente(1, cliente1.getNome(), 1000, "10/10/2010", cliente1);
		ContaCorrente conta2 = new ContaCorrente(2, cliente2.getNome(), 3000, "11/11/2011", cliente2);
		
		conta1.Depositar(200);
		System.out.println(conta1.ExibirExtrato());
		conta1.Sacar(100);
		System.out.println(conta1.ExibirExtrato());
		conta1.Transferir(conta2, 100);
		System.out.println(conta2.ExibirExtrato());
		
		System.out.println(conta1.getNome());
		
	}
}

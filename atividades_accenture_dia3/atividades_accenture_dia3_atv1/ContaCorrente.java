package atividades_accenture_dia3_atv1;

public class ContaCorrente {
	private int numero;
	private String nome;
	private double saldo;
	private String data;
	private Cliente cliente;

	// Optei por colocar string na data pois foi um assunto que ainda não foi
	// apresentado em aula!!
	public ContaCorrente() {

	}

	public ContaCorrente(int numero, String nome, double saldo, String data, Cliente cliente) {
		super();
		this.numero = numero;
		this.nome = nome;
		this.saldo = saldo;
		this.data = data;
		this.cliente = cliente;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getData() {
		return data;
	}

	public void setData(String data) {
		this.data = data;
	}
	
	public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

	public void Depositar(double valor) {
		if (valor <= 0) {
			System.out.println("Valor indisponivel para deposito!");
		} else {
			this.saldo += valor;
		}
	}

	public void Sacar(double valor) {
		if (this.saldo <= 0) {
			System.out.println("Impossivel sacar com a conta zerada!");
		} else if (valor <= 0) {
			System.out.println("Impossivel sacar valor negativo!");
		} else {
			this.saldo -= valor;
		}
	}
	public void Transferir(ContaCorrente cliente, double valor) {
		if (this.saldo <= 0) {
			System.out.println("Impossivel sacar com a conta zerada!");
		} else if (valor <= 0) {
			System.out.println("Impossivel sacar valor negativo!");
		} else {
			this.saldo -= valor;
			cliente.Depositar(valor);
		}
	}

	public double ExibirExtrato() {
		return this.saldo;
	}

}

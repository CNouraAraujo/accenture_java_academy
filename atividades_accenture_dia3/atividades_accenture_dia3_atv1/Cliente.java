package atividades_accenture_dia3_atv1;

public class Cliente {
	private String nome;
	private long cpf;
	// Optei por como int para nao me preocupar com formatacao, caso necessario na
	// main utilizaria uma mascara de formatacao
	private String sobrenome;

	public Cliente(String nome, long cpf, String sobrenome) {
		super();
		this.nome = nome;
		this.cpf = cpf;
		this.sobrenome = sobrenome;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public long getCpf() {
		return cpf;
	}

	public void setCpf(int cpf) {
		this.cpf = cpf;
	}

	public String getSobrenome() {
		return sobrenome;
	}

	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}

}

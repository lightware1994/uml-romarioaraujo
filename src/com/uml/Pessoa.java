package com.uml;

public class Pessoa {
	//Atributos
	private int idPessoa;
	private String nome;
	private String email;
	private String profissao;
	private double altura;
	private double peso;
	private double imc;

	//Construtor
	public Pessoa(int idPessoa) {
		// TODO Auto-generated constructor stub
		this.setIdPessoa(idPessoa);
	}
	
	//Métodos
		public double calcularImc(double altura, double peso) {      
			this.altura = altura;
			this.peso = peso;
			
			//Calculo IMCa
			this.imc = (altura * altura)/peso;
			return this.imc;
		}
		
		public String exibirDiagnostico() {
			if (this.imc < 18.5)
				return "Você está abaixo do peso";
			else if(this.imc < 25)
				return "Você está no peso ideal";
			else if(this.imc < 30)
				return "Você está com excesso de peso";
			else if(this.imc < 35)
				return "Você está com obesidade";
			else 
				return "Você está com obesidade morbida";
			
		}
		public String consultaID(int idPessoa) {
			this.setIdPessoa(idPessoa);
			return "Este meu código ID: " + this.getIdPessoa();
			
		}

	public int getIdPessoa() {
		return idPessoa;
	}

	public void setIdPessoa(int idPessoa) {
		this.idPessoa = idPessoa;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getProfissao() {
		return profissao;
	}

	public void setProfissao(String profissao) {
		this.profissao = profissao;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}

}

package icognitos;


import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Random;


public class Funcionario {
	private String nome; 
	private String email; 
	private Endereco endereco;
	private String cpf;
	private CustomData dataDeAdmissao;
	private CustomData dataDeDemissao;
	private CustomData ultimasFerias;
	private double salarioBase;
	int ferias = 0;
	
	public Funcionario(double salarioBase) {
		super();
		this.salarioBase = salarioBase;
	}

	public String toString() {
		return "\n------------\nFuncionária " + this.getNome()
		+ "\nEmail: " + this.getEmail() 
		+ "\nEndereco: " + this.getEndereco() 
				+ "\nCPF: " + cpf + "\nData de admissao: " + dataDeAdmissao 
				+ "\nSalário: " + salarioBase 
				+ "\nÚltimas férias: " + ultimasFerias;
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


	public String getCpf() {
		return cpf;
	}


	public void setCpf(String cpf) {
		this.cpf = cpf;
	}


	public CustomData getDataDeAdmissao() {
		return dataDeAdmissao;
	}


	public void setDataDeAdmissao(int dia, int mes, int ano) {
		dataDeAdmissao = new CustomData(dia, mes, ano);
	}


	public CustomData getDataDeDemissao() {
		return dataDeDemissao;
	}


	public void setDataDeDemissao(int dia, int mes, int ano) {
		dataDeDemissao = new CustomData(dia, mes, ano);
	}


	public Endereco getEndereco() {
		return endereco;
	}


	public void setEndereco(String rua, int numero, String bairro, String cidade,
			String estado) {
		endereco = new Endereco(rua, numero, bairro, cidade, estado);
	}
	

	public double getSalarioBase() {
		return salarioBase;
	}


	public void setSalarioBase(double salarioBase) {
		this.salarioBase = salarioBase;
	}
	
	
	public CustomData getUltimasFerias() {
		return ultimasFerias;
	}

	public void setUltimasFerias(int dia, int mes, int ano) {
		ultimasFerias = new CustomData(dia, mes, ano);
	}

	
	//Metodos
	public void tirarFerias () {
		CustomData dataAdmissao = getDataDeAdmissao();
		LocalDate compararDataAdmissao = LocalDate.of(dataAdmissao.ano,
				dataAdmissao.mes,  dataAdmissao.dia);
		LocalDate dataAtual = LocalDate.now();
//long quantidadeDeAnos = ChronoUnit.YEARS.between(dataAdmissao, dataAtual);
//long quantidadeDeDias = ChronoUnit.DAYS.between(dataAdmissao, dataAtual);
		long quantidadeDeMeses = ChronoUnit.MONTHS.between(
				compararDataAdmissao, dataAtual);
		
		//Condicao para saber se funcionario tirou ferias nos ultimos 4 meses
		long compararUltimasFerias = 5;
		CustomData ultimasFerias = getUltimasFerias();
		if (ultimasFerias != null) {
			LocalDate dataUltimasFerias = LocalDate.of(ultimasFerias.ano, 
					ultimasFerias.mes, ultimasFerias.dia);
			
			compararUltimasFerias = ChronoUnit.MONTHS.between(
					dataUltimasFerias, dataAtual);
			System.out.println(compararUltimasFerias);
		}

		
		if (quantidadeDeMeses > 11 && compararUltimasFerias >= 4) {
			ferias = 1;
			setUltimasFerias(dataAtual.getDayOfMonth(), dataAtual.getMonthValue(), 
					dataAtual.getYear());
			System.out.println("Férias iniciadas em: " + getUltimasFerias());
		} else {
			System.out.println("Funcionário não pode tirar férias.");
			ferias = 0;
		}
	}
	
	public void podeTrabalhar () {
		if (ferias == 0) {
			System.out.println("Funcionário trabalhando.");
		} else {
			System.out.println("Funcionário está de férias.");
		}
		
	}
	
	public void pedirDemissao () {
		LocalDate dataAtual = LocalDate.now();
		setDataDeDemissao(dataAtual.getDayOfMonth(), dataAtual.getMonthValue(), 
				dataAtual.getYear());
		System.out.println("Funcionário pediu demissão em: " + getDataDeDemissao());
	}
	
	public void solicitarAumento () {
		Random r = new Random();
		int codigo = r.nextInt(20);
		if (codigo == 1 || codigo == 5 || codigo == 10 || codigo == 15) {
			System.out.println("Aumento negado.");
		} else {
			setSalarioBase(getSalarioBase()*0.10 + getSalarioBase());
			System.out.println("Funcionário recebeu aumento de 10%."
					+ "\nSalário atualizado para: R$" + getSalarioBase());
		}
	}
	
	public void contraCheque () {
		System.out.println(getSalarioBase());
	}
}

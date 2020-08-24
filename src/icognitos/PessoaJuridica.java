package icognitos;

public class PessoaJuridica extends Funcionario {

	public PessoaJuridica(double salarioBase) {
		super(salarioBase);
		// TODO Auto-generated constructor stub
	}

	private String cnpj;

	@Override
	public String toString() {
		return "\n------------------\nFuncionária(o) " + this.getNome()
		+ "\nEmail: " + this.getEmail() 
		+ "\nEndereco: " + this.getEndereco() 
				+ "\nCNPJ: " + cnpj+ "\nData de admissao: " + this.getDataDeAdmissao() 
				+ "\nSalário: " + this.getSalarioBase() 
				+ "\nÚltimas férias: " + this.getUltimasFerias();
	}

	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}


	
}

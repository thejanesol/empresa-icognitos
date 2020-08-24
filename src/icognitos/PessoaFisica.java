package icognitos;

public class PessoaFisica extends Funcionario {

	public PessoaFisica(double salarioBase) {
		super(salarioBase);
		// TODO Auto-generated constructor stub
	}

	private String carteiraDeTrabalho;

	public String getCarteiraDeTrabalho() {
		return carteiraDeTrabalho;
	}

	public void setCarteiraDeTrabalho(String carteiraDeTrabalho) {
		this.carteiraDeTrabalho = carteiraDeTrabalho;
	}

}

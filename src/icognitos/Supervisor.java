package icognitos;

import java.time.LocalDate;

public class Supervisor extends PessoaFisica {

	public Supervisor(double salarioBase) {
		super(salarioBase + (salarioBase * 0.8));
	}
	
	public void demitir (Object funcionario) {
		LocalDate dataAtual = LocalDate.now();
		funcionario = new Funcionario(getSalarioBase());
		if ((funcionario instanceof Gerente) ||
				(funcionario instanceof Supervisor)) {
			setDataDeDemissao(dataAtual.getDayOfMonth(), dataAtual.getMonthValue(), 
					dataAtual.getYear());
			System.out.println("Funcionario demitido em: " + getDataDeDemissao());
		} else {
			System.out.println("Não é possível demitir outro gerente ou outro supervisor.");
		}
	}

}


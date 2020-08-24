package icognitos;

import java.time.LocalDate;

public class Gerente extends PessoaFisica {
	
	public Gerente(double salarioBase) {
		super(salarioBase + (salarioBase * 0.12));
	}

	public void demitir (Object funcionario) {
		funcionario = new Funcionario(getSalarioBase());
		LocalDate dataAtual = LocalDate.now();
		if ((funcionario instanceof Gerente)) {
			setDataDeDemissao(dataAtual.getDayOfMonth(), dataAtual.getMonthValue(), 
					dataAtual.getYear());
			System.out.println("Funcionario demitido em: " + getDataDeDemissao());
		} 		
		else {
			System.out.println("Não é possível demitir outro gerente.");
		}
	}	
	
	public void reajusteDeSalario (Object funcionario, Double reajuste) {
		if (funcionario instanceof Gerente == false) {
		if (reajuste > getSalarioBase()) {
			setSalarioBase(reajuste);
		} else {
			System.out.println("Não é possível reduzir o salário do funcionário.");
		}}
			else {
			System.out.println("Gerente não pode ajustar salário de outro gerente.");
		}
	}
	
}
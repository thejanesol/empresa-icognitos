package icognitos;

import java.util.ArrayList;

public class Programa {
	public static void main (String[] args) {
		
		Funcionario Leila = new Funcionario(2000);
		Leila.setNome("Leila");
		Leila.setCpf("080.455.334.80");
		Leila.setEmail("leilacat@hotmail.com");
		Leila.setEndereco("Flamengo", 4, "Bairro da Cruz",
				"Cidade das Flores", "Bahia");
		Leila.setDataDeAdmissao(1, 5, 2018);
		
		Gerente Carla = new Gerente (5000);
		Carla.setNome("Carla");
		Carla.setEmail("carlagerente@empresa.com");
		Carla.setDataDeAdmissao(25, 03, 2018);
		Carla.setEndereco("Flamengo", 3, "Lemes", "Curici", "Batim");
		Carla.setCpf("043.988.655.988.5");
				
		Supervisor Luana = new Supervisor (3000);
		Luana.setNome("Luana");
		Luana.setEmail("luanasup@gmail.com");
		Luana.setCpf("504.568.956.635.5");
		Luana.setDataDeAdmissao(12, 03, 2019);
		Luana.setEndereco("Mares", 1, "Candido", "Flores", "Gloura");
		
		Supervisor Carlos = new Supervisor(3000);
		Gerente Luis = new Gerente (5000);
		Luis.setNome("Luis");
		Carlos.setNome("Carlos");
		
		PessoaJuridica Lucia = new PessoaJuridica(3000);
		Lucia.setEmail("luciajur@gmail.com");
		Lucia.setNome("Lucia");
		Lucia.setCnpj("808046252458");
		Lucia.setDataDeAdmissao(1, 2, 2015);
		
// -------Testes dos métidos------------
//		Luis.demitir(Carla);
//		Carla.tirarFerias();
//		Carla.podeTrabalhar();		
//		Carla.solicitarAumento();
//		Leila.solicitarAumento();
//		Leila.contraCheque();
		
		ArrayList<Funcionario> funcionarios = new ArrayList<> ();
		funcionarios.add(Carla);
		funcionarios.add(Luana);
		funcionarios.add(Luis);
		funcionarios.add(Carlos);
		funcionarios.add(Leila);
		funcionarios.add(Lucia);
		System.out.println(funcionarios);
		

	}	
}


//--------------------------Desafio----------------------
//Desenvolva um sistema para gerenciamento de pessoas em uma empresa.
//
//A empresa Incognitous S.A. Decidiu informatizar a gestão de funcionários e contratou você para implementar um sistema levando em consideração as seguintes necessidades da mesma:
//
//Todo funcionário precisa ter cadastrado o seu endereço, nome, CPF, email, setor, data de admissão e data de demissão.
//
//Criar funcionarios na classe programa (main) + array.
//
//Os funcionários Pessoa Física devem ter o número da carteira de trabalho (NIT) no cadastro deles.
//
//Os funcionários Pessoa Jurídica precisam guardar o CNPJ.
//
//Todo funcionário receberá um salário base
//
//Todo funcionário poderá consultar o contra-cheque
//
//Supervisores e gerentes sempre serão do tipo de funcionário Pessoa Física 
//
//Supervisores e gerentes receberão uma bonificação
//
//A bonificação padrão de um gerente é de 12% do seu salário.
//
//A bonificação padrão de um supervisor é de 8% do seu salário.
//
//Para um funcionário requisitar férias é necessário que o mesmo esteja na empresa há pelo menos 11 meses. 
//
//e que as últimas férias tenham sido tiradas há pelo menos 4 meses.
//
//um gerente pode demitir um funcionário ou um supervisor, mas não é possível demitir outro gerente.
//
//um gerente pode reajustar os salários de um funcionário ou de um supervisor, contanto que o reajuste não implique em redução do salário.
//
//Um supervisor pode demitir um funcionário, mas não pode demitir um gerente e nem outro supervisor.
//
//Um funcionário pode trabalhar, pedir demissão ou solicitar aumento (você precisará implementar uma lógica de escolha aleatória para que o aumento seja ou não aprovado).
//
//Funcionários em estado de férias não devem trabalhar.
//
//Você está livre para implementar outros atributos e métodos nas classes considerando que estes não quebrem nenhuma regra de negócio explicita acima.
//
//Tempo para a implementação: 30 min
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

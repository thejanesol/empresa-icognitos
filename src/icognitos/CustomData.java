package icognitos;

public class CustomData {
	int dia;
	int mes;
	int ano;
	
	public CustomData (int dia, int mes, int ano) {
		this.dia = dia;
		this.mes = mes;
		this.ano = ano;
	}
	
	public String toString () {
		return dia + "/" + mes + "/" + ano;
	}

}

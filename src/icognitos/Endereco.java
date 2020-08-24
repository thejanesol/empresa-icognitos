package icognitos;

public class Endereco {
	private String rua;
	private int numero;
	private String bairro;
	private String cidade;
	private String estado;
	
	public Endereco (String rua, int numero, String bairro, String cidade,
			String estado) {
		this.setRua(rua);
		this.setNumero(numero);
		this.setBairro(bairro);
		this.setCidade(cidade);
		this.setEstado(estado);
	}
	
	public String toString () {
		return "Rua " + rua + ", Nº" + numero + ", " + bairro
				+ ", " + cidade + " - " + estado;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public String getBairro() {
		return bairro;
	}

	public void setBairro(String bairro) {
		this.bairro = bairro;
	}

	public String getRua() {
		return rua;
	}

	public void setRua(String rua) {
		this.rua = rua;
	}

	public String getCidade() {
		return cidade;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}
	
	
}

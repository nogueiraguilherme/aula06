package br.com.db1startrecibo;

public class Endereco {

	private TipoLogadouro tipoLogadouro;
	private String numero;
	private String complemento;
	private String bairro;
	private Integer cep;
	private Cidade cidade;
	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public String getComplemento() {
		return complemento;
	}

	public void setComplemento(String complemento) {
		this.complemento = complemento;
	}

	public String getBairro() {
		return bairro;
	}

	public void setBairro(String bairro) {
		this.bairro = bairro;
	}

	public Integer getCep() {
		return cep;
	}

	public void setCep(Integer cep) {
		this.cep = cep;
	}

	public Cidade getCidade() {
		return cidade;
	}

	public void setCidade(Cidade cidade) {
		this.cidade = cidade;
	}

	public String getCepFormatado() {
		String cepFormatado = cep.toString();
		cepFormatado = cepFormatado.substring (0, 5) + "-" + cepFormatado.substring (5, 8);
		
		return cepFormatado;
		
	}

}

package br.com.db1startrecibo;

import java.util.Date;
import java.util.List;

public class Recibo {

	
	private Integer numero;
	private Double valor;
	private Date dataCadastro;
	private Boolean confirmacao;
	private Date dataEmissao;
	private String dataDoRecibo;
	private Emitente emitente;
	private List<Servico> servico;
	private Cidade cidade;
	private Pagador pagador; 
	
	public String getValorDescrito(){
		return "";
	}
	public String getDataDaEmissao(){
		return "";
	}
}

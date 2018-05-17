package br.com.db1startrecibo;

public class Emitente {

	private String nome;
	private String documento;
	private byte[] assinatura;
	private String documentoCpf;

	public String documentoCpf() {
		return documentoCpf;
	}

	public void setDocumentoCpf(String documento) {
		this.documentoCpf = documento;
	}

	public String getDocumentoCpf() {
		String cpfFormatado = documentoCpf;
		if (cpfFormatado.length() == 11) {
			cpfFormatado = cpfFormatado.substring(0, 3) + "." + cpfFormatado.substring(3, 6) + "."
					+ cpfFormatado.substring(6, 9) + "-" + cpfFormatado.substring(9, 11);
		}

		return cpfFormatado;
	}
}

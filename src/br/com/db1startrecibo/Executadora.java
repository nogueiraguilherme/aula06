package br.com.db1startrecibo;

public class Executadora {
	
	public static void main(String[] args) {
		exibirCepFormatado(87043625);
		exibirCepFormatado(87055555);
		exibirCepFormatado(87033333);
		exibirCepFormatado(87022222);
		exibirCpfFormatado("08316461951");
		
	}

	private static void exibirCepFormatado(Integer cepSemFormatacao) {
		Endereco endereco = new Endereco();
		endereco.setCep(cepSemFormatacao);
		System.out.println(endereco.getCepFormatado());
	}
	
	private static void exibirCpfFormatado(String cpfSemFormatacao){
		Emitente emitente = new Emitente();
		emitente.setDocumentoCpf(cpfSemFormatacao);
		System.out.println(emitente.getDocumentoCpf());
	}

}

package br.com.model;

public enum TipoAtendimento {
	
	LOCACAO("Locação"), DEVOLUCAO("Devolução");
	
	private String descricao;
	
	private TipoAtendimento(String descricao) {
		this.descricao = descricao;
	}

	public String getDescricao() {
		return descricao;
	}
}

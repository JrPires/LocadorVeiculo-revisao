package br.com.rn;

import java.util.ArrayList;
import java.util.List;

import br.com.model.Atendimento;

public class AtendimentoLocacao {

	public List<Atendimento> atendimentosRealizados;

	public AtendimentoLocacao() {
		this.atendimentosRealizados = new ArrayList(atendimentosRealizados);
	}

	public List<Atendimento> realizaAtendimento(Atendimento atendimento) {
		this.atendimentosRealizados.add(atendimento);
		return this.atendimentosRealizados;
	}
}

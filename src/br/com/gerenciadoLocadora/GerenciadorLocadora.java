package br.com.gerenciadoLocadora;

import java.text.ParseException;
import java.text.SimpleDateFormat;

import br.com.model.Atendente;
import br.com.model.Atendimento;
import br.com.model.Cliente;
import br.com.model.TipoAtendimento;
import br.com.model.Veiculo;
import br.com.rn.AtendimentoLocacao;

public class GerenciadorLocadora {

	public static void main(String[] args) throws ParseException{

		AtendimentoLocacao atendimentoLocacao = new AtendimentoLocacao();
		
		Atendimento atendimento = new Atendimento();
		
		Atendente atendente = new Atendente();
		atendente.setNome("Sasa");
		atendente.setMatricula("7895123");
		atendente.setEmail("sasa@gmail.com");
		
		Cliente cliente = new Cliente();
		cliente.setEmail("jpires@gmail.com");
		cliente.setNome("José");
		cliente.setTelefone("83 988357970");
		
		Veiculo veiculo = new Veiculo();
		veiculo.setAno("2019");
		veiculo.setMarca("Honda");
		veiculo.setModelo("CB");
		veiculo.setNome("hornet");
		
		atendimento.setAtendente(atendente);
		atendimento.setCliente(cliente);
		atendimento.setVeiculo(veiculo);
		
		SimpleDateFormat sfd = new SimpleDateFormat("dd/mm/yyyy");
		java.util.Date date = sfd.parse("27/07/2019");
		atendimento.setDataAtendimento(date);
		
		atendimento.setTipoAtendimento(TipoAtendimento.DEVOLUCAO);
		
		atendimentoLocacao.realizaAtendimento(atendimento);
		
		System.out.println("Atendimento realizado com sucesso");
		
		System.out.println("Atendimento " + atendimentoLocacao.atendimentosRealizados);
		
		for (Atendimento a: atendimentoLocacao.atendimentosRealizados) {
			
			a.toString();
		}
	}

}

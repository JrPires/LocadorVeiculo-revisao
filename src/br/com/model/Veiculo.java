package br.com.model;

public class Veiculo {

	public String modelo;
	public String marca;
	public String nome;
	public String ano;
	
	public String getModelo() {
		return modelo;
	}
	
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	
	public String getMarca() {
		return marca;
	}
	
	public void setMarca(String marca) {
		this.marca = marca;
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getAno() {
		return ano;
	}
	
	public void setAno(String ano) {
		this.ano = ano;
	}

	@Override
	public String toString() {
		return "Veiculo [modelo=" + modelo + ", marca=" + marca + ", nome=" + nome + ", ano=" + ano + "]";
	}
}

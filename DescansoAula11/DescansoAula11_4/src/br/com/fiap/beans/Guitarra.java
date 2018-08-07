package br.com.fiap.beans;

public class Guitarra extends InstrumentoMusical{
	private int numeroCordas;
	private String tipoMadeira;
	
	public String exibirTudoGuitarra(){
		return super.exibirTudo() + 
		"Número de Cordas: " + Integer.toString(numeroCordas).concat("\n") + 
		"Tipo de Madeira: " + tipoMadeira.concat("\n");
	}

	public Guitarra(String tipo, String cor, int numeroCordas, String tipoMadeira) {
		super(tipo, cor);
		this.numeroCordas = numeroCordas;
		this.tipoMadeira = tipoMadeira;
	}

	public Guitarra() {
		super();
	}
}

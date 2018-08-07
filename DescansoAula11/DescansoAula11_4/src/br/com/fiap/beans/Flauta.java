package br.com.fiap.beans;

public class Flauta extends InstrumentoMusical{
	private String tipoFlauta;
	private String tipoSom;
	
	public String exibirTudoFlauta(){
		return super.exibirTudo() + 
		"Tipo de Flauta: " + tipoFlauta.concat("\n") + 
		"Tipo de Som: " + tipoSom.concat("\n");
	}

	public Flauta(String tipo, String cor, String tipoFlauta, String tipoSom) {
		super(tipo, cor);
		this.tipoFlauta = tipoFlauta;
		this.tipoSom = tipoSom;
	}

	public Flauta() {
		super();
	}
}

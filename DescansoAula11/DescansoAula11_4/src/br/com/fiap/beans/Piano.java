package br.com.fiap.beans;

public class Piano extends InstrumentoMusical{
	private int numeroOitavas;
	private boolean digital;
	
	public String exibirTudoPiano(){
		return super.exibirTudo() + 
		"N�mero de Oitavas: " + Integer.toString(numeroOitavas).concat("\n") + 
		"� digital? " + Boolean.toString(digital).concat("\n");
	}

	public Piano(String tipo, String cor, int numeroOitavas, boolean digital) {
		super(tipo, cor);
		this.numeroOitavas = numeroOitavas;
		this.digital = digital;
	}

	public Piano() {
		super();
	}
}

package br.com.fiap.beans;

public class InstrumentoMusical {
	private String tipo;
	private String cor;
	
	public String exibirTudo(){
		return "Tipo: " + tipo.concat("\n") + "Cor: " + cor.concat("\n") ;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public InstrumentoMusical(String tipo, String cor) {
		super();
		this.tipo = tipo;
		this.cor = cor;
	}
	
	public InstrumentoMusical() {
		
	}

}

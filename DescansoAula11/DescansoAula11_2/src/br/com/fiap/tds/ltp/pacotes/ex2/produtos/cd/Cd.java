package br.com.fiap.tds.ltp.pacotes.ex2.produtos.cd;

import br.com.fiap.tds.ltp.pacotes.ex2.produtos.Produto;

public class Cd extends Produto {
	private String artista;
	private String album;
	
	public String getArtista() {
		return artista;
	}
	public void setArtista(String artista) {
		this.artista = artista;
	}
	public String getAlbum() {
		return album;
	}
	public void setAlbum(String album) {
		this.album = album;
	}
	
}

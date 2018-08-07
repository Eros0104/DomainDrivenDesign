package br.com.fiap.teste;

import br.com.fiap.beans.Guitarra;
import br.com.fiap.beans.Piano;
import br.com.fiap.beans.Flauta;
import br.com.fiap.beans.InstrumentoMusical;

public class teste {

	public static void main(String[] args) {
		Guitarra jimi = new Guitarra("Cordas", "Roxo", 6, "Maple");
		Piano beethoven = new Piano("Cordas", "Preto", 6, false);
		Flauta cobain = new Flauta("Sopro", "Branco", "Doce", "Soprano");
		
		
		System.out.println(jimi.exibirTudoGuitarra());
		System.out.println(beethoven.exibirTudoPiano());
		System.out.println(cobain.exibirTudoFlauta());
		
		
	}

}

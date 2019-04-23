package br.com.padroes.estrutural.bridge;

public class JanelaWindows implements JanelaImplementada {

	@Override
	public void desenharJanela(String titulo) {
		System.out.println(titulo + "-Janela Windwos");
		
	}

	@Override
	public void desenharBotao(String titulo) {
		System.out.println(titulo + "-Botão Windwos");
		
	}

}

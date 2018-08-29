package br.com.padroes.criacional.bridge;

public class Main {

	public static void main(String[] args) {
		
		JanelaAbstrata janela = new JanelaDialog(new JanelaWindows());
		janela.desenhar();
		
		janela = new JanelaAviso(new JanelaLinux());
		janela.desenhar();
		
		
		
		

	}

}

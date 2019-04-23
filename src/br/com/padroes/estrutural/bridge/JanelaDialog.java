package br.com.padroes.estrutural.bridge;

public class JanelaDialog extends JanelaAbstrata {
	
	

	public JanelaDialog(JanelaImplementada j) {
		super(j);
	
	}

	@Override
	public void desenhar() {
		desenharJanela("Janela de Dialogo");
		desenharBotao("Botao Sim");
		desenharBotao("Botao Não");
		desenharBotao("Botao Cancelar");
		
	}

}

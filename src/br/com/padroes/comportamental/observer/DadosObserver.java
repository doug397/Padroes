package br.com.padroes.comportamental.observer;

public class DadosObserver implements IObserver {

	protected DadosSubject dados;
	public DadosObserver(DadosSubject dados) {
		this.dados = dados;
	}
	
	@Override
	public void update() {
		 System.out.println("Tabela:\nValor A: " + dados.getState().valorA
	                + "\nValor B: " + dados.getState().valorB + "\nValor C: "
	                + dados.getState().valorC);
		
	}

}

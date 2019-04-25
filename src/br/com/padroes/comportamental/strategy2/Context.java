package br.com.padroes.comportamental.strategy2;

public class Context {
	
	private Strategy strategy;
	
	public Context() {
		
	}
	
	public void setStrategy(Strategy strategy) {
		this.strategy = strategy;
	}
	
	public void executarAlgoritmo() {
		strategy.algoritmo();
	}

}

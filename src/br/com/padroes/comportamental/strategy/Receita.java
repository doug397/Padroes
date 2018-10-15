package br.com.padroes.comportamental.strategy;

public class Receita {
	
	public ImpostoStrategy imposto;
	
	public void setImposto(ImpostoStrategy imposto) {
		this.imposto = imposto;
	}

	public Receita() {
		
		
	}
	
	public double resultado() {
		return imposto.calculaImposto();
	}

}

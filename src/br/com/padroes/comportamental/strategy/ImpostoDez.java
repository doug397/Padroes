package br.com.padroes.comportamental.strategy;

public class ImpostoDez implements ImpostoStrategy {

	@Override
	public double calculaImposto() {
		
		return 100 - 10;
	}

}

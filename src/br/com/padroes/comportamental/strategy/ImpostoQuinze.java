package br.com.padroes.comportamental.strategy;

public class ImpostoQuinze implements ImpostoStrategy {

	@Override
	public double calculaImposto() {
		// TODO Auto-generated method stub
		return 100 - 15;
	}

}

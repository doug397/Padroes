package br.com.padroes.criacional.builder;

public class FiatBuilder extends CarroBuilder {

	@Override
	public void buildPreco() {
		// TODO Auto-generated method stub
		carro.preco = 25000.00;
		
	}

	@Override
	public void buildDscMotor() {
		// TODO Auto-generated method stub
		carro.dscMotor ="Fire flex 1.0";
		
	}

	@Override
	public void buildAnoDeFabricacao() {
		// TODO Auto-generated method stub
		carro.anodeFabricacao = 2011;
		
	}

	@Override
	public void buildModelo() {
		// TODO Auto-generated method stub
		carro.modelo ="Palio";
	}

	@Override
	public void buildMontadora() {
		// TODO Auto-generated method stub
		carro.montadora = "Fiat";
		
	}

}

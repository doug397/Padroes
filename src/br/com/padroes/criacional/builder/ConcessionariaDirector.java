package br.com.padroes.criacional.builder;

public class ConcessionariaDirector {
	
	protected CarroBuilder montadora;
	
	public ConcessionariaDirector(CarroBuilder montadora){
		this.montadora=montadora;
	}

	public void construirCarro(){
		montadora.buildPreco();
		montadora.buildDscMotor();
		montadora.buildModelo();
		montadora.buildMontadora();
		montadora.buildAnoDeFabricacao();
	}
	
	public CarroProduto getCarro(){
		return montadora.carro;
	}
}

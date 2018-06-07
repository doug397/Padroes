package br.com.padroes.criacional.factorymethod;

public class Cliente {

	public static void main(String[] args) {
	
		FabricaDeCarro fabrica = new FabricaFord();
		Carro carro =fabrica.criarCarro();
		carro.exibirInfo();
		
		
		
		fabrica= new FabricaFiat();
		carro= fabrica.criarCarro();
		carro.exibirInfo();
		
		
		fabrica= new FabricaChevrolet();
		carro= fabrica.criarCarro();
		carro.exibirInfo();
	}

}

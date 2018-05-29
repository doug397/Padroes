package br.com.padroes.criacional.factorymethod;

public class FabricaFord implements FabricaDeCarro {

	@Override
	public Carro criarCarro() {
	
		return new Fiesta();
	}

}

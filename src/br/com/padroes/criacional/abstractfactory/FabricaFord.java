package br.com.padroes.criacional.abstractfactory;

public class FabricaFord implements FabricaDeCarro {

	@Override
	public CarroSedan criaCarroSedan() {
		// TODO Auto-generated method stub
		return new FiestaSedan();
	}

	@Override
	public CarroPopular criaCarroPopular() {
		// TODO Auto-generated method stub
		return new Fiesta();
	}

}

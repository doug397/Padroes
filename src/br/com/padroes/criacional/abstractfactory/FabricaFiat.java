package br.com.padroes.criacional.abstractfactory;

public class FabricaFiat implements FabricaDeCarro {

	@Override
	public CarroSedan criaCarroSedan() {
		// TODO Auto-generated method stub
		return new SienaSedan();
	}

	@Override
	public CarroPopular criaCarroPopular() {
		// TODO Auto-generated method stub
		return new Siena();
	}

}

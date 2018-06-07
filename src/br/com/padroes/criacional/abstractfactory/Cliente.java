package br.com.padroes.criacional.abstractfactory;

public class Cliente {

	public static void main(String[] args) {
		
		FabricaDeCarro fabrica = new FabricaFiat();
		CarroSedan sedan = fabrica.criaCarroSedan();
		CarroPopular popular = fabrica.criaCarroPopular();
		
		sedan.exibeInfoSedan();
		popular.exibeInfoPupular();
		
		
		fabrica = new FabricaFord();
		sedan = fabrica.criaCarroSedan();
		popular = fabrica.criaCarroPopular();

		sedan.exibeInfoSedan();
		popular.exibeInfoPupular();
	}
}

package br.com.padroes.estrutural.bridge3;

public class Main {

	public static void main(String[] args) {
		
		Ferramenta ferramenta = new FerramentaEletrica();
		Imovel imovel = new Cadeira();
		imovel.setFerramenta(ferramenta);
		
		
		imovel.construir();

	}

}

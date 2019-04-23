package br.com.padroes.estrutural.bridge3;

public class Cadeira extends Imovel {

	@Override
	public void construir() {
		ferramenta.operar();
		
	}

}

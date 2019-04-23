package br.com.padroes.estrutural.bridge3;

public class Mesa extends Imovel {


	@Override
	public void construir() {
		ferramenta.operar();
		
	}

}

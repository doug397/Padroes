package br.com.padroes.estrutural.bridge3;

public abstract class Imovel {
	
	protected Ferramenta ferramenta;
	
	public abstract void  construir();
	
	public void setFerramenta(Ferramenta ferramenta) {
		this.ferramenta = ferramenta;
	}

}

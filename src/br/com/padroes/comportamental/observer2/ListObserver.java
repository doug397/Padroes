package br.com.padroes.comportamental.observer2;

import java.util.List;

public class ListObserver implements Iterator {
	
	private List<Observador> lista;
	private int posicao;
	
	public ListObserver(List<Observador> lista) {
		this.lista = lista;
		this.posicao = 0;
	}

	@Override
	public void first() {
		posicao = 0;
		
	}

	@Override
	public void next() {
		posicao ++;
		
	}

	@Override
	public boolean isDone() {
		return lista.size() == posicao;
	}

	@Override
	public Object currentItem() {
		if(isDone()) {
			posicao = lista.size() -1; 
		}else
			if(posicao < 0) {
				posicao = 0;
			}
		return lista.get(posicao);
	}

}

package br.com.padroes.comportamental.iterator;

import java.util.List;

public class ListIterator implements Iterator {
	
	private List<Object> objetos;
	private int posicao;
	
	public ListIterator(List<Object> objetos) {
		this.objetos = objetos;
		posicao = 0;
	}

	@Override
	public boolean hasNext() {
		if(posicao >= objetos.size() || 
				objetos.get(posicao) == null) {
			return false;
		}
		return true;
	}

	@Override
	public Object next() {
		Object object = objetos.get(posicao);
		posicao ++;
		return object;
	}

}

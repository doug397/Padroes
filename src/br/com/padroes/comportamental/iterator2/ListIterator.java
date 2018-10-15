package br.com.padroes.comportamental.iterator2;

import java.util.List;

public class ListIterator  implements Iterator{
	
	private List<Object> objetos;
	private int posicao ;
	
	public ListIterator(List<Object> objetos) {
		this.objetos = objetos;
		posicao = 0;
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
		return posicao == objetos.size();
	}

	@Override
	public Object currentItem() {
		if(isDone()) {
			posicao = objetos.size() -1;
		}else
			if(posicao <0) {
				posicao = 0;
			}
		
		return objetos.get(posicao);
	}

}

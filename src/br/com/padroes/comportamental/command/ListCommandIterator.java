package br.com.padroes.comportamental.command;

import java.util.List;

public class ListCommandIterator implements Iterator {
	
	private List<ICommand> commands;
	private int posicao;
	
	public ListCommandIterator(List<ICommand> commands) {
		this.commands = commands;
		posicao = 0;
	}
	

	@Override
	public boolean hasNext() {
		if(posicao >= commands.size() || 
				commands.get(posicao) == null) {
			return false;
		}
		return true;
	}

	@Override
	public Object next() {
		ICommand command = commands.get(posicao);
		posicao ++;
		return command;
	}

}

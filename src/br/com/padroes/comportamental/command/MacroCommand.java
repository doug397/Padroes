package br.com.padroes.comportamental.command;

import java.util.ArrayList;
import java.util.List;

public class MacroCommand implements ICommand {
	
	private List<ICommand> commands;
	
	public MacroCommand() {
		commands = new ArrayList<>();
	}
	
	public void addCommand(ICommand command) {
		this.commands.add(command);
	}
	public void removeCommand(ICommand command) {
		this.commands.remove(command);
	}

	@Override
	public void execute() {
		Iterator i = new ListCommandIterator(commands);
		while(i.hasNext()) {
		   ICommand command = (ICommand) i.next();
		   command.execute();
		}
		
	}

	@Override
	public void unexecute() {
		Iterator i = new ListCommandIterator(commands);
		while(i.hasNext()) {
		   ICommand command = (ICommand) i.next();
		   command.unexecute();
		}
		
	}

}

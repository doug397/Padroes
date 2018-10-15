package br.com.padroes.comportamental.command;

public class Application {
	
	ICommand command;
	
	public Application() {}
	

	public void setCommand(ICommand command) {
		this.command = command;
	}
	
	public void executeOperacao() {
		command.execute();
	}
	

}

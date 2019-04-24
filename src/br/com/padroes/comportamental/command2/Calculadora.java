package br.com.padroes.comportamental.command2;

public class Calculadora {
	
	private ICommand command;
	
	public void setICommand(ICommand commad) {
		this.command = commad;
	}
	
	public void operacao() {
		this.command.execute();
	}

}

package br.com.padroes.comportamental.command2;

public class SomaCommand implements ICommand {
	
	private Operacao operacao;
	
	public SomaCommand(Operacao operacao) {
		this.operacao = operacao;
	}

	@Override
	public void execute() {
		operacao.soma();
		
	}

	@Override
	public void unexecute() {
		// TODO Auto-generated method stub
		
	}

}

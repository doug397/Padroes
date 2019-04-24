package br.com.padroes.comportamental.command2;

public class SubtracaoCommand implements ICommand {
	
	private Operacao operacao;
	
	public SubtracaoCommand(Operacao operacao) {
		this.operacao = operacao;
	}


	@Override
	public void execute() {
		operacao.subtracao();
		
	}

	@Override
	public void unexecute() {
		// TODO Auto-generated method stub
		
	}

}

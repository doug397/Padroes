package br.com.padroes.comportamental.command2;

public class MultiplicacaoCommand implements ICommand {
	
	private Operacao operacao;
		
	public MultiplicacaoCommand(Operacao operacao) {
			this.operacao = operacao;
	}


	@Override
	public void execute() {
		operacao.multiplicacao();
		
	}

	@Override
	public void unexecute() {
		// TODO Auto-generated method stub
		
	}

}

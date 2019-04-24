package br.com.padroes.comportamental.command2;

public class DivisaoCommand implements ICommand {
	
    private Operacao operacao;
	
	public DivisaoCommand(Operacao operacao) {
		this.operacao = operacao;
	}


	@Override
	public void execute() {
		operacao.divisao();
		
	}

	@Override
	public void unexecute() {
		// TODO Auto-generated method stub
		
	}

}

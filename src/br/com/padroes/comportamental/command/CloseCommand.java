package br.com.padroes.comportamental.command;

public class CloseCommand  implements ICommand{
	
	private Document document;
	

	public CloseCommand(Document document) {
		super();
		this.document = document;
	}

	@Override
	public void execute() {
		System.out.println("CloseCommand");
		
	}

	@Override
	public void unexecute() {
		// TODO Auto-generated method stub
		
	}

}

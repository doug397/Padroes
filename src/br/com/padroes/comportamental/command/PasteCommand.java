package br.com.padroes.comportamental.command;

public class PasteCommand  implements ICommand{

	private Document document;
	
	
	public PasteCommand(Document document) {
		super();
		this.document = document;
	}

	@Override
	public void execute() {
		
		System.out.println("PasteCommand");
	}

	@Override
	public void unexecute() {
		// TODO Auto-generated method stub
		
	}

}

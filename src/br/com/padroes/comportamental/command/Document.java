package br.com.padroes.comportamental.command;

public class Document {
	
	public void open() {
		System.out.println("Open");
	}
	
	public void close() {
		System.out.println("Close");
	}
	
	
	public void cut() {
		System.out.println("Cut");
	}
	
	public void copy() {
		System.out.println("Copy");
	}
	
	public void paste() {
		System.out.println("Paste");
	}

}

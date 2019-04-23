package br.com.padroes.estrutural.composite;

import java.util.ArrayList;
import java.util.List;

public class ArquivoComposite extends ArquivoComponent {
	
	List<ArquivoComponent> arquivos = new ArrayList<ArquivoComponent>();
	
	public ArquivoComposite(String nomeDoArquivo) {
		this.nomeDoArquivo = nomeDoArquivo;
	}
	
	@Override
	public void printNomeDoArquivo() {
		System.out.println(this.nomeDoArquivo);
		for(ArquivoComponent arquivoTmp : arquivos) {
			arquivoTmp.printNomeDoArquivo();
		}
		
	}

	@Override
	public void adicionar(ArquivoComponent novoArquivo) throws Exception {
		this.arquivos.add(novoArquivo);
	}
	
	@Override
	public void remover(String nomeDoArquivo) throws Exception {
		for(ArquivoComponent arquivoTmp: arquivos) {
			if(arquivoTmp.getNomeDoArquivo() == nomeDoArquivo)
				this.arquivos.remove(arquivoTmp);
		}
		
		throw new Exception("Não Existe este arquivo");
		
	}
	
	@Override
	public ArquivoComponent getArquivo(String nomeDoArquivo) throws Exception {
		for(ArquivoComponent arquivoTmp : arquivos) {
			if(arquivoTmp.getNomeDoArquivo() == nomeDoArquivo) {
				return arquivoTmp;
			}
		}
		
		throw new Exception("Nao existe esse arquivo");
	}

}

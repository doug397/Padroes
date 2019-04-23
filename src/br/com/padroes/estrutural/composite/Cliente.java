package br.com.padroes.estrutural.composite;

/*
 * 
 * if(arquivo instanceof Arquivo){
    // Código para tratar arquivos de video
} else if(arquivo instanceof Pasta){
    // Código para tratar arquivos de audio
}
 */
public class Cliente {

	public static void main(String[] args) {
		
		ArquivoComponent minhaPasta =new ArquivoComposite("Minha Pasta");
		ArquivoComponent meuVideo = new ArquivoVideo("Video 1");
		ArquivoComponent outroVideo = new ArquivoVideo("Outro Video");
		
		try {
			meuVideo.adicionar(outroVideo);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		try {
			minhaPasta.adicionar(meuVideo);
			minhaPasta.adicionar(outroVideo);
			minhaPasta.printNomeDoArquivo();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		try {
			System.out.println("\n PEsquisando Arquivos:");
			minhaPasta.getArquivo(meuVideo.getNomeDoArquivo())
			.printNomeDoArquivo();
			System.out.println("\n Arquivos Atualizados");
			 minhaPasta.remover(meuVideo.getNomeDoArquivo());
		     minhaPasta.printNomeDoArquivo();
		}catch (Exception e) {
			// TODO: handle exception
		}
	

	}

}

package br.com.padroes.criacional.builder2;

public class CadastroArtigo {
	
	public static void main(String[] args) {
		Artigo blog = BlogBuilder.builder()
				.autor("Douglas")
				.titulo("Bloger")
				.assuntos("Outros")
				.totalDePaginas(23)
				.publicadoEm(20,3, 2018)
				.texto("Padrao Builder")
				.build();
		
		
		System.out.println(blog.toString());
		
	       System.out.println(blog.toString());

	        Artigo jornal = JornalBuilder.builder()
	                .autor("Marcio Ballem")
	                .titulo("JornalBuilder")
	                .assuntos("builder pattern", "java")
	                .publicadoEm(25, 5, 2008)
	                .texto("O padrão de projeto builder...")
	                .totalDePaginas(1)
	                .build();

	        System.out.println(jornal.toString());

	        Artigo revista = JornalBuilder.builder()
	                .autor("Marcio Ballem")
	                .titulo("RevistaBuilder")
	                .assuntos("builder pattern", "java")
	                .publicadoEm(25, 5, 2008)
	                .texto("O padrão de projeto builder...")
	                .totalDePaginas(6)
	                .build();

	        System.out.println(revista.toString());
	}

}

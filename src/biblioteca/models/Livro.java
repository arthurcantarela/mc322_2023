package biblioteca.models;

public class Livro extends ItemMultimidiaImpl {
	private String isbn;
	private int edicao;
	
	public Livro(String titulo, String autor, String editora, int anoPublicacao, String genero, String detalhes,
			int copias, String isbn, int edicao) {
		super(titulo, autor, editora, anoPublicacao, genero, detalhes, copias);
		this.isbn = isbn;
		this.edicao = edicao;
	}
}

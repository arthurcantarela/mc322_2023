package biblioteca.models;

abstract public class ItemMultimidiaImpl implements ItemMultimidia {
	private String titulo;
	private String autor;
	private String editora;
	private int anoPublicacao;
	private String genero;
	private String detalhes;
	private int copias;
	private int copiasDisponiveis;
	
    public ItemMultimidiaImpl(String titulo, String autor, String editora, int anoPublicacao, String genero,
			String detalhes, int copias) {
		super();
		this.titulo = titulo;
		this.autor = autor;
		this.editora = editora;
		this.anoPublicacao = anoPublicacao;
		this.genero = genero;
		this.detalhes = detalhes;
		this.copias = copias;
		this.copiasDisponiveis = copias;
	}
	public String getTitulo() {
    	return titulo;
    }
    public String getDetalhes() {
    	return detalhes;
    }
}

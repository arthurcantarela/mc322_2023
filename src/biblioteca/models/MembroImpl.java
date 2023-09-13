package biblioteca.models;

abstract public class MembroImpl implements Membro {
	private String nome;
	private String id;
	private String endereco;
	private String telefone;
	protected int LIMITE_EMPRESTIMO;
	protected int PRAZO_EMPRESTIMO;
	protected double MULTA_ATRASO;
	
    public MembroImpl(String nome, String id, String endereco, String telefone) {
		this.nome = nome;
		this.id = id;
		this.endereco = endereco;
		this.telefone = telefone;
	}
    
	public String getNome() {
    	return nome;
    }
    public String getIdentificacao() {
    	return id;
    }
    public int getLimiteEmprestimo() {
    	return LIMITE_EMPRESTIMO;
    }
    public int getPrazoEmprestimo() {
    	return PRAZO_EMPRESTIMO;
    }
    public double getMultaAtraso() {
    	return MULTA_ATRASO;
    }
}
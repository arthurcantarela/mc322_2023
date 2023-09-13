package biblioteca.models;

public class EstudanteGraduacao extends MembroImpl {

	public EstudanteGraduacao(String nome, String id, String endereco, String telefone) {
		super(nome, id, endereco, telefone);
		LIMITE_EMPRESTIMO = 3;
		PRAZO_EMPRESTIMO = 15;
		MULTA_ATRASO = 1;
	}

}

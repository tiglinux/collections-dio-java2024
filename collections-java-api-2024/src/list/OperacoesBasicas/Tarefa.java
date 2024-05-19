package list.OperacoesBasicas;

/**
 * @author Tiago Santos
 */

public class Tarefa {

	private String descricao;

	public Tarefa(String descricao) {
		this.descricao = descricao;
	}

	public String getDescricao() {
		return descricao;
	}

	@Override
	public String toString() {
		return "Tarefa é : "+ descricao;
	}
}

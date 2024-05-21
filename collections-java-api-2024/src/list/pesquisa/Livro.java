package list.pesquisa;

public class Livro {
	
	private String titulo;
	private String autor;
	private int anoPublicacao;
	
	public Livro(String titulo, String autor, int anoPublicacao) {
		super();
		this.titulo = titulo;
		this.autor = autor;
		this.anoPublicacao = anoPublicacao;
	}

	public String getTitulo() {
		return titulo;
	}

	public String getAutor() {
		return autor;
	}

	public int getAnoPublicacao() {
		return anoPublicacao;
	}
	
	public String toString() {
		return "Livro{"+
				"titulo="+ titulo + '\n'+
				", autor='"+ autor + '\n'+
				", anoPublicacao=" + anoPublicacao+
				'}';
	}
}
